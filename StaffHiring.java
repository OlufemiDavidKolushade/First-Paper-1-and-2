public class StaffHiring extends Staff {

    public StaffHiring(int staffNum, String Location) {
        super(staffNum, Location);
    }

    public void printStaffHiring(){
        System.out.println("Staff Hiring report");
        System.out.println("*********************");
        System.out.println("Location: "+getStaffLocation());
        System.out.println("Staff Number: "+getStaffNumber());
        System.out.println("Hire Staff: "+getStaffHiringProcess());
    }
}
