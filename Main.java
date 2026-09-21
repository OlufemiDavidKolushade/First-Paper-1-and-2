import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the current Staff Number: ");
        int staff = Sc.nextInt();

        System.out.print("Enter the staff hiring Location: ");
        String Location = Sc.next();

        System.out.println();

        StaffHiring st = new StaffHiring(staff, Location);

        st.printStaffHiring();
    }
}