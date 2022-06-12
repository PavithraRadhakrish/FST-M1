import pytest


@pytest.fixture
def number_list():
    list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return list


@pytest.fixture
def wallet():
    wallet = 0
    return wallet
