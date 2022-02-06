package com.example.simplecalc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

@RunWith(JUnit4.class)
public class CalculatorTest {

    private Calculator mCalculator;

    @Before
    public void setUp() {

        mCalculator = new Calculator();
    }

    @Test
    public void addTwoNumbers() {
        double resultAdd = (double) mCalculator.addition(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    @Test
    public void addTwoNumbersNegative(){
        double resultAdd = (double) mCalculator.addition(-1d, 2d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test
    public void addTwoNumbersFloats(){
        double resultAdd = (double) mCalculator.addition(1.111f, 1.111d);
        assertThat(resultAdd, is(closeTo(2.222d, 0.01)));
    }



    @Test
    public void subTwoNumbers(){
        double resultSub = (double) mCalculator.subtraction(2d, 1d);
        assertThat(resultSub, is(equalTo(1d)));
    }

    @Test
    public void subWorksWithNegativeResults(){
        double resultSub = (double) mCalculator.subtraction(2d, 10d);
        assertThat(resultSub, is(equalTo(-8d)));
    }

    @Test
    public void mulTwoNumbers(){
        double resultMul = (double) mCalculator.multiplication(16d, 2d);
        assertThat(resultMul, is(equalTo(32d)));
    }

    @Test
    public void mulTwoNumbersZero(){
        double resultMul = (double) mCalculator.multiplication(16d, 0d);
        assertThat(resultMul, is(equalTo(0d)));
    }

    @Test
    public void divTwoNumbers(){
        double resultDiv = (double) mCalculator.division(16d, 2d);
        assertThat(resultDiv, is(equalTo(8d)));
    }

    @Test
    public void divByZero(){
        double resultDiv = (double) mCalculator.division(16d, 0d);
        assertThat(resultDiv, is(equalTo(Double.POSITIVE_INFINITY)));
    }


}