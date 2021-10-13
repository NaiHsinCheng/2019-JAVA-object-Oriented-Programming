a = input()
a=int(a)
epsilon = 0.01
guess = a /2.0
while abs(guess*guess - a) >= epsilon:
    guess = guess - (((guess**2) - a)/(2*guess))
print(guess)
