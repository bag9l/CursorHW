package com.company;

public class Fractions {
    private long numerator;
    private short denominator;

    public Fractions(long numerator, short denominator) {
        if (denominator == 0) {
            System.err.println("The denominator can't be negative!");
        } else {
            this.denominator = denominator;
            this.numerator = numerator;
        }
    }

    public Fractions addition(Fractions fractionForAdd) {
        long resNumerator = this.numerator * fractionForAdd.denominator +
                fractionForAdd.numerator * this.denominator;
        short resDenominator = (short) (this.denominator * fractionForAdd.denominator);
        Fractions result = new Fractions(resNumerator, resDenominator);
        return result;
    }

    public Fractions subtraction(Fractions fractionForSum) {
        long resNumerator = this.numerator * fractionForSum.denominator -
                fractionForSum.numerator * this.denominator;
        short resDenominator = (short) (this.denominator * fractionForSum.denominator);
        Fractions result = new Fractions(resNumerator, resDenominator);
        return result;
    }

    public Fractions division(Fractions fractionForDiv) {
        long resNumerator = this.numerator * fractionForDiv.denominator;
        short resDenominator = (short) (this.denominator * fractionForDiv.numerator);
        Fractions result = new Fractions(resNumerator, resDenominator);
        return result;
    }

    public Fractions multiplication(Fractions fractionForMultiplication) {
        long resNumerator = this.numerator * fractionForMultiplication.numerator;
        short resDenominator = (short) (this.denominator * fractionForMultiplication.denominator);
        Fractions result = new Fractions(resNumerator, resDenominator);
        return result;
    }

    public boolean equal(Fractions fractionForEqual) {
        float firstNumber = this.numerator / this.denominator;
        float secondNumber = fractionForEqual.numerator / fractionForEqual.denominator;

        if (firstNumber == secondNumber) {
            System.out.println(this.numerator + "/" + this.denominator + " = " +
                    fractionForEqual.numerator + "/" + fractionForEqual.denominator);
            return true;
        } else if (firstNumber > secondNumber) {
            System.out.println(this.numerator + "/" + this.denominator + " > " +
                    fractionForEqual.numerator + "/" + fractionForEqual.denominator);
            return false;
        } else {
            System.out.println(this.numerator + "/" + this.denominator + " < " +
                    fractionForEqual.numerator + "/" + fractionForEqual.denominator);
            return false;
        }
    }

    public void showFraction() {
        System.out.println(this.numerator + " / " + this.denominator);
    }
}
