package icedCapp;

import javax.persistence.*;


@Entity
public class BuddyInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) //tells spring to generate the value of id
    private Long id; //primary key in the schema
    private String name;
    private int age;
    private String phoneNumber;
    private String address;

    public BuddyInfo(String name, int age, String phoneNumber, String address) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address= address;
    }

    public BuddyInfo(){ }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", PhoneNumber:  " + this.phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}