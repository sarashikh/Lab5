//import icedCapp.AddressBook;
//import icedCapp.BuddyInfo;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class AddressBookTest {
//
//    private BuddyInfo b;
//    private BuddyInfo b2;
//    private AddressBook l;
//    private AddressBook l2;
//    @Before
//    public void setUp() {
//        b = new BuddyInfo ("John",20,"613-203-2394");
//        b2 = new BuddyInfo ("Mary",15,"613-203-2344");
//        l = new AddressBook();
//        l2 = new AddressBook();
//        l.addBuddy(b);
//        l2.addBuddy(b2);
//    }
//
//    @Test
//    public void testSize() {
//        assertEquals("Test failed. This should be:",1, l.size());
//    }
//
//    @Test
//    public void testClear() {
//        l.clear();
//        assertEquals("Test failed. This should be:","[]", l.getList().toString());
//    }
//
//    @Test
//    public void testAddBuddy() {
//        assertEquals("Test failed. This should be:","["+ b.toString()+"]", l.getList().toString());
//    }
//
//    @Test
//    public void testRemoveBuddy() {
//        l.addBuddy(b2);
//        l.removeBuddy(1);
//        assertEquals("Test failed. This should be:","["+ b.toString()+"]", l.getList().toString());
//    }
//
//
//
//
//
//
//}