package chapter11_1;

public class Rate1 implements RateInt{
    @Override
    public double taxRate(int gaku) {
        return gaku > 100 ? 0.1 : 0.05;
    }
}
