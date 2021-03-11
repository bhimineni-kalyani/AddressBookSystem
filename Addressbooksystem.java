import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

class Contact {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    public Contact() {

    }
    public Contact(String firstName, String lastName, String address, String city , String state,String zip2, String phoneNumber2, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip2;
        this.phoneNumber = phoneNumber2;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {

        return "Details of: "+ firstName+ " "+lastName+"\n"
                             +"Address: "+address+"\n"
                             +"City: "+city+"\n"
                             +"State: "+state+"\n"
                             +"Zip: "+zip+"\n"
                             +"Phone Number: "+phoneNumber+"\n"
                             +"Email: "+email;
    }
}

public class AddressBook {
    static ArrayList<Contact> list = new ArrayList<Contact>();
    public static AddressBook addressBook = new AddressBook(null);
    public static Contact contact = new Contact();

    static Scanner sc = new Scanner(System.in);
    public static ArrayList<AddressBook> book = new ArrayList<>();
    public HashMap<String, String> citydict = new HashMap<>();
    public HashMap<String, String> statedict = new HashMap<>();
    public int count = 0;

    public AddressBook(String str) {
    }

    public static void defaultBook() {
        book.add(new AddressBook("Address Book 1"));
        book.add(new AddressBook("Address Book 2"));
        book.add(new AddressBook("Address Book 3"));
    }

