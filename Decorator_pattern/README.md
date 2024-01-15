### Problem Statement
The Decorator pattern in Java is a structural pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. A real-life example without code could be decorating a car.

Imagine you have a base model of a car that has basic features like an engine, wheels, and a basic interior. Now, you want to add additional features to the car without modifying its original structure.

1. **Basic Car (Component):**
    - Engine
    - Wheels
    - Basic Interior
2. **Decorators:**
    - **GPS Decorator:**
        - Adds a GPS navigation system to the car.
    - **Leather Seats Decorator:**
        - Upgrades the interior with leather seats.
    - **Sunroof Decorator:**
        - Adds a sunroof to the car.

Now, you can create different configurations of the car by combining these decorators with the basic car:

- **Car with GPS and Leather Seats:**
    - Engine
    - Wheels
    - Basic Interior
    - GPS
    - Leather Seats
- **Car with Sunroof:**
    - Engine
    - Wheels
    - Basic Interior
    - Sunroof

This way, you can dynamically add or remove features from the basic car without modifying its original structure. The Decorator pattern allows you to build flexible and reusable objects in a way that is easy to understand and extend.