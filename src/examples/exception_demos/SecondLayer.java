package examples.exception_demos;

public class SecondLayer {

    private ThirdLayer thirdLayer;

    public SecondLayer() {
        this.thirdLayer = new ThirdLayer();
    }

    public int displayException() throws Exception {
        int res;
        try {
           res = this.thirdLayer.divideError();
        } catch (Exception e) {
            //e.printStackTrace();
            throw new Exception("第二层：除数为0", e);
        }
        return res;
    }
}
