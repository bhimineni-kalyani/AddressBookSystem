// Data class
public class Data {
    private String firstName = null;
    private String lastName = null;
    private String email = null;
    public Data(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return String.format(firstName+" "+lastName+" "+email);
    }
}

class AddressBook {
    private static List<Data> contact = new ArrayList<Data>();
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int menu;
        String choice;
        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Person contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Outprint contact. ");
        System.out.println(" 4. Delete contact. ");
        menu = sc.nextInt();
        while (menu != 0) {
          switch (menu) {
            case 1:
                while (menu != 2) {
                    System.out.println("Enter First Name: ");
                    String firstName = sc.next();
                    System.out.println("Enter Last Name: ");
                    String lastName = sc.next();
                    System.out.println("Enter email: ");
                    String email = sc.next();
                    contact.add(new Data(firstName, lastName, email)); 
                    System.out.println("Do you want to add more contacts(y/n) : "); 
                    menu = sc.nextInt();
                }
                break;

            case 2:
                System.out.println("Enter First Name of contact that you would like to delete: ");
                choice = sc.next();
                break;
                
            case 3:
                System.out.println(addressBook.contact);
                break;
                
            case 4:
                System.out.println("Vpišite ime osebe, ki jo želite izbrisati: ");
                choice = sc.next();
                contact.remove(choice);
                break;
          }
          System.out.println(" 0. Exit. ");
          System.out.println(" 1. Add contact. ");
          System.out.println(" 2. Edit contact. ");
          System.out.println(" 3. Outprint contact. ");
          System.out.println(" 4. Delete contact. ");
          menu = sc.nextInt();
        }
        System.out.println("Successfull");
    }
    private void addData(String firstName, String lastName, String email) {
        Data person = new Data(firstName, lastName, email);
        contact.add(person);
    }
}
