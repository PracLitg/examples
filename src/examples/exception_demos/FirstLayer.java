package examples.exception_demos;

public class FirstLayer {

    private SecondLayer secondLayer;

    public FirstLayer() {
        secondLayer = new SecondLayer();
    }

    public void displayException() throws Exception {
        try {
            this.secondLayer.displayException();
        } catch (Exception e) {
            //System.out.println("First Layer Error");
            throw new Exception("第一层：除数为0", e);
        }
    }
}
