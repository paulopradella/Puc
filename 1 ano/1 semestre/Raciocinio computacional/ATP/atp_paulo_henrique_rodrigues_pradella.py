import datetime
from decimal import Decimal

def obter_limite():
    hora = datetime.datetime.now().time()
    hora = (hora.strftime("%H%M"))
    ano_atual = datetime.datetime.today().year
    print("-" * 59)
    print("\*/\*/\*/\*/\*/\*/\*/\DARK SIDE STORE/\*/\*/\*/\*/\*/\*/\*/")
    print(("-" * 59) , "\n")
    if hora <= "12":
        print("Bom dia! Como você está?\nEspero que esteja bem!")
    elif hora > "12" and hora < "18":
        print("Boa tarde! Como você está?\nEspero que esteja bem!")
    elif hora >= "18":
        print("Boa Noite! Como você está?\nEspero que esteja bem!")
    print("\nSeja bem vindo à DARK SIDE STORE!")
    print("Meu nome é Paulo Henrique Rodrigues Pradella.")
    print("E eu irei fazer a análise do seu limite, por favor:\n")

    cargo_empresa = input("\nInforme o seu cargo atual?\n")

    while True:
        try:
            salario = Decimal(input("\nInforme o seu último salário:\n"))
            if not salario > 0:
                raise ValueError("O salário informado é inválido.\nPor Favor:")
        except:
            print("\nO salário informado é inválido.\nPor Favor:")
        else:
            break

    while True:
        try:
            ano_nascimento = int(input("\nInforme seu ano de nascimento?\n"))
            if not  ano_atual > ano_nascimento or ano_nascimento <= 1000:
                raise ValueError("O ano informado é inválido.\nPor Favor:")
        except ValueError as e:
            print("\nO ano informado é inválido.\nPor Favor:")
        else:
            break

    idade_aproximada = ano_atual - ano_nascimento
    limite = round(salario * Decimal(idade_aproximada / 1000) + 100 , 2)

    print("\nConforme o informado:\n")
    print("Você atualmente é:" , cargo_empresa.upper())
    print("Seu último salário foi de R$:{:.2f}".format(salario))
    print("Você nasceu em:" , ano_nascimento)
    print("Sua idade aproximada é de:", idade_aproximada , "anos.")
    print("Com base nas informações passadas seu limite é de R${:.2f}" .format(limite) , "\n")
    while True:
        validacao = input("\nAs informações estão corretas (S/N)?\n")
        if validacao == "s" or validacao == "S":
            print("\nMaravilha!\nVamos continuar então!\n")
            break
        elif validacao == "n" or validacao == "N":
            print("\nEscolha a informação que deseja alterar:\n")
            opcao = int(input("1 - Cargo\n2 - Salário\n3 - Ano de Nascimento\n"))
            if opcao == 1:
                cargo_empresa = input("\nInforme o seu cargo atual?\n")
            elif opcao == 2:
                while True:
                    try:
                        salario = Decimal(input("\nInforme o seu último salário:\n"))
                        if not salario > 0:
                            raise ValueError("O salário informado é inválido.\nPor Favor:")
                    except:
                        print("\nO salário informado é inválido.\nPor Favor:")
                    else:
                        break
            elif opcao == 3:
                while True:
                    try:
                        ano_nascimento = int(input("\nInforme seu ano de nascimento?\n"))
                        if not  ano_atual > ano_nascimento or ano_nascimento <= 1000:
                            raise ValueError("O ano informado é inválido.\nPor Favor:")
                    except ValueError as e:
                        print("\nO ano informado é inválido.\nPor Favor:")
                    else:
                        break
            idade_aproximada = ano_atual - ano_nascimento
            limite = round(salario * Decimal(idade_aproximada / 1000) + 100 , 2)
            print("\nConforme atualização de informações:\n")
            print("Você atualmente é:" , cargo_empresa.upper())
            print("Seu último salário foi de R$:{:.2f}".format(salario))
            print("Você nasceu em:" , ano_nascimento)
            print("Sua idade aproximada é de:", idade_aproximada , "anos.")
            print("Com base nas informações passadas seu limite é de R${:.2f}" .format(limite) , "\n")
        else:
            print("\nA opção escolhida é inválida\nEscolha uma opção válida.")

    return (Decimal(limite) , idade_aproximada)

