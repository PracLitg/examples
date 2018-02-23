package examples.lock_egs;

public class lock_tests {

    public static void main(String[] args) {
        MapTemplate mapTemplate = new MapTemplate();
        RunnableDemo r1 = new RunnableDemo("thread_1", mapTemplate);
        r1.start();
        RunnableDemo2 r2 = new RunnableDemo2("thread_2", mapTemplate);
        r2.start();
    }
}
