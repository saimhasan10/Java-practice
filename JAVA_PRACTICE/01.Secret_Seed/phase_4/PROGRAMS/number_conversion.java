public class number_conversion {
    public static void main(String[] args) {

        // binary conversion to decimal
        String binary = "01010";
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary to decimal: " + decimal);

        // octal conversion to decimal
        String octal = "663";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println("Octal to decimal: " + decimal2);

        String hexadecimal = "B23";
        Integer decimal3 = Integer.parseInt(hexadecimal, 16);
        System.out.println("hexadecimal to decimal: "+ decimal3);

        //----------------   --------------------- \\

        // decimal to binary
        int decimal4 = 99;
        String binary_value = Integer.toBinaryString(decimal4);
        System.out.println("Decimal to binary: "+ binary_value);

        // decimal to octal
        String octal_value = Integer.toOctalString(decimal4);
        System.out.println("Decimal to octal: "+ octal_value);

        // decimal to hexadecimal
        String hexadecimal_value = Integer.toHexString(decimal4);
        System.out.println("Decimal to hexadecimal: "+ hexadecimal_value);

    }
}
