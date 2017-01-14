package gross_ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class UserInput {
    //Scanner inputScanner = new Scanner(System.in);

    public String getOldMoneyName(Scanner scanner) {
        System.out.println("What kind of money do you have?");
        return scanner.next();
    }

    public double getOldMoneyAmount(Scanner scanner) {
        System.out.println("How much do you have?");
        return scanner.nextDouble();
    }

    public String getNewMoneyName(Scanner scanner) {
        System.out.println("What kind of money do you want?");
        return scanner.next();
    }




    public void setCurrencyConverter(CurrencyConverter userCurrencyConverter, Scanner aScanner) {
        userCurrencyConverter.currencyName = getOldMoneyName(aScanner);
        userCurrencyConverter.otherName = getNewMoneyName(aScanner);
        userCurrencyConverter.oldMoneyAmount = getOldMoneyAmount(aScanner);
    }


}