def verifica_produto(limite):

    produto = input("\nInforme o nome do produto:\n")
    compras_produtos.append (produto.upper())
    while True:
        try:
            preco = Decimal(input("\nInforme o preço do produto?\n"))
            if not  preco > 0:
                raise ValueError("O preço informado é inválido.\nPor favor:")
        except:
            print("O formato do preço informado é inválido.\nPor favor:")
        else:
            break

    nome_completo = "Paulo Henrique Rodrigues Pradella"
    primeiro_nome = "Paulo"
    desconto = round(preco - preco * (Decimal(len(primeiro_nome)) / 100) , 2)
    sobra_limite = round((limite - preco), 2)
    condicao = "Bloqueada"

    print("\nO total da sua compra é de R$:{:.2f}" .format(preco))
    print("Com base em seu limite sua compra foi:")

    if (preco <= Decimal(limite) * Decimal("0.60")):
        print("Liberada!\nSeu novo limite é de R$:{:.2f}" .format(sobra_limite))
        condicao = "Liberada"
    elif (preco > (Decimal(limite) * Decimal("0.60")) and preco < (Decimal(limite) * Decimal("0.90"))):
        print("Liberada ao parcelar em até 2 vezes.\nSeu novo limite é de R$:{:.2f}" .format(sobra_limite))
        condicao = "Liberada em 2 vezes"
    elif (preco >= (Decimal(limite) * Decimal("0.90")) and preco <= (Decimal(limite) * Decimal("1"))):
        print("Liberada ao parcelar em até 3 vezes.\nSeu novo limite é de R$:{:.2f}" .format(sobra_limite))
        condicao = "Liberada em 3 vezes"
    if (preco >= int(len(nome_completo)) and preco <= idade_aproximada):
        print("PARABÉNS!!! Você receberá um desconto de" , len(primeiro_nome) , "%." ,
        "\nO novo valor do seu produto é de R$:{:.2f}".format(desconto) ,
        "\nSeu novo limite é de R$:{:.2f}" .format(limite - desconto))
        condicao = "Liberada com desconto"
        preco = desconto
        sobra_limite = round(limite - desconto ,2)
    compras_precos.append(preco)
    condicao_pagamento.append(condicao)
    if (preco > Decimal(limite) * Decimal("1")):
        print("BLOQUEADA!\nSeu limite é de: R$:{:.2f}" .format(limite))
        print("Limite insuficiente para este produto.\n")
        sobra_limite = limite
        compras_produtos.remove (produto.upper())
        compras_precos.remove(preco)
        condicao_pagamento.remove(condicao)
    if (sobra_limite == 0):
        print("Infelizemente seu limite acabou!")

    return Decimal(sobra_limite)

limite , idade_aproximada = obter_limite()

compras = []
compras_produtos =[]
compras_precos =[]
condicao_pagamento = []
soma_dos_precos = 0

while True:
    try:
        qtd_produto = int(input("Por favor, informe quantos produtos você deseja comprar?\n"))
        if not  qtd_produto > 0:
            raise ValueError("A quantidade informada é inválida.")
    except ValueError as e:
        print("A quantidade informada é inválida.")
    else:
        break

for qtd_produto in range(qtd_produto):
    sobra_limite = verifica_produto(limite)
    limite = sobra_limite
    if limite == 0:
        break

for preco in compras_precos:
    soma_dos_precos = sum(compras_precos)
if soma_dos_precos == 0:
    print("\nObrigado por visitar a DARK SIDE STORE!\nInfelizmente não pudemos liberar a sua compra")
else:
    print("-" * 59)
    print("\*/\*/\*/\*/\*/\*/\*/\DARK SIDE STORE/\*/\*/\*/\*/\*/\*/\*/")
    print("-" * 59)
    print("\nObrigado por comprar na DARK SIDE STORE!\n")
    print("-" * 58)
    print("\n{:25}{:>1}{:>29}".format("Produto" , "Preço", "Condição de Pagamento\n"))
    for compras_produtos , compras_precos , condicao_pagamento in zip(compras_produtos , compras_precos , condicao_pagamento):
        print(("{:25}R${:>6.2f}{:>25}".format(compras_produtos , compras_precos , condicao_pagamento)))
    print("\n\n")
    print("-" * 59)
    print("O total da sua compra é de R$:{:.2f}" .format(soma_dos_precos))
    print("-" * 59)
    print("\nVolte sempre!\n\nMAY THE FORCE BE WITH YOU\n")
