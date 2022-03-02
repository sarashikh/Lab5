package icedCapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @Autowired
    private BuddyInfoRepository buddyInfoRepository;

    @PostMapping("/addBuddy")
    public AddressBook buddy(@RequestParam(name="name") String name,@RequestParam (name ="age")int age,@RequestParam(name="number")String phoneNumber, @RequestParam(name="id") Long id) { // if no name value then it will say world
        BuddyInfo b = new BuddyInfo(name, age, phoneNumber);
        Optional<AddressBook> a = addressBookRepository.findById(id); //optional: candy wrapper w addressBook as candy
        if(a.isPresent()){ // check the candy (if theres candy)
            AddressBook candy = a.get();
            candy.addBuddy(b);
            addressBookRepository.save(candy);
            return candy;
        }
        return null;
    }

    @DeleteMapping("/removeBuddy")
    public AddressBook removeBuddy(@RequestParam(name="buddyId")Long buddyId, @RequestParam(name="addressBookId") Long addyId){

        Optional<AddressBook> a = addressBookRepository.findById(addyId);//finding the addressbook Id from the database
        Optional<BuddyInfo> buddy = buddyInfoRepository.findById(buddyId); // finding the buddy Id from the database
        if(a.isPresent() && buddy.isPresent()){
            AddressBook candy = a.get(); //get the addressbook candy
            BuddyInfo candy2 = buddy.get(); // get the buddy candy
            candy.removeBuddy(candy2);
            addressBookRepository.save(candy); // save the new addressbook now w/o the buddy
            return candy;
        }
        return null;
    }


}

