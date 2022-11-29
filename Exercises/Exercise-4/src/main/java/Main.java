

public class Main {

    static public void print(String regex, String trueCase, boolean trueTest, String falseCase, boolean falseTest) {
        System.out.println("Regex : " + regex);
        System.out.println("Our positive case pattern is " + trueCase + " and the regex match is -> " + trueTest);
        System.out.println("Our negative case pattern is " + falseCase + " and the regex match is -> " + falseTest);
    }

    public static void main(String[] args) {

        {
            //Returns true if there are exactly 3 digits
            System.out.println("---------------- Returns true if there are exactly 3 digits------------------");
            String trueCase = "123";
            String falseCase = "1235";
            String regex = "\\d{3}";
            boolean trueTest = trueCase.matches(regex);
            boolean falseTest = falseCase.matches(regex);
            print(regex, trueCase,trueTest,falseCase,falseTest);
        }
        {
            //Returns true if the string exactly matches hello
            System.out.println("----------------Returns true if the string exactly matches satyam---------------");
            String trueCase = "satyam";
            String falseCase = "satyama";
            String regex = "satyam";
            boolean trueTest = trueCase.matches(regex);
            boolean falseTest = falseCase.matches(regex);
            print(regex, trueCase,trueTest,falseCase,falseTest);
        }
        {
            //Returns true if the string matches true or True
            System.out.println("-----------------Returns true if the string matches upperCase or lowercase first letter---------------");
            String trueCase = "hello";
            String falseCase = "Yello";
            String regex = "[hH]ello";
            boolean trueTest = trueCase.matches(regex);
            boolean falseTest = falseCase.matches(regex);
            print(regex, trueCase,trueTest,falseCase,falseTest);
        }
        {
            // returns true if the string does not have a number at the beginning
            System.out.println("----------------returns true if the string does not have a number at the beginning----------------");
            String trueCase = "HelloSatyam";
            String falseCase = "17SatyamHello";
            String regex = "^[^\\d].*";
            boolean trueTest = trueCase.matches(regex);
            boolean falseTest=falseCase.matches(regex);
            print(regex, trueCase,trueTest,falseCase,falseTest);
        }
        {
            //Returns true if test case contains tree or plant
            System.out.println("-------------------Returns true if test case contains dog or cat----------------");
            String trueCase = "bombsnaiac dog ";
            String falseCase = "adndsad do ";
            String regex = ".*(dog|cat).*";
            boolean trueTest = trueCase.matches(regex);
            boolean falseTest = falseCase.matches(regex);
            print(regex, trueCase,trueTest,falseCase,falseTest);
        }






    }


}
