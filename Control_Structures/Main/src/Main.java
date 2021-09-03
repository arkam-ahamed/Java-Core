public class Main {
    public static void main(String[] args) {
        int count = 1;


        //if-else
        if (count > 2) {
            System.out.println("Count is higher than 2");
        } else {
            System.out.println("Count is lower or equal than 2");
        }


        //switch case
        switch (count) {
            case 0:
                System.out.println("Count is equal to 0");
                break;
            case 1:
                System.out.println("Count is equal to 1");
                break;
            default:
                System.out.println("Count is either negative, or higher than 1");
                break;

        }

        //for loop

        for (int i = 1; i <= 3; i++) {
            System.out.println("i am number " + i);
        }

        //break

        for (int i = 0; i <= 3; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);


        }

        //Continue


        for (int i = 0; i <= 3; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);


        }


    }
}
