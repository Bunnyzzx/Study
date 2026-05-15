"""
Você foi contratado por uma cafeteria que deseja automatizar o atendimento no balcão.
O sistema deve permitir que o atendente registre os pedidos de cada cliente,
calcule o valor total e aplique um desconto de 10% para clientes cadastrados.

O processo deve funcionar da seguinte forma:

-O atendente informa quantos itens o cliente vai pedir.
-Para cada item, o sistema solicita o nome e o preço.
-Ao final, o sistema pergunta se o cliente é cadastrado.
-Se for, aplica o desconto e exibe o valor com desconto.
-Caso contrário, exibe o valor cheio.
"""

itens = []
valores = []

x = int(input("Quantos itens serão solicitados? "))
for i in range(x):
    item = input("Nome do item: ")
    valor = float(input("Valor do item: R$ "))

    itens.append(item)
    valores.append(valor)

total = sum(valores)

print(" ")
print("----------")

y = input("Cliente é cadastrado?: ")
if y.lower() == "sim":
    desconto = total * 0.75
else:
    desconto = total

print("----------")
print(" ")

print("Produtos escolhidos:")
for item, valor in zip(itens, valores):
    print(f"{item}: R$ {valor:.2f}")
print(f"Valor total: R${total}")
print(f"Valor com desconto: R${desconto}")





