package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();

        // Create a new Contact object for Alina
        Contact contact1 = new Contact();
        contact1.name = "Alina";
        contact1.phoneNumber = "0777 77 90 97";
        myContactsManager.addContact(contact1);

        // Create a new Contact object for Betul
        Contact contact2 = new Contact();
        contact2.name = "Betul";
        contact2.phoneNumber = "0555 51 91 71";
        myContactsManager.addContact(contact2);

        // Create a new Contact object for Bermet
        Contact contact3 = new Contact();
        contact3.name = "Bermet";
        contact3.phoneNumber = "0556 56 43 56";
        myContactsManager.addContact(contact3);

        // Create a new Contact object for Akylay
        Contact contact4 = new Contact();
        contact4.name = "Akylay";
        contact4.phoneNumber = "0707 90 90 97";
        myContactsManager.addContact(contact4);

        // Search for Omid and print his phone number to screen
        Contact result = myContactsManager.searchContact("Alina");
        System.out.println(result.name + ": " + result.phoneNumber);

    }
}
