package examples.final_demo;

import java.util.HashMap;
import java.util.Map;

public class DemoClass {

    private static Map<String, String> demo = new HashMap<>();
    private int num;
    private String test;

    public void addValue(String key, String value) {
        demo.put(key, value);
    }

    public int getSize() {
        return demo.size();
    }

    public String getValue(String key) {
        return demo.get(key);
    }

    public int getNum() {
        return num;
    }

    public String getTest() {
        return test;
    }
}
