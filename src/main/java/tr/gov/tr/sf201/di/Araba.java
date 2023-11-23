package tr.gov.tr.sf201.di;

public class Araba {
    private final Motor motor;

    public Araba(Motor motor) {
        this.motor = motor;
    }

    public void baslat(){
        System.out.println(motor.tipGetir());
    }
}
