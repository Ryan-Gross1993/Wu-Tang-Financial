package gross_ryan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class CurrencyConverter {

    String currencyName;
    String otherName;
    Double oldMoneyAmount;
    HashMap kindsOfCurrencies = new HashMap<String,Double>();
    String[] arrayOfCurrencyNames = new String[] {"USD", "EUROS", "YEN", "YUAN", "AUD", "SGD", "CAD", "RINGGITS", "FRANCS", "POUNDS", "RUPEES" };
    Double[] arrayOfConversionRates = new Double[]  {1.00, 0.94, 115.84, 6.92, 1.35, 1.43, 1.32, 4.47, 1.01, 0.82, 68.32};

    public void fillHashMapWithNamesAndRates() {
        for(int i = 0; i < arrayOfCurrencyNames.length; i++) {
            kindsOfCurrencies.put(arrayOfCurrencyNames[i], arrayOfConversionRates[i]);
        }

    }


    public double convertToUSD(double oldMoneyAmount) {
        return oldMoneyAmount / (Double) kindsOfCurrencies.get(currencyName);

    }
    public double convertToNewCurrency(String currencyName, double oldMoneyAmount) {
        if (currencyName != "USD") {
            return (Math.round(convertToUSD(oldMoneyAmount) * (Double) kindsOfCurrencies.get(otherName) * 100.00) / 100.00);

        } else {
            return convertToUSD(oldMoneyAmount);
        }
    }

    public void displayMessage() {
        System.out.println(oldMoneyAmount + " " + currencyName + " is about " +  convertToNewCurrency(currencyName, oldMoneyAmount) + " " + otherName);

    }

    public void initCurrencyConverter(Scanner aScanner, UserInput anInput, CurrencyConverter aCurrencyConverter) {
        anInput.setCurrencyConverter(aCurrencyConverter, aScanner);
        fillHashMapWithNamesAndRates();
        convertToNewCurrency(currencyName, oldMoneyAmount);
        displayMessage();

    }


}
