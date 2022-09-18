import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.*;

public class Main {

    static ContactManager cManager = new ContactManager();

    public static void main(String[] args) {
        try {
            loadContacts("contacts.txt");
            System.out.println("CONTACTS LOADED\n\n");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        }
    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     * • 1. Starts a new instance of Scanner;
     * • 2. In an infinite loop, the user can choose to a) add b) remove a contact
     * c) exit.
     * • case a: ask for the name, phone number and birthDate.
     * • case b: ask who they'd like to remove.
     * • case c: break the loop.
     * • 3. close Scanner.
     */

    /**
     * Name: loadContacts
     * 
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     *                               Inside the function:
     *                               • 1. loads contacts from <fileName>;
     *                               • 2. From the manager object, it adds all
     *                               contacts to the contacts list.
     *                               Hint: use scan.next to grab the next String
     *                               separated by white space.
     * @throws ParseException
     */

    public static void loadContacts(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        try {
            while (sc.hasNextLine()) {
                Contact contact = new Contact(sc.next(), sc.next(), sc.next());
                cManager.addContact(contact);
            }

        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
