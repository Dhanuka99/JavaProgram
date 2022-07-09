package functions;

public class Functions {


        /* JAVA functions can be categorized in two types
                1) User defined function
                2) Inbuilt function / predefined function / library function

         USER DEFINED FUNCTIONS
                <return_type> function_name (<argument_list>)
         */

    public static int add(int a, int b) {  // function add takes two integer input and return another integer value
        int sum; // sum os loca; variable of the function add
        sum = a + b;
        return sum; // when the result as integer data
    }

    public static int factorial(int num) {  // another recursive function to get factorial of a number
       if(num <= 1)
           return num; // when number is 1 or less than that, factorial is 1
       return num* factorial(num-1); // recursion call of the function factorial
    }



}
