public final class calculator {

    public long add(long... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public double add(double... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public long subtract(long... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public double subtract(double... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public long multiply(long... numbers) {
        long result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }

    public double multiply(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }

    public long divide(long... numbers) {
        divisionError zeroCheck = new divisionError();
        if (!zeroCheck.zeroCheck(numbers)) {
            System.exit(1);
        }
        long result = 0;
        long first;
        long second;
        for (int i = 0; i < numbers.length; ) {
            if (i == 0) {
                first = numbers[i++];
                second = numbers[i++];
                result = first / second;
            }
            if (i < numbers.length && numbers[i] != 0) {
                first = numbers[i++];
                result /= first;
            }
        }
        return result;
    }

    public double divide(double... numbers) {
        divisionError zeroCheck = new divisionError();
        if (!zeroCheck.zeroCheck(numbers)) {
            System.exit(1);
        }
        double result = 0;
        double first;
        double second;
        for (int i = 0; i < numbers.length; ) {
            if (i == 0) {
                first = numbers[i++];
                second = numbers[i++];
                result = first / second;
            }
            if (i < numbers.length && numbers[i] != 0) {
                first = numbers[i++];
                result /= first;
            }
        }
        return result;
    }

}
