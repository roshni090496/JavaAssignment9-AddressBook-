package com.company;
import java.util.ArrayList;
import java.util.List;
public class AddressBookMain {

    static List<AddressBook> addressList = new ArrayList();

        public static void addAddress(AddressBook address){
            addressList.add(address);
            System.out.println("address " + address + "added successfully");
        }

        public static void editAddress(String name, AddressBook addressBook){
            String names[] = name.split(" ");
            String firstName = names[0];
            String lastName = names[1];
            for(AddressBook book: addressList){
                if(book.getFirstName().equals(firstName) && book.getLastName().equals(lastName)){
                    book = addressBook;
                    System.out.println("address with name " + name +"after editing " + book );
                    break;
                }
            }

        }
        public static AddressBook searchAnAddress(String name){
            String names[] = name.split(" ");
            String firstName = names[0];
            String lastName = names[1];
            for(AddressBook book: addressList){
                if(book.getFirstName().equals(firstName) && book.getLastName().equals(lastName)){

                    return  book;
                }
            }
            return null;
        }
        public static void deleteAddress(String name){
            String names[] = name.split(" ");
            String firstName = names[0];
            String lastName = names[1];
            for (AddressBook book: addressList){
                if(book.getFirstName().equals(firstName) && book.getLastName().equals(lastName)){
                    addressList.remove(book);
                    System.out.println("address with name " +name + "removed successfully" );
                    break;
                }
            }

        }

        public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.setFirstName("Rahul");
        addressBook.setLastName("Dravid");
        addressBook.setAddress("Indra Nagar");
        addressBook.setEmail("rahul.dravid@bcici.com");
        addressBook.setCity("Bangalore");
        addressBook.setState("Karnataka");
        addressBook.setPhoneNo(1235L);
        addressBook.setZip(560038L);

        AddressBook addressBook1 = new AddressBook();
        addressBook1.setFirstName("Sachin");
        addressBook1.setLastName("Tendulkar");
        addressBook1.setAddress("Indra Nagar");
        addressBook1.setEmail("sachin.tendulkar@bcici.com");
        addressBook1.setCity("Bangalore");
        addressBook1.setState("Karnataka");
        addressBook1.setPhoneNo(1235L);
        addressBook1.setZip(560038L);

        // add an address
        //  AddressBookMain m1 = new AddressBookMain();
        addAddress(addressBook);
        addAddress(addressBook1);

        // edit an address edit sachin Tendulkar to Arjun Tendulkar

        String nameToBeEdited = "Sachin Tendulkar";
        AddressBook addressToEdit = searchAnAddress(nameToBeEdited);

        if(addressBook != null){
            addressToEdit.setFirstName("Arjun"); // we can edit any field
            editAddress(nameToBeEdited, addressToEdit);
        }

        // delete rahul dravid from list
        String nameToBeRemoved = "Rahul Dravid";
        deleteAddress(nameToBeRemoved);

        System.out.println("### actual address book list present " + addressList);

    }

}

