## 💰 Expense Tracker
A simple Java console application to track and calculate expenses.

---
## 📌 Description
Expense Tracker is a command-line program written in Java that allows users to record their expenses, view a summary, and calculate the total amount spent.
---
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/status-learning-blue?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)
---
## 🚀 Features
1. ✅ Add new expenses with amount, description, and date.
2. ✅ Input validation to ensure correct data entry.
3. ✅ Display a list of recorded expenses.
4. ✅ Calculate the total sum of all expenses.

---
## 📚 What I practiced here
Through this project, I worked on:
✅ Object-Oriented Programming (OOP) concepts (classes, objects, encapsulation)
✅ Handling user input with Scanner
✅ Data validation and error handling using try-catch blocks
✅ Using ArrayList to store and manage data dynamically
✅ Implementing the toString() method to properly display object information
✅ Working with loops and conditions to ensure a smooth user experience
---
## 🧠 Why I built this?
I created this Expense Tracker as a way to reinforce my Java skills, particularly in object-oriented programming (OOP). Managing expenses is a common real-world problem, and this project helps me practice handling user input, data validation, and working with collections like ArrayList.

---
## 🛠️ Technologies Used
- **Java (JDK 17 or higher)**
- **Git (for version control)**
---

## Git (for version control)

## 📂 Project Structure
````
bash
Copy
Edit
ExpenseTracker/
│── src/
│   ├── SpentMain.java       # Main entry point
│   ├── SpentCalculation.java # Expense management logic
│   ├── Expense.java         # Class representing an expense
│── README.md                # Project documentation
│── .gitignore               # Files ignored by Git
````
---

## 🚀 How to Run the Project
Clone the repository

```sh
git clone https://github.com/your-username/ExpenseTracker.git
Compile the project
```
```sh

javac src/*.java
Run the application
```
```sh

java src.SpentMain
```
---
## 📸 Snapshot
This is what you should see in the console when executing the main Java class:
```
Enter the amount spent: 50.75
Enter the description for the amount spent: Groceries
Enter the date in which the amount was spent (DD/MM/YYYY): 29/03/2025
Added: 
Details of the expense:
Amount: $50.75
Description: Groceries
Date: 29/03/2025

Do you want to add another expense? (yes/no): yes

Enter the amount spent: 15.00
Enter the description for the amount spent: Coffee
Enter the date in which the amount was spent (DD/MM/YYYY): 30/03/2025
Added: 
Details of the expense:
Amount: $15.00
Description: Coffee
Date: 30/03/2025

Do you want to add another expense? (yes/no): no

Total expenses recorded: 2

Expenses list:

Details of the expense:
Amount: $50.75
Description: Groceries
Date: 29/03/2025

Details of the expense:
Amount: $15.00
Description: Coffee
Date: 30/03/2025

Total: $65.75

```
---
## 🎯 Future Improvements
-  Add data persistence using files or a database.
-  Implement a graphical user interface (GUI) with JavaFX or Swing.
-  Support for multiple currencies.
---
## 📜 License
This project is licensed under the MIT License.

---
## ❤🖊️ Author
Made with love, curiosity, and coffee by **Leonardo C. 🐼**