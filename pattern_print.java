package samuel;

public class pattern_print {
    public static void main(String[] args) {
            /*
         printing 1
                  22
                  333
                  4444
         pattern
         */
        for (int i = 1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println(" ");
        }


        System.out.println("\n");
             /*
         printing 1
                  12
                  123
                  1234
         pattern
         */
        for (int i = 1; i<=4; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
