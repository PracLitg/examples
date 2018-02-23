package examples.exception_demos;

public class DemoTest {

    public static void main(String[] args) {
        /*SecondLayer secondLayer = new SecondLayer();
        int res;
        try {
            res = secondLayer.displayException();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        FirstLayer firstLayer = new FirstLayer();
        try {
            firstLayer.displayException();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
