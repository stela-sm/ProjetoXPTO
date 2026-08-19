from app import soma, subtracao, multiplicacao, divisao

def test_soma():
    assert soma(2, 3) == 5
def teste_subtracao():
    assert subtracao(5, 3) == 2
def teste_multiplicacao():
    assert multiplicacao(4, 3) == 12
def teste_divisao():
    assert divisao(10, 2) == 5
    assert divisao(10, 0) == "Erro: Divisão por zero"

