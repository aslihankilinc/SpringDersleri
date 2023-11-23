package tr.gov.tr.sf201;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.gov.tr.sf201.di.Araba;

@SpringBootTest
class Sf201ApplicationTests {
    @Autowired
    private Araba araba;
    @MockBean
    private Araba mockAraba;
    @Test
    void contextLoads() {
    }
    @Test
    void arabaBaslatIsCalled(){
        araba.baslat();
        Mockito.verify(mockAraba,Mockito.times(1)).baslat();
    }
}
