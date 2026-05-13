def conversor_euro(a):
    return a / 5.77 

def conversor_dolar(a):
    return a / 4.93 



dinheiro = float(input("Digite o valor em Reais: R$ "))
escolha = input("Deseja converter para qual moeda? ")

if escolha.lower() == "dolar":
    print(f"Em Dólar: $ {conversor_dolar(dinheiro):.2f}")

elif escolha.lower() == "euro": 
    print(f"Em Euro: € {conversor_euro(dinheiro):.2f}")
