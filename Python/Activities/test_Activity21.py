import pytest

@pytest.mark.activity21
def test_addition():
    n1=100
    n2=200
    assert n1+n2 == 300
@pytest.mark.activity21
def test_subtraction():
    n1=100
    n2=20
    assert n1-n2 == 50
@pytest.mark.activity21
def test_multiplication():
    n1=10
    n2=20
    assert n1*n2 == 203
@pytest.mark.activity21
def test_division():
    n1=100
    n2=200
    assert n1/n2 == 5
    