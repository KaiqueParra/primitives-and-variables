public class BooleanCheck {

    public static void main(String[] args) {

        int peopleAgeOne = 20, peopleAgeTwo = 15;
        boolean resultPeopleOne, resultPeopleTwo;

        resultPeopleOne = peopleAgeOne >= 18;
        resultPeopleTwo = peopleAgeTwo >= 18;

        System.out.println("People One is of legal age: " + resultPeopleOne);
        System.out.println("People Two is of legal age: " + resultPeopleTwo);
    }
}