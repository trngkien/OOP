package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class TestStore {
    public static void main(String[] args){ 
        Store store = new Store(); 
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Alters", 87, 19.95f); 
        store.addDVD(dvd1); 
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
        store.addDVD(dvd2); 
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f); 

        store.printStore();
        store.addDVD(dvd3); 
        store.printStore();
        store.removeDVD(1); 
        store.printStore();
    }
}
