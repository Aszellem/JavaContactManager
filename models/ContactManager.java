package models;

import java.text.ParseException;
import java.util.ArrayList;

public class ContactManager {
    ArrayList <Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index) throws ParseException{
        return new Contact(contacts.get(index));
    }

    public void setContact(Contact contact, int index) throws ParseException{
        contacts.set(index, new Contact(contact));
    }

    public void addContact(Contact contact) throws ParseException{
        contacts.add(new Contact(contact));
    }

    public void removeContact(String name){
        if(contacts.isEmpty()){
            throw new IllegalStateException("The contact list is empty");
        }
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getName().equals(name)){
                contacts.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (int j = 0; j < contacts.size(); j++) {
            temp += contacts.get(j).toString();
            temp += "\n\n";
        }
        return temp;
    }

    
   
} 
