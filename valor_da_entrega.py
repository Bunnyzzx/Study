#Você está desenvolvendo um sistema para uma empresa de delivery. 
# O valor da taxa de entrega depende da distância 
# até o cliente e se o pedido foi feito em um dia de chuva.

#As regras são:
#1 - Para entregas até 5 km, a taxa é R$ 5,00.
#2 -Entre 5 e 10 km, a taxa é R$ 8,00.
#3 -Acima de 10 km, a taxa é R$ 10,00.
#4 -Se estiver chovendo, acrescenta R$ 2,00 à taxa padrão.

taxa = 0
verif = False
distancia = float(input("Digite a distancia a percorrer: "))
chuva = input("Está chovendo? (sim/nao): ")

if chuva.lower() == "sim":
    verif = True

elif chuva.lower == "nao":
    verif = False

else:
    print("Valor Inválido!")


if distancia < 5:
    taxa = 5

elif distancia >= 5 and distancia<10:
    taxa = 8

elif distancia >= 10:
    taxa = 10

if verif == True:
    taxa += 2

print(f"Frete total: R$ {taxa:.2f}")
