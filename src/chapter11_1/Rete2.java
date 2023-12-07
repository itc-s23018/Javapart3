package chapter11_1;

public class Rete2 implements RateInt{

    @Override
    public double taxRate(int gaku) {
        return gaku > 80 ? 0.12 : 0.04;
    }
}
