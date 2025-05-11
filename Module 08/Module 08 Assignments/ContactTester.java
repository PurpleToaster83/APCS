/*
 * Purpose: to test the Contact class
 * 
 * @version 02/10/2025
 * @author William Van Uitert
 */

public class ContactTester {

    public static void printTable(Contact[] contacts) {
        System.out.println();
        System.out.println("Name\t\tRelation\t\tBirthday\t\tPhone Number\t\t Email");
        for(int i = 0; i < 105; i++) {
            System.out.print("=");
        }
        System.out.println();
        for(Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
    
    public static void insertionNameSort(Contact[] contacts) {
        for(int i = 1; i < contacts.length; i++) {
            Contact currentValue = contacts[i];
            int j = i - 1;
            while(j >= 0 && contacts[j].getName().compareTo(currentValue.getName()) >= 0) {
                //check what j actually does
                contacts[j + 1] = contacts[j];
                j--;
            }
            contacts[j + 1] = currentValue;
        }
    }

    public static void insertionRelationSort(Contact[] contacts) {
        for(int i = 1; i < contacts.length; i++) {
            Contact currentValue = contacts[i];
            int j = i - 1;
            while(j >= 0 && contacts[j].getRelation().compareTo(currentValue.getRelation()) >= 0) {
                //check what j actually does
                contacts[j + 1] = contacts[j];
                j--;
            }
            contacts[j + 1] = currentValue;
        }
    }

    public static String binaryNameSearch(Contact[] contacts, String name) {
        int high = contacts.length;
        int low = -1;
        int probe;

        while(high - low > 1) {
            probe = (high + low) / 2;
            if(contacts[probe].getName().compareTo(name) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }

        if((low >= 0) && (contacts[low].getName().compareTo(name)) == 0) {
            Contact found = contacts[low];
            return found.toString();
        }
        return name + " not Found";
    }

    public static String binaryRelationSearch(Contact[] contacts, String relation) {
        int high = contacts.length;
        int low = -1;
        int probe;

        while(high - low > 1) {
            probe = (high + low) / 2;
            if(contacts[probe].getRelation().compareTo(relation) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }

        if((low >= 0) && (contacts[low].getRelation().compareTo(relation)) == 0) {
            Contact found = contacts[low];
            return relDupSearch(contacts, low, found);
        }
        return relation + " not Found";
    }

    public static String relDupSearch(Contact[] contacts, int low, Contact contact) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && contacts[i].getRelation() == contact.getRelation()) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < contacts.length) && (contacts[i].getRelation() == contact.getRelation())) {
            end = i;
            i++;
        }
        String returnStatment = "";
        for(i = start; i <= end; i++) {
            returnStatment += contacts[i].toString() + "\n";
        }
        return returnStatment;
    }

    public static String birthdaySelectionSearch(Contact[] contacts, String birthday) {
        boolean found = false;
        String response = "";
        for (Contact contact : contacts) {
            if(contact.getBirthday().equals(birthday)) {
                response += contact.toString() + "\n";
                found = true;
            }
        }
        if(!found) {
            return birthday + " Not Found";
        }
        return response;
    }

    public static String numberSelectionSearch(Contact[] contacts, String number) {
        boolean found = false;
        String response = "";
        for (Contact contact : contacts) {
            if(contact.getPhoneNum().equals(number)) {
                response += contact.toString() + "\n";
                found = true;
            }
        }
        if(!found) {
            return number + " Not Found";
        }
        return response;
    }

    public static String emailSelectionSearch(Contact[] contacts, String email) {
        boolean found = false;
        String response = "";
        for (Contact contact : contacts) {
            if(contact.getEmail().equals(email)) {
                response += contact.toString() + "\n";
                found = true;
            }
        }
        if(!found) {
            return email + " Not Found";
        }
        return response;
    }

    public static void main(String[] args) {
        Contact[] contacts = {
            new Contact("Contact A", "Mother", "01/02/2000", "603-100-1000", "contactA@gmail.com"),
            new Contact("Contact B", "Father", "02/04/2001", "603-100-1001", "contactB@gmail.com"),
            new Contact("Contact C", "Sister", "03/06/2002", "603-100-1002", "contactC@gmail.com"),
            new Contact("Contact D", "Brother", "04/08/2003", "603-100-1003", "contactD@gmail.com"),
            new Contact("Contact E", "Friend", "05/10/2004", "603-100-1004", "contactE@gmail.com"),
            new Contact("Contact F", "Sister", "06/12/2005", "603-100-1005", "contactF@gmail.com"),
            new Contact("Contact G", "Friend", "07/14/2006", "603-100-1006", "contactG@gmail.com"),
            new Contact("Contact H", "Brother", "08/16/2007", "603-100-1007", "contactH@gmail.com"),
            new Contact("Contact I", "Co-Worker", "09/18/2008", "603-100-1008", "contactI@gmail.com"),
            new Contact("Contact J", "Co-Worker", "10/20/2009", "603-100-1009", "contactD@gmail.com")
        };

        System.out.println("Original Contact Table:");
        printTable(contacts);
        System.out.println();
        insertionNameSort(contacts);
        System.out.println("Searching for Name");
        System.out.println(binaryNameSearch(contacts, "Contact H"));
        System.out.println(binaryNameSearch(contacts, "Contact Z"));
        System.out.println();
        insertionRelationSort(contacts);
        System.out.println("Searching for Relationship");
        System.out.println(binaryRelationSearch(contacts, "Brother"));
        System.out.println();
        System.out.println("Searching for Birthday");
        System.out.println(birthdaySelectionSearch(contacts, "03/06/2012"));
        System.out.println(birthdaySelectionSearch(contacts, "03/06/2002"));
        System.out.println();
        System.out.println("Searching for Phone Number");
        System.out.println(numberSelectionSearch(contacts, "603-100-1004"));
        System.out.println(numberSelectionSearch(contacts, "605-100-1004"));
        System.out.println();
        System.out.println("Searching for Email");
        System.out.println(emailSelectionSearch(contacts, "contactD@gmail.com"));
        System.out.println(emailSelectionSearch(contacts, "contactZ@gmail.com"));
        System.out.println();


    }
}
