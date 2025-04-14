country_data = []
while True:
    country_name = input("Enter country name (or leave blank to stop): ")
    if country_name == "":
        break
    population = int(input("Enter population: "))
    area = float(input("Enter area: "))
    country_data.append([country_name, population, area])
total_density = 0
lowest_density = float('inf')
lowest_density_country = ""
for country in country_data:
    population = country[1]
    area = country[2]
    density = population / area
    total_density += density
    if density < lowest_density:
        lowest_density = density
        lowest_density_country = country[0]
average_density = total_density / len(country_data)
print(f"Average density: {average_density}")
print(f"Country with lowest density: {lowest_density_country}")
