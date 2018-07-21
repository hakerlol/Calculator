
class Calculator {

    static boolean isNumeric(String barcode) {
        return barcode.matches("-?\\d+(\\.\\d+)?");
    }

    static String getResult(String divisible, String divisor) {

        double checkPos = 1E-9;
        double checkNeg = -1E-9;
        if (divisible.trim().length() == 0 || divisor.trim().length() == 0) {
            throw new IllegalArgumentException("Строки пустые");
        }
        if (!isNumeric(divisible)){
            throw new IllegalArgumentException("\"Введены некорректные данные: буквы или \",\" вместо \".\"  \"");
        }
        if (!isNumeric(divisor)){
            throw new IllegalArgumentException("\"Введены некорректные данные: буквы или \",\" вместо \".\"  \"");
        }
        if (Double.parseDouble(divisor) <= checkPos && Double.parseDouble(divisor) >= checkNeg) {
            throw  new NullPointerException("На ноль делить нельзя!");

        }
        double result = Double.parseDouble(divisible) / Double.parseDouble(divisor);
        if (result % 1 <= checkPos && result % 1 >= checkNeg) {

            return String.valueOf((int) result);
        }

        return String.valueOf(result);
    }
}
