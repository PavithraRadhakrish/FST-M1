import pytest





def test_list_sum(number_list):
    sum = 0
    for n in number_list:
        sum = sum + n
    assert sum == 55
