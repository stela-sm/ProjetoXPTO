from app import divisao

def teste_divisao():
    assert divisao(10, 2) == 5
    assert divisao(10, 0) == "Erro: Divisão por zero"

