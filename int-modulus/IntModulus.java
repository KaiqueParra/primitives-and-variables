public class IntModulus {
    
    public static void main(String[] args) {
        
        int valueOne = 29, valueTwo = 67 , valueThree = 12, resultOne, resultTwo;

        resultOne = valueOne % valueTwo;

        resultTwo = valueTwo % valueThree;

        System.out.println("The remainder of the division of " + valueOne  + " % " +  valueTwo  + " is: " + resultOne);

        System.out.println("The remainder of the division of " + valueTwo + " % " +  valueThree  + " is: " + resultTwo);
    }
}
