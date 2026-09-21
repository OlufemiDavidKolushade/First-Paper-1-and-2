public class Main {
    public static void main(String[] args) {
        String [] home= {"Bathrooms","Kitchens","Gardens"};
        int [][] num = {{8,2,5},{7,4,5},{5,5,2},{2,2,3},{7,7,9},{7,8,5}};
        String [] months = {"January","February","March","April","May","June"};
        int tot = 0;
        String stars = "";

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Home Makeover Report");
        System.out.println("-------------------------------------------------------------------------");

        System.out.printf("%-18s","");
        for(int i = 0; i < home.length; i++){
            System.out.printf("%-18s",home[i]);
        }

        System.out.println();

        for(int m = 0; m< months.length; m++){
            System.out.printf("%-18s",months[m]);

            for(int x = 0; x<num[m].length; x++){
                System.out.printf("%-18d",num[m][x]);

            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Monthly Totals");
        System.out.println("-------------------------------------------------------------------------");


        for(int m = 0; m< months.length; m++){

            tot = num[m][0] + num[m][1] + num[m][2];


            if(tot >= 15){
                stars = "***";
                System.out.println(months[m]+ " " + tot +" " +stars);
            }
            else {
                System.out.println(months[m] + " " + tot + " ");
            }
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}