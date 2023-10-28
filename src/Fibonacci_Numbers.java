public class Fibonacci_Numbers {
    public static void main(String[] args) throws Exception {
        //Only allow positive integers to be inputted to the program
        if (args.length == 0) {
            System.out.println("No command line argument provided.");
        } 
        else {
            String arg = args[0];
            try {
                int n = Integer.parseInt(arg);
                if (n < 0) {
                    System.out.println("Program only supports non negative integers.");
                    System.exit(1);
                }
            } 
            catch (NumberFormatException e) {
                System.out.println("Program only supports non negative integers not strings.");
            }
        }
        //Get the number inputed into the command line
        int n = Integer.parseInt(args[0]);
        //Output the result of the Fibonacci Sequence
        System.out.println("The result of the fibonacci sequence is " + fibonacciSequence(n));
    }

    public static int fibonacciSequence(int n) {
        //Return the basic results of the fibonacci sequence for n <= 2
        if (n == 1) {
            return 0;
        }
        
        if (n <= 2) {
            return 1;
        }


        int first_num = 1;
        int second_num = 2;
        int result = 1;
        
        //Calculate the fibonacci number after n = 2
        for (int i = 3; i < n; i++) {
            result = first_num + second_num;
            first_num = second_num;
            second_num = result;
        }
        
        return result;
    }
}
