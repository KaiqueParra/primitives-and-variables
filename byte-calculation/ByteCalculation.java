public class ByteCalculation {
    
    public static void main(String[] args) {
        
        byte numberOne = 127, numberTwo = 100, result;
        //Max 127
        //Min -128

        result = (byte) (numberOne - numberTwo);

        System.out.println(numberOne + " - " + numberTwo + " = " + result);

    }
}
