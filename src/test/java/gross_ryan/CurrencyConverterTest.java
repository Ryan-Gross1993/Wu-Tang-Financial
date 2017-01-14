package gross_ryan;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ryangross on 1/13/17.
 */
public class CurrencyConverterTest {

    CurrencyConverter currencyConverterTest = new CurrencyConverter();


    @Test
    public void convertToUSDTest() {
        currencyConverterTest.fillHashMapWithNamesAndRates();
        currencyConverterTest.oldMoneyAmount = 500000.00;
        currencyConverterTest.currencyName = "YEN";
       // currencyConverterTest.setCurrencyRate();
        Assert.assertEquals(4316.00, currencyConverterTest.convertToUSD(currencyConverterTest.oldMoneyAmount), 1.0);

    }

    @Test
    public void convertToNewCurrencyTest() {
        currencyConverterTest.fillHashMapWithNamesAndRates();
        currencyConverterTest.currencyName = "USD";
        currencyConverterTest.oldMoneyAmount = 4316.00;
        currencyConverterTest.otherName = "EUROS";
        Assert.assertEquals(4057, currencyConverterTest.convertToNewCurrency(currencyConverterTest.otherName, currencyConverterTest.oldMoneyAmount), 1.0);
    }
}
