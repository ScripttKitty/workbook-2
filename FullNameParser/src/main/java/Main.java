import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Variables
        String firstName;
        String middleName;
        String lastName;
        String fullName;
        int firstSpace;
        int secondSpace;

        //Creating a scanner to receive user input and storing it in fullName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name (first middle last): ");
        fullName = scanner.nextLine();

        //Trimming end spaces and identifying and storing the spaces in between the name
        fullName = fullName.trim();
        firstSpace = fullName.indexOf(" ");
        secondSpace = fullName.indexOf(" ",firstSpace +1);

        //Assigning the variables with substring using the index stored for the spaces
        firstName = fullName.substring(0, firstSpace);
        middleName = fullName.substring(firstSpace, secondSpace);
        lastName = fullName.substring(secondSpace);

        //Output display showing the different parts of the user's name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
       System.out.println("Last name; "+ lastName);



    }
    /*
    public boolean middleNameConfirm(String fullName) {
        int secondSpace;
        String firstSpace = fullName.substring(" ");

        if (secondSpace = fullName.indexOf(" ", firstSpace + 1)) {
            return true;
        } else {
           return false;
                   //System.out.println("none");


            if (fullName.middleNameConfirm() = false){
                System.out.println("none");

     */
        }





}
