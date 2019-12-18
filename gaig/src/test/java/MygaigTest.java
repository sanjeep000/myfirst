import Repository.PhoneRepo;
import Service.PhoneServiceImpl;
import model.Phone;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import util.MyGaigApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MygaigTest {
    @Autowired
    private PhoneRepo impl;

    @Test
    public void contextLoad(){
        Phone phone=new Phone();
        phone.setId(4);
        phone.setName("samsung");
        phone.setBrand("tom");
        phone.setPrice(1000);
        impl.save(phone);
    }
}
