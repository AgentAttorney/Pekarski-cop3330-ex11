package Ex11;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example11 {
    public static void main(String[] args)
    {
        CurrConversion MyMoney = new CurrConversion();
        System.out.print("How many euros are you exchanging? ");
        Scanner input = new Scanner(System.in);
        int euros = input.nextInt();
        MyMoney.SetMoney(euros);

        System.out.print("What is the exchange rate? ");
        double ex_rate = input.nextDouble();
        MyMoney.ConvertMoney(ex_rate);

        System.out.println(euros + " euros at an exchange rate of "
                + ex_rate + " is $" + MyMoney.ConvertMoney(ex_rate) + " dollars");
    }
}
