public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        int valor = String.valueOf(numberToCheck)
                .chars()
                .map(n -> (int) Math.pow(Character.getNumericValue(n), String.valueOf(numberToCheck).length()))
                .sum();

        return valor == numberToCheck;
    }
}
