import pytest

@pytest.mark.parametrize("earned", "spent", "expected_balance" ,[(30,10,20),(20,2,18)] )

def test_transaction(wallet_amount, earned, spent, expected_balance):
    wallet_amount += earned
    wallet_amount -= spent
    assert wallet_amount == expected_balance 