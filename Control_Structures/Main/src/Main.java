import java.util.ArrayList;

import static java.lang.Math.PI;
import static jdk.nashorn.internal.objects.NativeMath.round;

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

        //Not Operator

        System.out.println((!true));

        //Modulo Operator

        int num = 2;

        System.out.println(11%3==num);//returns the reminder



        //Comparing Objects
        String a = "hello";
        String b = "hello";
        System.out.println(a.equals(b));



        //Error Handling
        ArrayList<String> employees = new ArrayList<>();
        employees.add("arkam");

        try {
            System.out.println(employees.get(1));
        }catch (IndexOutOfBoundsException exception){
            System.out.println("Index Out of Bound error");
        }

        //Rounding off
        System.out.println(round(PI, 3));
    }
}
