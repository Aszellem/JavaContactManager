import java.text.ParseException;

import models.*;

public class Main {
    public static void main(String[] args) {
        try {
            ContactManager cManager = new ContactManager();
            cManager.addContact(new Contact("Ryan", "11/11/1992", "6135012424"));
            cManager.addContact(new Contact("Gio", "11/11/1994", "6477092344"));
            cManager.addContact(new Contact("Thomas", "11/11/1993", "8192256979"));
            cManager.removeContact("Gio");
            System.out.println(cManager);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Kész");
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
     */

}
