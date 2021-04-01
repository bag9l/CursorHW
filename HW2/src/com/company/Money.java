package com.company;

public class Money {
    private long hryvnias;
    private byte kopecks;

    public Money(long hryvnias, byte kopecks) {
        if (hryvnias < 0 || kopecks < 0) {
            System.err.println("The amount of money cannot be negative!");
            this.hryvnias = hryvnias;
            this.kopecks = kopecks;
        }
        if (kopecks > 100) {
            ++hryvnias;
            kopecks -= 100;
        }
        this.hryvnias = hryvnias;
        this.kopecks = kopecks;
    }

    public Money additionOfSums(Money moneyForAddition) {
        long hryvnias = this.hryvnias + moneyForAddition.hryvnias;
        byte kopecks = (byte) (this.kopecks + moneyForAddition.kopecks);
        if (kopecks > 100) {
            ++hryvnias;
            kopecks -= 100;
        }
        Money money = new Money(hryvnias, kopecks);
        return money;
    }

    public Money subtractionOfSums(Money moneyForSubstraction) {
        long hryvnias = this.hryvnias - moneyForSubstraction.hryvnias;
        byte kopecks = (byte) (this.kopecks - moneyForSubstraction.kopecks);
        if (hryvnias < 0 && kopecks < 0) {
            kopecks *= -1;
        } else if (kopecks < 0) {
            hryvnias *= -1;
            kopecks *= -1;
        }
        if (kopecks > 100) {
            ++hryvnias;
            kopecks -= 100;
        }
        Money money = new Money(hryvnias, kopecks);
        return money;
    }

    public Money divisionOfSums(Money moneyForDivision) {
        double firstSum = (this.hryvnias * 100 + this.kopecks) / 100d;
        double secondSum = (moneyForDivision.hryvnias * 100 + moneyForDivision.kopecks) / 100d;
        double result = firstSum / secondSum;
        long hryvnias = (long) result;
        short kopecks = (short) ((result % hryvnias) * 100);
        if (kopecks > 100) {
            hryvnias = kopecks / 100;
            kopecks -= hryvnias * 100;
        }
        Money money = new Money(hryvnias, (byte) kopecks);
        return money;
    }

    public Money divisionByNum(float number) {
        double Sum = this.hryvnias + this.kopecks / 100;
        double result = Sum / number;
        long hryvnias = (long) result;
        short kopecks = (short) ((result % hryvnias) * 100);
        if (kopecks > 100) {
            ++hryvnias;
            kopecks -= 100;
        }
        Money money = new Money(hryvnias, (byte) kopecks);
        return money;
    }

    public Money multiplicationByNum(float number) {
        double Sum = (this.hryvnias * 100 + this.kopecks) / 100d;
        double result = Sum * number;
        long hryvnias = (long) result;
        short kopecks = (short) ((result % hryvnias) * 100);
        if (kopecks > 100) {
            hryvnias += kopecks / 100;
            kopecks -= hryvnias * 100;
        }
        Money money = new Money(hryvnias, (byte) kopecks);
        return money;
    }

    public boolean equal(Money moneyForEqual) {
        double firstSum = this.hryvnias + this.kopecks / 100;
        double secondSum = moneyForEqual.hryvnias + moneyForEqual.kopecks / 100;
        if (firstSum == secondSum) {
            System.out.println(this.hryvnias + "," + this.kopecks + " = "
                    + moneyForEqual.hryvnias + "," + moneyForEqual.kopecks);
            return true;
        } else if (firstSum > secondSum) {
            System.out.println(this.hryvnias + "," + this.kopecks + " > "
                    + moneyForEqual.hryvnias + "," + moneyForEqual.kopecks);
            return false;
        } else {
            System.out.println(this.hryvnias + "," + this.kopecks + " < "
                    + moneyForEqual.hryvnias + "," + moneyForEqual.kopecks);
            return false;
        }
    }

    public void showMoney() {
        System.out.println(this.hryvnias + "," + this.kopecks);
    }
}
