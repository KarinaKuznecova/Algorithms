package numbers;

public class Numbers {

    public boolean isOddNumber(int number) {
        return number % 2 == 1;
    }

    int sumInRange(int firstNumber, int secondNumber) {
        int sum = 0;
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                sum += i;
            }
        } else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                sum += i;
            }
        }
        return sum;
    }

    int getEvenNumberCountInRange(int firstNumber, int secondNumber) {
        int count = 0;
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        } else {
            for (int i = secondNumber; i <= firstNumber; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    int calculatePower(int number, int power) {
        int result = number;
        if (number > 0 && power > 0) {
            for (int i = 1; i < power; i++) {
                result *= number;
            }
        }
        return result;
    }
}
