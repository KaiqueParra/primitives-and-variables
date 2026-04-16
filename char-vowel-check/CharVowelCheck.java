public class CharVowelCheck{

    public static void main(String[] args) {
        
        char vowelA = 'a', vowelK = 'k';
        boolean resultA, resultK;

        resultA = vowelA == 'a'|| vowelA == 'e' || vowelA == 'i' || vowelA == 'o' || vowelA == 'u';
        System.out.println(resultA);

        resultK = vowelK == 'a'|| vowelK == 'e' || vowelK == 'i' || vowelK == 'o' || vowelK == 'u';
        System.out.println(resultK);
    }
}