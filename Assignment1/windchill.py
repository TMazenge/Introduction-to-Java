import math

# Ask the user for the values of t and v.
t_value = float(input('What is the t value: '))
v_value = float(input('What is the v value: '))

# Checks if t and v are valid.
if t_value < -50 or t_value > 50:
	print('Invalid value of t!')
elif v_value < 3 or v_value > 120:
	print('Invalid value of v!')
else:
	# Calculates the value of windchill.
	wind_chill = 35.74 + (0.6215 * t_value) + ((0.4275 * t_value) - 35.75) * (math.pow(v_value, 0.16))
	print(wind_chill)