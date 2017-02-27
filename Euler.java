
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Leno on 7/12/2016.
 */
public class Euler {

    public static void main(String[] args) {
        while (0==0) {
            Scanner userIn = new Scanner(System.in);
            System.out.println("Enter Command...");
            String command = userIn.nextLine();

            if (command.equals("flooring")) {
                System.out.println("Other 1: \n" + flooring());
                System.out.println("...");
            }
            else if(command.equals("roman_out")) {
                System.out.println("Other 2: \n" + roman_out());
                System.out.println("...");
            }
            else if(command.equals("prob_1")) {
                System.out.println("Problem 1: \n" + prob_1());
                System.out.println("...");
            }
            else if(command.equals("prob_16")) {
                System.out.println("Problem 16: \n" + prob_16());
                System.out.println("...");
            }
            else if(command.equals("prob_24")) {
                System.out.println("Problem 24: \n" + prob_24());
                System.out.println("...");
            }
            else if(command.equals("tacan")) {
                System.out.println("Tacan");
                tacan();
                System.out.println("...");
            }
            else if(command.equals("exit")) {
                System.exit(1);
            }
            else {
                System.out.println("Not available");
            }
        }

    }

    public static int flooring(){
        System.out.println("Other 1:");
        System.out.println("Find Cost of Tile to Cover W x H Floor");

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the cost of 1 square foot of flooring");
        int sqFootCost = userIn.nextInt();
        System.out.println("Enter the width of the flooring");
        int floorWidth = userIn.nextInt();
        System.out.println("Enter the height of the flooring");
        int floorHeight = userIn.nextInt();

        int finalCost = floorHeight * floorWidth * sqFootCost;
        return finalCost;
    }

    public static int prob_1(){
        System.out.println("Problem 1:");
        System.out.println("Find the sum of all of the multiples of 3 or 5 below 1000 \nCompleted\nSolution:");

        List<Integer> list_3_5 = new ArrayList<Integer>();

        for (int i = 0; i <= 1000; i++) {
            int temp_num = i;
            if (temp_num % 3 == 0){
                //System.out.println(temp_num + ": multiple of 3");
                list_3_5.add(temp_num);
            }
            else {
                //System.out.println(temp_num + ": Not a multiple of 3");
            }
            if (temp_num % 5 == 0){
                //System.out.println(temp_num + ": multiple of 5");
                if (list_3_5.contains(temp_num) == false){
                    list_3_5.add(temp_num);
                }
            }
            else{
                //System.out.println(temp_num + ": Not a multiple of 5");
            }
        }
        //System.out.println("Complete \n" + list_3_5);
        int sum_3_5 = 0;
        for (int i = 0; i < list_3_5.size(); i++) {
            Integer temp_int = list_3_5.get(i);
            sum_3_5 = sum_3_5 + temp_int;
        }
        return sum_3_5;
    }

    public static int prob_2(){
        System.out.println("By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.");
        System.out.println("Incomplete");
        Integer prob_2_ans = 0;

        return 0;
    }

    public static int prob_3(){
        System.out.println("What is the largest prime factor of the number 600851475143 ?");
        System.out.println("Incomplete");

        return 0;
    }

    public static double prob_16(){
        System.out.println("Problem 16:");
        System.out.println("What is the sum of the digits of the number 2^1000");
        System.out.println("Incomplete\nSolution:");

        double first_sum = Math.pow(2,1000);
        System.out.println("2^1000 = " + first_sum);

        String nextNum = Double.toString(first_sum);

        String[] digitList = nextNum.split("");
        double finalSum = 0;

        for (int i = 0; i < digitList.length; i++) {
            try{
                finalSum = finalSum + Double.parseDouble(digitList[i]);
            }
            catch (Exception e) {
                break;
            }

        }

        System.out.println(finalSum);

        return (finalSum);
    }

    public static String prob_24() {
        System.out.println("Problem 24:");
        System.out.println("What is the millionth lexicographic permutation " +
                "of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?");
        System.out.println("Incomplete\nSolution:");

        ArrayList<String> permArray = new ArrayList<>();

        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                for (int c = 0; c < 9; c++) {
                    for (int d = 0; d < 9; d++) {
                        for (int e = 0; e < 9; e++) {
                            for (int f = 0; f < 9; f++) {
                                for (int g = 0; g < 9; g++) {
                                    for (int h = 0; h < 9; h++) {
                                        for (int i = 0; i < 9; i++) {
                                            for (int j = 0; j < 9; j++) {
                                                String baseNum = Integer.toString(a)
                                                        +Integer.toString(b)
                                                        +Integer.toString(c)
                                                        +Integer.toString(d)
                                                        +Integer.toString(e)
                                                        +Integer.toString(f)
                                                        +Integer.toString(g)
                                                        +Integer.toString(h)
                                                        +Integer.toString(i)
                                                        +Integer.toString(j);
                                                //System.out.println(baseNum);
                                                permArray.add(baseNum);

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return permArray.get(1000000);

    }

    public static String roman_out() {
        System.out.println("Other 2:");
        System.out.println("Turn input integer to Roman Numeral Format");
        System.out.println("Complete:");

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter the number to be transfer to Roman Numeral");
        int arabicNum = userIn.nextInt();

        String romanNum = "";

        while (arabicNum >= 1000) {
            romanNum = romanNum + "M";
            arabicNum = arabicNum - 1000;
        }
        while (arabicNum >= 500) {
            romanNum = romanNum + "D";
            arabicNum = arabicNum - 500;
        }
        while (arabicNum >= 100) {
            romanNum = romanNum + "C";
            arabicNum = arabicNum - 100;
        }
        while (arabicNum >= 50) {
            romanNum = romanNum + "L";
            arabicNum = arabicNum - 50;
        }
        while (arabicNum >= 10) {
            romanNum = romanNum + "X";
            arabicNum = arabicNum - 10;
        }
        while (arabicNum >= 5) {
            romanNum = romanNum + "V";
            arabicNum = arabicNum - 5;
        }
        while (arabicNum >= 1) {
            romanNum = romanNum + "I";
            arabicNum = arabicNum - 1;
        }
        System.out.println(romanNum);
        return "Roman Numerals complete";

    }

    public static String roman_in() {

        return "incomplete";
    }

    public static String tacan() {

        /**
         * TO-DO
         * > Some kind of graphical interface
         * > Create all of the associated classes
         * >
         *
         */


        return "incomplete";
    }

}
