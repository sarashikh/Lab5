package icedCapp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @OneToMany( cascade = CascadeType.ALL)
    private List<BuddyInfo> buddyInfo;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public AddressBook() {
        this.buddyInfo = new ArrayList<BuddyInfo>();
    }

    public List<BuddyInfo> getBuddyInfo() {
        return buddyInfo;
    }
    public void setBuddyInfo(List<BuddyInfo> buddyInfo) {
        this.buddyInfo = buddyInfo;
    }

    public void addBuddy(BuddyInfo aBuddyInfo) {
        if(aBuddyInfo != null) {
            buddyInfo.add(aBuddyInfo);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
//        if(index >=0 && index < buddyInfo.size()) {
//            buddyInfo.remove(index);
//        }
        buddyInfo.remove(buddy);
    }



    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Sara", 20, "613-234-2344", "527 Address St");
        BuddyInfo b = new BuddyInfo("Jack", 20, "613-234-2344", "20 Avenue Ave");
        BuddyInfo b1 = new BuddyInfo("Mary", 20, "613-234-2344", "78 Carling Bulv");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(b);
        addressBook.addBuddy(b1);
    }
}