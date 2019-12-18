package Service;

import Repository.PhoneRepo;
import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl implements  PhoneService{
    @Autowired
    private
    PhoneRepo repo;
    @Override
    public List<Phone>getAllPhones() {
       return  repo.findAll();
    }

    @Override
    public Phone creatPhone(Phone phone) {
        return repo.save(phone);
    }

    @Override
    public void updatePhone(Phone phone) {
        repo.saveAndFlush(phone);

    }

    @Override
    public void deletePhone(Phone phone) {
        repo.delete(phone);

    }
}
