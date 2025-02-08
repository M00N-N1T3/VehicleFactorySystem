# **🚗 Vehicle Factory - Factory Design Pattern**

## **📌 Objective**
The goal of this exercise is to build a **Vehicle Factory** using the **Factory Design Pattern**. The system should dynamically generate different types of vehicles, allow users to interact with them, and manage them efficiently.

This project will help you:  
✔️ Understand **Factory Design Pattern** implementation.  
✔️ Improve **code reusability**, **modularity**, and **scalability**.  
✔️ Implement **OOP principles** like **inheritance, abstraction, and polymorphism**.  
✔️ Introduce **data persistence**, **logging**, and **user interaction**.

---

## **📂 Project Structure**

```
/VehicleFactorySystem
│── src/
│   ├── models/                     # Contains all Vehicle-related classes
│   │   ├── Vehicle.java             # Base Vehicle Interface
│   │   ├── LandVehicle.java         # Abstract Class for Land Vehicles
│   │   ├── AirVehicle.java          # Abstract Class for Air Vehicles
│   │   ├── WaterVehicle.java        # Abstract Class for Water Vehicles
│   │   ├── Car.java                 # Concrete Land Vehicle
│   │   ├── Bike.java                # Concrete Land Vehicle
│   │   ├── Truck.java               # Concrete Land Vehicle
│   │   ├── Plane.java               # Concrete Air Vehicle
│   │   ├── Helicopter.java          # Concrete Air Vehicle
│   │   ├── Boat.java                # Concrete Water Vehicle
│   ├── factory/
│   │   ├── VehicleFactory.java      # Factory for Creating Vehicles
│   ├── services/
│   │   ├── VehicleManager.java      # Manages Vehicle Creation and Interaction
│   ├── ui/
│   │   ├── MainMenu.java            # User Interface for Interacting with Vehicles
│── data/
│   ├── vehicles.json                # JSON file to persist vehicle data
│── logs/
│   ├── system.log                    # Log file for system events
│── README.md                         # Project Documentation
│── .gitignore                        # Git Ignore File
│── LICENSE                           # License File (Optional)
```

---

## **📌 Features & Requirements**

### **🔹 1. Vehicle Classification System**
The system will categorize vehicles into **three main types** using **Abstract Classes**:

| **Category**   | **Example Vehicles** |
|---------------|----------------------|
| **Land Vehicles**  | Car, Bike, Truck |
| **Air Vehicles**   | Plane, Helicopter |
| **Water Vehicles** | Boat, Jet Ski |

#### **Class Hierarchy**
- `Vehicle` (Interface) → Defines `move()`, `fuelType()`, and `capacity()`.
- **Abstract Classes:** `LandVehicle`, `AirVehicle`, `WaterVehicle`.
- **Concrete Classes:** `Car`, `Bike`, `Truck`, `Plane`, `Boat`, etc.

---

### **🔹 2. Factory Design Pattern Implementation**
- **`VehicleFactory` Class**
    - Accepts a **string input** and returns the correct **Vehicle object**.
    - Uses a **switch statement** or **HashMap** for efficiency.
    - Handles **invalid inputs** with an exception.

---

### **🔹 3. User Interaction through `MainMenu`**
The system provides a **menu-based console UI** allowing users to:
1. **Create a Vehicle** (using the Factory Pattern).
2. **View Vehicle Details** (Type, Fuel, Capacity).
3. **List All Created Vehicles** (Stored in memory or JSON file).
4. **Exit the System**.

#### **Example User Flow**
```
Welcome to the Vehicle Management System!  
1. Create a new vehicle  
2. View a vehicle's details  
3. List all vehicles  
4. Exit  
Enter your choice: 1  
Enter vehicle type: Car  
Vehicle Created! Type: Land, Fuel: Petrol, Capacity: 5  
```

---

### **🔹 4. Data Persistence**
- Vehicles created during runtime should be stored in **vehicles.json**.
- Implement a **JSON file reader/writer** using **Jackson** or **Gson**.

#### **Example JSON Structure**
```json
[
    {
        "name": "Car",
        "type": "Land",
        "fuel": "Petrol",
        "capacity": 5
    },
    {
        "name": "Boat",
        "type": "Water",
        "fuel": "Diesel",
        "capacity": 10
    }
]
```

---

### **🔹 5. Logging System**
- Use `java.util.logging` to maintain a **log file (`system.log`)** for tracking events.
- Log whenever:  
  ✔️ A vehicle is created.  
  ✔️ The system encounters an error.  
  ✔️ A user accesses or modifies data.

#### **Example Log Entry**
```
[INFO] 2025-02-07 10:30:21 - Car created successfully.
[ERROR] 2025-02-07 10:32:05 - Invalid vehicle type entered: Spaceship.
```

---

### **🔹 6. Exception Handling**
- Handle **invalid user input** gracefully.
- Provide **meaningful error messages**.
- Use **custom exceptions** for missing vehicle types.

#### **Example**
```
Enter a vehicle name: UFO  
ERROR: "UFO" is not a valid vehicle in the system.
```

---

## **📌 Installation & Running the Application**

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/your-username/VehicleFactorySystem.git
cd VehicleFactorySystem
```

### **2️⃣ Compile the Code**
```sh
javac src/**/*.java
```

### **3️⃣ Run the Application**
```sh
java src.ui.MainMenu
```

---

## **📌 Future Enhancements**
🔹 **GUI Version:** Implement a graphical user interface using JavaFX or Swing.  
🔹 **Database Integration:** Store vehicle data in **MySQL** or **SQLite** instead of JSON.  
🔹 **Advanced Search Filters:** Find vehicles by fuel type, capacity, or category.  
🔹 **REST API Version:** Convert the system into a **RESTful API** using Spring Boot.

---