    public void DefaultContact() {
       book.get(0).list.add(new Contact("Kalyani", "Bhimineni", "Lingayapalem", "Guntur", "Andhra", "522005", "9123456789", "bhiminenikalyani@gmail.com"));
        book.get(1).list.add(new Contact("Kalyani1", "Bhimineni1", "Lingayapalem", "Guntur", "Andhra", "522005", "9123456789", "bhiminenikalyani@gmail.com"));
        book.get(1).list.add(new Contact("Kalyani2", "Bhimineni2", "Lingayapalem", "Guntur", "Andhra", "522005", "9123456789", "kalyanibhimineni@gmail.com"));
        book.get(2).list.add(new Contact("Kalyani3", "Bhimineni3", "Lingayapalem", "Guntur", "Andhra", "522005", "9123456789", "kalyanibhimineni@gmail.com"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void addAddressBook() {
        System.out.print("Enter name of new Address Book: ");
        String str = sc.next();
        book.add(new AddressBook(str));
    }

    public void Searchpersonwithcity() {
        System.out.println("Enter city for the contact info: ");
        String city = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (city.equals(list.get(i).getCity())) {
                System.out.println(list.get(i));
            }
        }
    }

    public void Searchpersonwithstate() {
        System.out.println("Enter state for the contact info: ");
        String state = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (state.equals(list.get(i).getState())) {
                System.out.println(list.get(i));
            }
        }
    }

    public void PersonCityDictionary() {
        for (AddressBook address : book) {
            for (Contact contact : address.list) {
                String name = contact.getFirstName();
                citydict.put(name, contact.getCity());
            }
        }
        System.out.println("Enter the city name to search for contacts: ");
        String city = sc.next();
        for (Entry<String, String> entry : citydict.entrySet()) {
            if (city.equals(entry.getValue())) {
                System.out.println("Names form " + entry.getValue() + " city are: " + entry.getKey());
                count += 1;
            }
        }
        System.out.println("Count of contacts in " + city + " city is: " + count);

    }

    public void PersonStateDictionary() {
        for (AddressBook address : book) {
            for (Contact contact : address.list) {
                String name = contact.getFirstName();
                statedict.put(name, contact.getState());
            }
        }
        System.out.println("Enter the state name to search for contacts: ");
        String state = sc.next();
        for (Entry<String, String> entry : statedict.entrySet()) {
            if (state.equals(entry.getValue())) {
                System.out.println("Names form " + entry.getValue() + " State is: " + entry.getKey());
                count += 1;
            }
        }
        System.out.println("Count of contacts in " + state + " state is: " + count);
    }


    private void AddDetails() {
        System.out.println("How many contats do you want to enter? ");
        int num = sc.nextInt();
        list.add(0, new Contact("Kalyani", "Bhimineni", "Lingayapalem", "Guntur", "Andhra", "522005", "9123456789", "bhiminenikalyani@gmail.com"));

        for (int i = 0; i < num; i++) {
            System.out.println("Enter FirstName");
            String firstName = sc.next();
            
            System.out.println("Enter LastName");
            String lastName = sc.next();
            
            System.out.println("Enter Address");
            String address = sc.next();
            
            System.out.println("Enter CityName");
            String city = sc.next();
            
            System.out.println("Enter StateName");
            String state = sc.next();
            
            System.out.println("Enter ZipCode");
            String zip = sc.next();
            
            System.out.println("Enter PhoneNumber");
            String phoneNumber = sc.next();
            
            System.out.println("Enter Email");
            String email = sc.next();
            if (!firstName.equals(list.get(0).getFirstName())) {
                list.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
                System.out.println(list);
            } else {
                System.out.println("You have already entered this contact");
                break;
            }
        }
        Comparator<Contact> list1 = Comparator.comparing(Contact::getFirstName);
        System.out.println("\n After Sorting the contact details are: \n");
        list.stream()
                .sorted(list1)
                .forEach(System.out::println);
    }

    public void sortbyCity() {
        System.out.println("\n After Sorting the contact details by City : \n");
        List<Contact> SortedList = list.stream()
                .sorted(Comparator.comparing(Contact::getCity))
                .collect(Collectors.toList());
        SortedList.forEach(System.out::println);
    }

    public void sortbyState() {
        System.out.println("\n After Sorting the contact details by State : \n");
        List<Contact> SortedList = list.stream()
                .sorted(Comparator.comparing(Contact::getState))
                .collect(Collectors.toList());
        SortedList.forEach(System.out::println);
    }
    
    public void sortbyZip() {
        System.out.println("\n After Sorting the contact details by Zip : \n");
        List<Contact> SortedList = list.stream()
                .sorted(Comparator.comparing(Contact::getZip))
                .collect(Collectors.toList());
        SortedList.forEach(System.out::println);
    }

    public static String Edit() {
        String name;
        System.out.println("Enter First Name of Details to be Edited: ");
        name = sc.next();

        if (name.equals(list.get(0).getFirstName())) {
            System.out.println("Enter FirstName");
            list.get(0).setFirstName(sc.next());
            
            System.out.println("Enter LastName");
            list.get(0).setLastName(sc.next());
            
            System.out.println("Enter Address");
            list.get(0).setAddress(sc.next());
            
            System.out.println("Enter CityName");
            list.get(0).setCity(sc.next());
            
            System.out.println("Enter StateName");
            list.get(0).setState(sc.next());
            
            System.out.println("Enter ZipCode");
            list.get(0).setZip(sc.next());
            
            System.out.println("Enter PhoneNumber");
            list.get(0).setPhoneNumber(sc.next());
            
            System.out.println("Enter Email");
            list.get(0).setEmail(sc.next());

            System.out.println(list.get(0));
            return "Contact Edited";
        } 
        else {
            return "Name Not Available in List";
        }
    }

    public static String Delete() {
        String name;
        System.out.print("Enter FirstName");
        name = sc.next();

        if (name.equals(list.get(0).getFirstName())) {
            list.remove(0);
            return "Deleted";
        } 
        else {
            return "Name Not Available in List";
        }
    }

    public static void main(String[] args) {
            System.out.println("Welcome To Address Book Problem\n");

            AddressBook address = new AddressBook(null);

            System.out.print("1.Add AddressBook \n2.Add Contact \n3.Delete \n4.Edit \n5.Search_Person_with_city " +
                    "\n6.Search_Person_with_State \n7.PersonCityDictionary+count \n8.PersonStateDictionary+count" +
                    "\n9.sort_by_City\n10.sort_by_State\n11.sort_by_Zip");
            int check=sc.nextInt();
            switch(check) {
                case 1:
                            addAddressBook();
                            break;
                case 2:
                            address.AddDetails();
                            break;
                case  3:
                            Delete();
                            for(int i=0; i<list.size(); i++) {
                                System.out.println(list.get(i));
                            }
                            break;
                case 4:
                            Edit();
                            for(int i=0; i<list.size(); i++) {
                                System.out.println(list.get(i));
                            }
                            break;
                case 5:
                            address.defaultBook();
                            address.DefaultContact();
                            address.Searchpersonwithcity();
                            break;
                case 6:
                            address.defaultBook();
                            address.DefaultContact();
                            address.Searchpersonwithstate();
                            break;
                case 7:
                            address.defaultBook();
                            address.DefaultContact();
                            address.PersonCityDictionary();
                            break;
                case 8:
                            address.defaultBook();
                            address.DefaultContact();
                            address.PersonStateDictionary();
                            break;
                case 9:
                            address.defaultBook();
                            address.DefaultContact();
                            address.sortbyCity();
                            break;
                case 10:
                            address.defaultBook();
                            address.DefaultContact();
                            address.sortbyState();
                            break;
                case 11:
                            address.defaultBook();
                            address.DefaultContact();
                            address.sortbyZip();
                            break;
                default:
                            System.out.println("Invalid choice");
            }
        }
    }
}
