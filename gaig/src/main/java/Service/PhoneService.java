package Service;

import model.Phone;

import java.util.List;

public interface PhoneService {
    public List<Phone> getAllPhones();
    public  Phone creatPhone(Phone phone);
    public void updatePhone(Phone phone);
    public void deletePhone(Phone phone);

}
