package icedCapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class AddressBookViewController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @GetMapping("/addressBookView")
    public String viewAddressBook(@RequestParam(name="id") Long addyId, Model model) { // if no name value then it will say world
        model.addAttribute("addyId", addyId); //creating variable for the HTML to use
        Optional<AddressBook> a = addressBookRepository.findById(addyId); //optional: candy wrapper w addressBook as candy
        if(a.isPresent()){
            AddressBook candy = a.get();
            model.addAttribute("buddyInfo", candy.getBuddyInfo()); //gets list of buddy info
        }
        else {
            model.addAttribute("buddyInfo", new ArrayList<BuddyInfo>()); //since empty making empty buddy info
        }


        return "addressBookView";
    }

}

