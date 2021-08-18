package maven;

import java.util.Scanner;

public class MavenClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give us a word: ");
        String usersWord = input.nextLine();
        System.out.printf("You entered: %s\n", usersWord);
        String isWordANumberMessage;
        if (StringUtils.isNumeric(usersWord)) {
            isWordANumberMessage = "Is a number";
        } else {
            isWordANumberMessage = "Is NOT a number";
        }
        System.out.printf("\"%s\" %s\n", usersWord, isWordANumberMessage);
        System.out.println("Flipped Case: %s\n",StringUtils.swapCase(usersWord));
        System.out.println("Reversed: %s\n", StringUtils.reverse(usersWord));
    }

}





