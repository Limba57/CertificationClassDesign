package OverLoadingVSOverWritting;

public class Eagle extends Bird {


    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }

    public Integer eat(Integer amount) {
        return amount;
    }
}
