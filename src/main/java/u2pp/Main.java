package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * YOUR COMMENTS HERE
 */

class Main {
    public static void main(String[] args) {

        //YOUR CODE HERE
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter how much gas is needed: ");
        double mpg = scanner.nextDouble();
        System.out.print("please enter the brand:");
        String make = scanner.next();
        System.out.print("please enter the model:");
        String model = scanner.next();
        System.out.print("please enter the amount of gas:");
        double gas = scanner.nextDouble();
        System.out.print("please enter the disdance:");
        double distance = scanner.nextDouble();

        Car car = new Car(mpg, make, model);
        car.addGas(gas);
        car.drive(distance);
        double gasInTank = car.getGasInTank();
        String makeAndModel = car.getMakeAndModel();
        System.out.println("left gas in the tank :" + gasInTank);
        System.out.println("brand:" + makeAndModel);


        scanner.close();
        //iaWad
        String str1 = "Brian";
        String str2 = "Wade";
        String str3 = wordChanger(str1, 2, 4, str2, 0, 3);
        System.out.println(str3);


    }

    /**
     * YOUR COMMENT HERE
     *
     * @param word1  The first string to take a piece out of
     * @param start1 The starting index of the substring of word1
     * @param end1   The ending index of the substring of word1 (inclusive)
     * @param word2  The second string to take a piece out of
     * @param start2 The starting index of the substring of word2
     * @param end2   The ending index of the substring of word2 (inclusive)
     * @return YOUR COMMENT HERE
     */
    public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
        //YOUR CODE HERE
        //ia
        String substring1 = word1.substring(start1, end1);
        //Wad
        String substring2 = word2.substring(start2, end2);
        return substring1 + substring2;
    }
}