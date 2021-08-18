package maven;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class MavenClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give us a word: ");
        String usrWrd = input.nextLine();
        System.out.printf("You entered: %s\n", usrWrd);
        String isWordANumberMessage;
        if (StringUtils.isNumeric(usrWrd)) {
            isWordANumberMessage = "Is a number";
        } else {
            isWordANumberMessage = "Is NOT a number";
        }
        System.out.printf("\"%s\" %s\n", usrWrd, isWordANumberMessage);
        System.out.printf("Flipped Case: %s\n",StringUtils.swapCase(usrWrd));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(usrWrd));
    }

}





