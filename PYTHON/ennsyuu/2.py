a = input()
a=int(a)
epsilon = 0.01
low = 0.0
high = a
guess = (high + low) / 2.0

while abs(guess**2 - a) >=epsilon:
    if guess**2 < a:
        low = guess
    else:
        high = guess
    guess = (high + low) / 2.0
print(guess)
        
