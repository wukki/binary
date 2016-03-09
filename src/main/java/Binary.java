public class Binary {

    private int decimal;

    public Binary(String input) {
        decimal = 0;
        char[] c_arr = input.toCharArray();
        for (int i = c_arr.length - 1; i >= 0; i--) {
            int num = Character.getNumericValue(c_arr[i]);
            int pow = (int) Math.pow(2, c_arr.length - 1 - i);
            if (num > 1) break;
            decimal += num * pow;
        }
    }

    public int getDecimal() {
        return decimal;
    }
}
