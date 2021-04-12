public class If {
    public static void main(String[] args) {

        boolean cond = 11  >= 10;

        System.out.println(cond);

        int myInt = 12;

        if (myInt < 10) {
            System.out.println("Yes! It's true!");
        } else if(myInt > 15) {
            System.out.println("No! It's false!");
        } else {
            System.out.println("None of the above");
        }


        
        int loop = 10;

        while (true){
            System.out.println("looping: " + loop);

            if (loop == 10) {
                break;
            }

            loop++;

            System.out.println("Running");
        }
    }
}