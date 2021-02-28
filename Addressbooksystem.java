import java.io.*;
import java.util.*;
public static class AddressBookSystem {
 public class contact {
    public String firstname, lastname;
    public String address, city, state;
    public String zip;
    public String phonenumber;
    public String email;
    public contact(String firstname, String lastname, 
                   String address, String city, String state, 
                   String zip, 
                   String phonenumber, 
                   String email) {
                   this.firstname = firstname;
                   this.lastname = lastname;
                   this.address = address;
                   this.city = city;
                   this.state = state;
                   this.zip = zip;
                   this.phonenumber = phonenumber;
                   this.email = email;
    }             
    public String toString() {
        return "Name : " + firstname + "  " + lastname +
               "\nAddress : " + address + "  " + city + "  " + state +
               "\nZip : " + zip +
               "\nPhonenumber : " + phonenumber + 
               "\nEmail : " + email ;
    }
 }
 class AddressBookSystem {
    static ArrayList<contact> list = new ArrayList<contact>();
    static Scanner sc = new Scanner(System.in);
      public static void addcontact() {
        String firstname, lastname, address, city, state, zip, phonenumber, email;
        Scanner sc = new Scanner(System.in);
        String check = "y";
        while(check.equals("y") || check.equals("Y")) {
           System.out.println("Enter firstname : ");
           firstname = sc.nextLine();
           System.out.println("Enter lastname : ");
           lastname = sc.nextLine();
           System.out.println("Enter address : ");
           address = sc.nextLine();
           System.out.println("Enter city : ");
           city = sc.nextLine();
           System.out.println("Enter state : ");
           state = sc.nextLine();
           System.out.println("Enter zip : ");
           zip = sc.nextLine();
           System.out.println("Enter phonenumber : ");
           phonenumber = sc.nextLine();
           System.out.println("Enter email : ");
           email = sc.nextLine();
           System.out.println("Do you want to add more contacts(y/n) : ");
           check = sc.nextLine();
           System.out.println();
           list.add( new contact(firstname, lastname, address, city, state, zip, phonenumber, email));
        }
     } 
 }
