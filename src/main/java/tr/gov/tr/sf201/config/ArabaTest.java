package tr.gov.tr.sf201.config;

import org.junit.jupiter.api.Test;
import tr.gov.tr.sf201.di.Araba;
import tr.gov.tr.sf201.di.Motor;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArabaTest {
    @Test
    public void baslatTest(){
        Motor mockMotor=new Motor("Benzinli");
        Araba araba =new Araba(mockMotor);
        assertNotNull(araba);
    }
}
