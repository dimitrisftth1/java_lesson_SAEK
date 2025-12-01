import java.util.Scanner;  // Εισάγουμε την κλάση Scanner

public class MyInfoScanner {
    public static void main(String[] args) {
        
        // Δημιουργία αντικειμένου Scanner για είσοδο από το πληκτρολόγιο
        Scanner input = new Scanner(System.in);
        
        // Ζητάμε από τον χρήστη τα στοιχεία του
        System.out.print("Πληκτρολογήστε το όνομά σας: ");
        String name = input.nextLine();
        
        System.out.print("Πληκτρολογήστε το ΣΑΕΚ σας: ");
        String school = input.nextLine();
        
        System.out.print("Πληκτρολογήστε το έτος φοίτησης: ");
        int year = input.nextInt();
        input.nextLine(); // καθαρισμός buffer (για επόμενο nextLine)
        
        System.out.print("Πληκτρολογήστε το μάθημα: ");
        String lesson = input.nextLine();
        
        // Εμφάνιση των στοιχείων που πληκτρολόγησε ο χρήστης
        System.out.println();
        System.out.println("===== Τα στοιχεία σας =====");
        System.out.println("Όνομα: " + name);
        System.out.println("ΣΑΕΚ: " + school);
        System.out.println("Έτος: " + year);
        System.out.println("Μάθημα: " + lesson);
        
        // Κλείσιμο του Scanner
        input.close();
    }
}
