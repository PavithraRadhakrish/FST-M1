import pytest



def test_addition():

    num1 = 10
    num2 = 20
    sum = num1 + num2
    assert sum == 29


def test_subtraction():
    num1 = 100
    num2 = 50
    diff = num1 - num2
    assert diff == 50


def test_multiplication():
    num1 = 20
    num2 = 20
    prod = num1 * num2
    assert prod == 400


def test_division():
    num1 = 100
    num2 = 5
    quotient = num1 / num2
    assert quotient == 20
