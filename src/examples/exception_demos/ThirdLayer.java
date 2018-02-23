package examples.exception_demos;

public class ThirdLayer {

    private int num, num1;

    public ThirdLayer() {
        this.num = 10;
        this.num1 = 0;
    }

    public int divideError() throws Exception {
        if (this.num1 == 0) {
            throw new Exception("除数不能为0");
        }
        return this.num1 / this.num1;
    }
}
