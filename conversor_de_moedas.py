def conversor_euro(a):
    return a / 5.77 

def conversor_dolar(a):
    return a / 4.93

def conversor_franco_suico(a):
    return a / 6.38

def conversor_dolar(a):
    return a / 4.93 

def conversor_peso_argentino(a):
    return a* * 279



dinheiro = float(input("Digite o valor em Reais: R$ "))
escolha = input("Deseja converter para qual moeda? ")

if escolha.lower() == "dolar":
    print(f"Em Dólar: $ {conversor_dolar(dinheiro):.2f}")

elif escolha.lower() == "euro": 
    print(f"Em Euro: € {conversor_euro(dinheiro):.2f}")

elif escolha.lower() == "franco suico": 
    print(f"Em Franco Suiço:  {conversor_franc0_suico(dinheiro):.2f}")

elif escolha.lower() == "peso argentino": 
    print(f"Em Peso Argentino:  {conversor_peso_argentino(dinheiro):.2f}")
