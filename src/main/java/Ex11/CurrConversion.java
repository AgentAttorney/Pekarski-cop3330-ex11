package Ex11;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class CurrConversion{
    private int euros;
    private double ex_rate;
    public void SetMoney(int euros)
    {
        this.euros = euros;
    }
    public String ConvertMoney(double ex_rate)
    {

         DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(euros*ex_rate);
    }
}
