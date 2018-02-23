package examples.lock_egs;

import java.util.HashMap;
import java.util.Map;


public class MapTemplate {

    private static Map<String, String> temp;

    public MapTemplate() {
        temp = new HashMap<String, String>();
        temp.put("string1", "hello");
        temp.put("string2", "world");
    }

    public void sleepMap() {
        synchronized (this.temp) {
            try {
                System.out.println(temp.toString());
                Thread.sleep(30000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getMap() {
        synchronized (this.temp) {
            return temp.toString();
        }
    }
}
