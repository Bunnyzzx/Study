idade = int(input("Digite sua idade"))

x = int(input("Você é estudante? (1- sim | 2- nao)"))

if idade < 18 or x==1:
    print("Você pode receber o desconto!")

else:
    print("Você não pode receber o desconto!")