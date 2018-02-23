package examples.lock_egs;

public class RunnableDemo implements Runnable {

    private Thread thread;
    private String threadName;
    private MapTemplate mapTemplate;

    public RunnableDemo(String name, MapTemplate template) {
        this.threadName = name;
        this.mapTemplate = template;
    }

    public void start() {
        System.out.println("Starting " + this.threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

    public void run() {
        System.out.println("Running " + threadName);
        mapTemplate.sleepMap();
    }

}
