package Controllers;

import Service.PhoneServiceImpl;
import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class PhoneController {

    @Autowired
    PhoneServiceImpl phoneImpl;

    @GetMapping
    public List<Phone> getAllPhone() {
       return  phoneImpl.getAllPhones();
    }

    @PostMapping("/put")
    public Phone createPhone(@RequestBody Phone phone){
        return phoneImpl.creatPhone(phone);
    }
}
