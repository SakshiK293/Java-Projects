
import java.util.*;
import java.text.DecimalFormat;


public class Task4 {
    public static void main(String[] args) {
        double rupee,dollar,pound,code,euro,KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to Currency convertor***\n Enter the currency code:\n 1.Rupees\n2.Dollar\n3.Pound\n4.Euro\n5.KWD");
        code = sc.nextDouble();
        if(code == 1)
        {
            System.out.println("Enter amount in rupees:");
            rupee = sc.nextDouble();
            dollar = rupee / 83.11;
            System.out.println("Dollar: "+ f.format(dollar));
            pound = rupee /105.93;
            System.out.println("Pound: "+ f.format(pound));
            euro = rupee / 90.56;
            System.out.println("Euro: "+ f.format(euro));
            KWD = rupee / 270.17;
            System.out.println("KWD: "+ f.format(KWD));

        }
        else if (code == 2)
        {
            System.out.println("Enter amount in dollar:");
            dollar = sc.nextDouble();
            rupee = dollar * 83.11;
            System.out.println("Rupee: "+ f.format(rupee));
            pound = dollar * 0.78;
            System.out.println("Pound: "+ f.format(pound));
            euro = dollar * 0.92;
            System.out.println("Euro: "+ f.format(euro));
            KWD = dollar * 0.31;
            System.out.println("KWD: "+ f.format(KWD));
        }
        else if(code == 3)
        {
            System.out.println("Enter amount in pound:");
            pound = sc.nextDouble();
            rupee = pound * 106.00;
            System.out.println("Rupee: "+ f.format(rupee));
            dollar = pound *1.28;
            System.out.println("Dollar: "+ f.format(dollar));
            euro = pound * 1.17;
            System.out.println("Euro: "+ f.format(euro));
            KWD = pound * 0.39;
            System.out.println("KWD: "+ f.format(KWD));
        }
        else if (code == 4)
        {
            System.out.println("Enter amount in euro:");
            euro = sc.nextDouble();
            rupee = euro * 90.57;
            System.out.println("Rupee: "+ f.format(rupee));
            dollar = euro *1.09;
            System.out.println("Dollar: "+ f.format(dollar));
            pound = euro * 0.85;
            System.out.println("Pound: "+ f.format(euro));
            KWD = euro * 0.34;
            System.out.println("KWD: "+ f.format(KWD));
        }
        else if (code == 5)
        {
            System.out.println("Enter amount in KWD:");
            KWD = sc.nextDouble();
            rupee = KWD * 270.17;
            System.out.println("Rupee: "+ f.format(rupee));
            dollar = KWD * 3.25;
            System.out.println("Dollar: "+ f.format(dollar));
            pound = KWD * 2.55;
            System.out.println("Pound: "+ f.format(pound));
            euro = KWD * 2.98;
            System.out.println("Euro: "+ f.format(euro));
        }
        else {
            System.out.println("Invalid Code!");
        }
    }
}
