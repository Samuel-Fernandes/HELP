package com.company;

import java.util.Scanner;
class AP {
    Scanner sc = new Scanner(System.in);
    public float firstTerm;
    public float numberOfTerms;
    public float commonDifference;

    public void show() {
        char select;

        do {

            System.out.println("Enter the A to find An term");
            System.out.println("Enter the B to find Sum of term");
            System.out.println("Enter the C to find common difference");
            System.out.println("Enter the D to print Arithmetic Progression");
            System.out.println("Enter E to exit");
            System.out.println("Enter F to find number of terms");
            System.out.println("Enter G to find first term");
            select = sc.next().charAt(0);
            if (select == 'A'){
                to_find_An();

                        }
            else if (select=='B'){
                to_find_Sn();

            }
            else if (select=='C'){
                to_find_CM();
            }
            else if (select=='D'){
                print_AP();
            }
            else if (select=='E'){
                System.out.println("Thank you for using my app");
            }
            else if (select=='F'){
                to_find_number_of_terms();
            }
            else if (select=='G'){
                to_find_first_term();
            }
            else {
                System.out.println("Not a valid option");
            }
        }while (select!='E');

    }
    public void to_find_An(){
        System.out.println("Enter the first term");
        this.firstTerm = sc.nextFloat();
        System.out.println("Enter the common difference");
        this.commonDifference = sc.nextFloat();
        System.out.println("Enter the number of terms");
        this.numberOfTerms = sc.nextFloat();
        float ans = this.firstTerm+(this.numberOfTerms-1)*this.commonDifference;
        System.out.println("The An term is: "+ans);
        System.out.println("\n");
    }
    public void to_find_Sn(){
        System.out.println("Enter the first term");
        this.firstTerm = sc.nextFloat();
        System.out.println("Enter the common difference");
        this.commonDifference = sc.nextFloat();
        System.out.println("Enter the number of terms");
        this.numberOfTerms = sc.nextFloat();
        float ans = (this.numberOfTerms/2)*(2*this.firstTerm+(this.numberOfTerms-1)*commonDifference);
        System.out.println("The Sn term is: "+ans);
        System.out.println("\n");
    }
    public void to_find_CM(){
        System.out.println("Enter the first term");
        this.firstTerm = sc.nextFloat();
        System.out.println("Enter the second term");
        float secondTerm = sc.nextFloat();
        float ans = secondTerm-this.firstTerm;
        System.out.println("The common difference is: "+ ans);
        System.out.println("\n");
    }
    public void print_AP(){
        System.out.println("Enter the first term");
        this.firstTerm = sc.nextFloat();
        System.out.println("Enter the common difference");
        this.commonDifference = sc.nextFloat();
        System.out.println("Enter number of terms to print");
        this.numberOfTerms = sc.nextFloat();
        System.out.print("The Arithmetic Progression is: "+this.firstTerm+", ");
        for (int i=0; i<this.numberOfTerms-1; i++){
           float ans = this.firstTerm+this.commonDifference;
            System.out.print(ans+", ");
            this.firstTerm = ans;
        }
        System.out.println("\n");
    }
    public void to_find_number_of_terms(){
        System.out.println("Enter the first term");
        this.firstTerm = sc.nextFloat();
        System.out.println("Enter the common difference");
        this.commonDifference = sc.nextFloat();
        System.out.println("Enter the Last term or An term");
        float An_term = sc.nextFloat();
        float ans = ((An_term-this.firstTerm)/this.commonDifference)+1;
        System.out.println("The number of terms are: "+ans);
        System.out.println("\n");
     }
    public void to_find_first_term(){
        byte decision;
        System.out.println("Enter 1 if you have: second term");
        System.out.println("Enter 2 if you have: don't have second term");
        decision = sc.nextByte();
        if (decision==1){
            System.out.println("Enter the second term");
            float secondTerm = sc.nextFloat();
            System.out.println("Enter the common difference");
            this.commonDifference = sc.nextFloat();
            float ans = secondTerm-this.commonDifference;
            System.out.println("The first term is: "+ans);
        }
        else if (decision==2){
            System.out.println("Enter the Last term or An term");
            float lastTerm = sc.nextFloat();
            System.out.println("Enter the number of terms");
            this.numberOfTerms = sc.nextFloat();
            System.out.println("Enter the common difference");
            this.commonDifference = sc.nextFloat();
            float ans = lastTerm-((this.numberOfTerms-1)*this.commonDifference);
            System.out.println("The first term is: "+ans);
        }
        else {
            System.out.println("Wrong decision");
        }
        System.out.println("\n");
    }
}
public class ArithmeticProgression {
    public static void main(String[] args) {
   AP obj = new AP();
   obj.show();

    }
}
