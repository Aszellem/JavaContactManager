package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {
    private String name;
    private String birthDate;
    private String phoneNumber;
    private int age;

    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    Date date = new Date(System.currentTimeMillis());

    public Contact(String name, String birthDate, String phoneNumber) throws ParseException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be null/blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number can't be less than 5 characters");
        }

        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) throws ParseException {
        this.name = source.name;
        this.birthDate = source.birthDate;
        this.phoneNumber = source.phoneNumber;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be null/blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number can't be less than 5 characters");
        }
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 
     * @param birthDate
     * @return
     * @throws ParseException
     * 
     *                        Inside function: Calculate the age of the contact from
     *                        the birth date and the current
     *                        date difference
     */

    public int toAge(String birthDate) throws ParseException {
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(date));
        int age = (d2 - d1) / 10000;
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Phone number: " + this.phoneNumber + "\n" +
                "Birth Date: " + this.birthDate + "\n" +
                "Age: " + this.age + " year old\n";
    }

}
