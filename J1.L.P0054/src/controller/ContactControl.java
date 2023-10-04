
package controller;

import java.util.ArrayList;
import model.Contact;
import repository.ContactManager;
import repository.IContactManager;
import view.Menu;


public class ContactControl extends Menu {

    private ArrayList<Contact> contactList;
    IContactManager mn;
    static String[] mc = {"Add a Contact", "Display all Contact", "Delete a Contact", "Exit"};

    public ContactControl() {
        super("Contact Program", mc);
        mn = new ContactManager();
        contactList = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 :{
                mn.addContact(contactList);
                break;
            }
            case 2 :{
                mn.showAll(contactList);
                break;
            }
            case 3 :{
                mn.deleteContact(contactList);
                break;
            }
            case 4 :{
                System.exit(0);
                break;
            }
        }
    }

}
