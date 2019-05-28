soma_multiplos = 0
print("Multiplos de 3 ou 5: ")

for i in range(1, 1000):
    if i % 3 == 0 or i % 5 == 0:
        print("\t" + str(i))
        soma_multiplos += i

print("A soma dos multiplos de 3 ou 5 é: " + str(soma_multiplos))