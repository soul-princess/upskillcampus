# AgriPreneur Support Network
# Internship Project - Python

def register_user():
    print("\n--- Farmer / AgriPreneur Registration ---")
    name = input("Enter Name: ")
    location = input("Enter Location: ")
    crop = input("Enter Main Crop: ")
    contact = input("Enter Contact Number: ")

    print("\nRegistration Successful!")
    print("Name:", name)
    print("Location:", location)
    print("Crop:", crop)
    print("Contact:", contact)


def view_schemes():
    print("\n--- Government Schemes ---")
    schemes = [
        "PM-KISAN Yojana",
        "Soil Health Card Scheme",
        "Pradhan Mantri Fasal Bima Yojana",
        "National Agriculture Market (eNAM)"
    ]

    for scheme in schemes:
        print("-", scheme)


def market_prices():
    print("\n--- Market Prices (Sample Data) ---")
    prices = {
        "Rice": "₹45/kg",
        "Wheat": "₹38/kg",
        "Maize": "₹30/kg",
        "Cotton": "₹65/kg"
    }

    for crop, price in prices.items():
        print(crop, ":", price)


def expert_support():
    print("\n--- Expert Support ---")
    print("Agriculture Officer: 1800-180-1551")
    print("Krishi Vigyan Kendra: 1800-233-4000")
    print("Email Support: agrisupport@gmail.com")


def main_menu():
    while True:
        print("\n===== AgriPreneur Support Network =====")
        print("1. Register Farmer / AgriPreneur")
        print("2. View Government Schemes")
        print("3. View Market Prices")
        print("4. Expert Support")
        print("5. Exit")

        choice = input("Enter your choice (1-5): ")

        if choice == "1":
            register_user()
        elif choice == "2":
            view_schemes()
        elif choice == "3":
            market_prices()
        elif choice == "4":
            expert_support()
        elif choice == "5":
            print("\nThank you for using AgriPreneur Support Network!")
            break
        else:
            print("Invalid choice! Please try again.")


# Program starts here
main_menu()
