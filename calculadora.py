# exercício 1 - calculadora

#funções
def soma(a,b):
    return a + b

def subtracao(a,b):
    return a - b;

def multiplicacao(a,b):
    return a * b

def divisao(a,b):
    return a / b

#cabeçalho
print("--------------------------------")
print("Calculadora Simples")
print("--------------------------------")

print("1 - Soma")
print("2 - Subtração")
print("3 - Multiplicação")
print("4 - Divisão")
print("--------------------------------") 
op = int(input("Digite a operação que deseja realizar: "))
print(" ")

if op == 1:
    x = float(input("Digite X: "))
    y = float(input("Digite Y: "))
    print("Resultado:", soma(x, y))

elif op == 2:
    x = float(input("Digite X: "))
    y = float(input("Digite Y: "))
    print("Resultado:", subtracao(x, y))

elif op == 3:
    x = float(input("Digite X: "))
    y = float(input("Digite Y: "))
    print("Resultado:", multiplicacao(x, y))

elif op == 4:
    x = float(input("Digite X: "))
    y = float(input("Digite Y: "))
    print("Resultado:", divisao(x, y))

else:
    print("Operação Inválida!")



