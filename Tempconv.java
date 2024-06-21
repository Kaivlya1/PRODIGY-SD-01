import java.util.Scanner;
public class Tempconv 
{

    public static double cToF(double c) 
        {
            return (c * 9/5) + 32;
        }

        public static double cToK(double c) 
        {
            return c + 273.15;
        }

        public static double fToC(double f) 
            {
              return (f - 32) * 5/9;
            }

    public static double fToK(double f) 
        {
            return (f - 32) * 5/9 + 273.15;
        }

    public static double kToC(double k) 
        {
            return k - 273.15;
        }

    public static double kToF(double k) 
        {
            return (k - 273.15) * 9/5 + 32;
        }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean continueConverting = true;

        while (continueConverting) 
        {
            System.out.println("Temperature Converter");
            System.out.println("=====================");
            System.out.print("Enter the temperature value: ");
            double temp = sc.nextDouble();

            System.out.print("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
            char unit = sc.next().toUpperCase().charAt(0);

            switch (unit) 
            {
                case 'C':
                    double fFromC = cToF(temp);
                    double kFromC = cToK(temp);
                    System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit and %.2f Kelvin.%n", temp, fFromC, kFromC);
                    break;
                case 'F':
                    double cFromF = fToC(temp);
                    double kFromF = fToK(temp);
                    System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius and %.2f Kelvin.%n", temp, cFromF, kFromF);
                    break;
                case 'K':
                    double cFromK = kToC(temp);
                    double fFromK = kToF(temp);
                    System.out.printf("%.2f Kelvin is equal to %.2f degrees Celsius and %.2f degrees Fahrenheit.%n", temp, cFromK, fFromK);
                    break;
                default:
                    System.out.println("Invalid unit. Please use C for Celsius, F for Fahrenheit, or K for Kelvin.");
                    break;
            }

            System.out.print("Do you want to perform another conversion? (yes/no): ");
            String response = sc.next().toLowerCase();
            if (!response.equals("yes")) 
                {
                    continueConverting = false;
                }
            System.out.println();
        }

        sc.close();
        System.out.println("Thank you for using the temperature converter. Goodbye!");
    }
}
