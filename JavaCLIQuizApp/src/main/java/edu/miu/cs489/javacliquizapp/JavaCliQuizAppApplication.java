package edu.miu.cs489.javacliquizapp;

import edu.miu.cs489.javacliquizapp.model.Contact;

public class JavaCliQuizAppApplication {

    public static void main(String[] args) {
        Contact contact1 = new Contact("David", "Sanger", "Argos LLC", "Sales Manager");
        contact1.addPhoneNumber("240-133-0011", "Home");
        contact1.addPhoneNumber("240-112-0123", "Mobile");
        contact1.addEmailAddress("dave.sang@gmail.com", "Home");
        contact1.addEmailAddress("dsanger@argos.com", "Work");

        Contact contact2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");

        Contact contact3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        contact3.addPhoneNumber("412-116-9988", "Work");
        contact3.addEmailAddress("ali@bmi.com", "Work");

        System.out.println("Contact 1:");
        System.out.println(contact1);

        System.out.println("\nContact 2:");
        System.out.println(contact2);

        System.out.println("\nContact 3:");
        System.out.println(contact3);
    }
}
