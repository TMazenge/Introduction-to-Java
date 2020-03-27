# Asks the user for mass and height.

mass = int(input('What is your body mass: '))
height  = int(input('What is your height: '))

# Calculate the bmi.
bmi =(mass / (height * height)) * 703

print(bmi)