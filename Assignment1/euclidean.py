import math
# Ask the user for the positions.

x_one = float(input('What is the initial x position: '))
y_one = float(input('What is the initial y position: '))
x_two = float(input('What is the final x position: '))
y_two = float(input('What is the final y position: '))

x_change = x_two - x_one
y_change = y_two - y_one

dis = (x_change * x_change) + (y_change * y_change)
euclidean = math.sqrt(dis)

print(euclidean)