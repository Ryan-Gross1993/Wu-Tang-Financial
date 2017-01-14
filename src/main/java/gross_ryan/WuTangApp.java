package gross_ryan;

import java.util.Scanner;

/**
 * Created by ryangross on 1/13/17.
 */
public class WuTangApp {

    Scanner wuTangScan = new Scanner(System.in);
    UserInput wuTangInput = new UserInput();
    CurrencyConverter wuTangCurrencyConverter = new CurrencyConverter();

    public void initWuTangApp() {
        wuTangCurrencyConverter.initCurrencyConverter(wuTangScan, wuTangInput, wuTangCurrencyConverter);
    }


    public static void main(String[] args) {
        WuTangApp runWuTang = new WuTangApp();
        runWuTang.initWuTangApp();
    }

}
