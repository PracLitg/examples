package examples.lock_egs;

public class RunnableDemo2 implements Runnable {

    private Thread thread;
    private String threadName;
    private MapTemplate mapTemplate;

    public RunnableDemo2(String name, MapTemplate template) {
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
        System.out.println("Running " + this.threadName);
        System.out.println(mapTemplate.getMap());
    }
}
