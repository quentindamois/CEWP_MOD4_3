package src.DuplicateElimination;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        HashSet<String> firstnameList = new HashSet<>();
        int nbInputName;
        System.out.println("Enter the number of firstname you want to input :");
        Scanner input = new Scanner(System.in);
        nbInputName = input.nextInt();
        for(int i = 0; i < nbInputName; i++) {
            System.out.println("Entrer a firstname:");
            firstnameList.add(input.nextLine());
        }
        System.out.println("Enter a name to see if it is in the set of name :");
        String name = input.nextLine();
        /*456*/
    }
}
