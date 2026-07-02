# 🏦 Java ATM Management System

A simple **Console-Based ATM Management System** developed in **Java**. This project simulates basic ATM operations such as user authentication, balance inquiry, money transfer, deposit, and withdrawal using arrays to store account information.

## 📌 Features

- 🔐 Account Login
  - Account Number Verification
  - PIN Verification
  - OTP (One-Time Password) Authentication

- 💰 Balance Inquiry

- 💸 Money Transfer
  - Transfer funds between existing accounts
  - Displays transaction receipt

- 📥 Deposit Money

- 📤 Withdraw Money

- 🔄 Logout and Login with another account

- ❌ Exit Application

---

## 🛠 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Scanner Class
- Java Random Class

---

## 📂 Project Structure

```
ATM-System/
│
├── App.java          # Main class
├── Data.java         # Stores account data
├── Function.java     # ATM operations
└── README.md
```

---

## 📋 Sample Accounts

| Account Number | Account Title | PIN | Balance |
|---------------|---------------|-----|---------|
| 0101-123 | Mr. Ali | 1234 | 50,000 |
| 0101-456 | Mr. Ahmed | 5678 | 60,000 |
| 0101-789 | Mr. Raza | 9012 | 70,000 |
| 0101-012 | Mr. Huzaifa | 3456 | 80,000 |
| 0101-345 | Mr. Umair | 7890 | 90,000 |

---

## 🚀 How to Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/ATM-System.git
```

### 2. Open the project

Open the project in your preferred Java IDE:

- IntelliJ IDEA
- Eclipse
- VS Code

### 3. Compile

```bash
javac *.java
```

### 4. Run

```bash
java App
```

---

## 📸 Program Flow

```
Start
   │
   ▼
Enter Account Number
   │
   ▼
Enter PIN
   │
   ▼
OTP Verification
   │
   ▼
Login Successful
   │
   ▼
ATM Menu
   │
   ├── Balance Check
   ├── Money Transfer
   ├── Deposit
   ├── Withdraw
   ├── Logout
   └── Exit
```

---

## 📖 Concepts Used

- Classes & Objects
- Inheritance
- Arrays
- Methods
- Loops
- Conditional Statements
- User Input (Scanner)
- Random Number Generation
- Console-Based Interface

---

## ⚠ Current Limitations

- Uses arrays instead of a database.
- Account information is hardcoded.
- OTP is displayed on the console (for demonstration purposes).
- No transaction history.
- Limited input validation.
- Multiple `Scanner` objects are used.
- Recursive method calls can be replaced with loops for better performance.

---

## 🔮 Future Improvements

- Store accounts in a database (MySQL).
- Implement transaction history.
- Add account creation and deletion.
- Encrypt user PINs.
- Improve OTP verification.
- Enhance error handling.
- Convert the application into a GUI using Java Swing or JavaFX.
- Follow MVC architecture.

---

## 👨‍💻 Author

Developed as a Java learning project to practice:

- Object-Oriented Programming (OOP)
- Java Fundamentals
- ATM System Logic
- Console Application Development

---

## 📄 License

This project is open-source and available under the **MIT License**.

---

⭐ If you found this project helpful, consider giving it a **star** on GitHub!
