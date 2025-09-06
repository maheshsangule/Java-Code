package loopingstatements;

public class JumpStatements {
    public static void main(String[] args) {


        //Labeled break statement
        First:
        {
            Second:
            {
                Third:
                {
                    System.out.println("this is thord block");
                    if (true) {
                        break Second;
                    }

                }

                System.out.println("This is second block");
            }
            System.out.println("This is first block");
        }


        //Labeled continue statement


        outer:for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("value of J is::" + j);
                if (j == 1) {
                    continue outer;
                }
            }
            System.out.println("the value of i is::" + i);
        }


    }
}
