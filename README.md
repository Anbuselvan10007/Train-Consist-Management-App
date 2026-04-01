# Train-Consist-Management-App

Train Consist Management App is a console-based Java project that demonstrates Java Collections Framework and Stream API concepts through railway bogie management use cases.

## Technologies

- Java
- ArrayList
- HashSet
- LinkedList
- LinkedHashSet
- HashMap
- Comparator
- Stream API

## Use Cases Completed

### UC1 - Initialize Train and Display Consist Summary
- Created the Java application entry point.
- Initialized the train consist.
- Displayed the initial bogie count.

### UC2 - Add Passenger Bogies to Train
- Used `ArrayList` operations.
- Added, removed, and checked bogies dynamically.

### UC3 - Track Unique Bogie IDs
- Used `HashSet`.
- Prevented duplicate bogie IDs automatically.

### UC4 - Maintain Ordered Bogie Consist
- Used `LinkedList`.
- Inserted and removed bogies while preserving physical order.

### UC5 - Preserve Insertion Order of Bogies
- Used `LinkedHashSet`.
- Preserved insertion order and uniqueness together.

### UC6 - Map Bogie to Capacity
- Used `HashMap<String, Integer>`.
- Mapped bogie names to seating or load capacity.

### UC7 - Sort Bogies by Capacity
- Modeled bogies as custom Java objects.
- Used `Comparator.comparingInt()` to sort by capacity.

### UC8 - Filter Passenger Bogies Using Streams
- Reused the bogie object list from UC7.
- Used `stream()`, `filter()`, and `toList()` to select high-capacity bogies.

## Current Files

- `Main.java`
- `Train.java`
- `Bogie.java`

## How to Run

```powershell
javac Main.java Train.java Bogie.java
java Main
```

## Git Branches

- `main`
- `feature/UC1`
- `feature/UC2`
- `feature/UC3`
- `feature/UC4`
- `feature/UC5`
- `feature/UC6`
- `feature/UC7`
- `feature/UC8`
