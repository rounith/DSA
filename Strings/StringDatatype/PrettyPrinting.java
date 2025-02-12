package Strings.StringDatatype;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a=453.123456f;
        System.out.printf("%.2f",a);//%2f is used to print the float value upto 2 decimal places known as placeholder.
        System.out.println();
        System.out.printf("Pie is %.2f",Math.PI);
    }
}

// List of placeholders in Java:
// %d - integer
// %f - floating point number
// %c - character
// %s - string
// %b - boolean
// %e - scientific notation
// %x - hexadecimal integer
// %o - octal integer
// %t - date/time
// %% - literal % symbol