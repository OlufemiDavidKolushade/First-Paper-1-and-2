public abstract class Staff implements IStaff {

    int staffNum;
    String Location;

    public Staff(int staffNum, String Location){
        this.staffNum = staffNum;
        this.Location = Location;
    }

    @Override
    public int getStaffNumber() {
        return staffNum;
    }

    @Override
    public String getStaffHiringProcess() {
        if(staffNum < 20){
            return "Yes";
        }
        return " ";
    }

    @Override
    public String getStaffLocation() {
        return Location;
    }
}
