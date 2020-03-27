# Asks the user for day, month and year.

m = int(input('What is your month of birth: '))
d = int(input('What is your day of birth: '))
y = int(input('What is your year of birth: '))

# Calculates the actual day of birth.

y1 = y - (14 - m) / 12
x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400)
m1 = m - 2 + (12 * ((14 - m) / 12)))
d1 = d + x + ((31 * m1) / 12)) % 7

days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
print(days[int(d1)])



