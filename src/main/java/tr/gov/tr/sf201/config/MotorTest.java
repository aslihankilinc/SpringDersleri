package tr.gov.tr.sf201.config;

import org.junit.jupiter.api.Test;
import tr.gov.tr.sf201.di.Motor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorTest {
    @Test
    public  void tipGetirTest(){
        Motor motor=new Motor("Bezinli");
     assertEquals("Benzinli",motor.tipGetir());
    }


}
