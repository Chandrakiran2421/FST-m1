import pytest

@pytest.mark.activity23
def test_sum(num_list):
    sum=0

    for i in num_list:
        sum += i
    assert sum == 55
