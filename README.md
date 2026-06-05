# Bank Management System
[![Ask DeepWiki](https://devin.ai/assets/askdeepwiki.png)](https://deepwiki.com/alevvio/BankManagementSystem)

A comprehensive Bank Management System built with Java Swing. This desktop application simulates the core functionalities of an Automated Teller Machine (ATM), providing a user-friendly graphical interface for various banking operations backed by a MySQL database.

## Features

*   **Secure User Authentication:** Login with a unique card number and PIN.
*   **Multi-Step User Registration:** A detailed 3-page form for new user account creation. Upon completion, a unique 16-digit card number and a 4-digit PIN are generated.
*   **Account Transactions:**
    *   **Deposit:** Add funds to your account.
    *   **Withdrawal:** Withdraw cash, with validation to prevent overdrawing.
    *   **Fast Cash:** Quick withdrawal of predefined amounts (Rs 100, Rs 500, Rs 1000, etc.).
*   **Account Management:**
    *   **Balance Enquiry:** Check the current account balance.
    *   **PIN Change:** Securely update your account PIN.
    *   **Mini Statement:** View a summary of recent transactions.

## Technology Stack

*   **Frontend:** Java Swing
*   **Backend:** Java
*   **Database:** MySQL
*   **Database Connectivity:** Java Database Connectivity (JDBC)
*   **Libraries:** JCalendar library for date selection.

## Setup and Installation

### Prerequisites

*   Java Development Kit (JDK) 1.8 or higher.
*   MySQL Server.
*   A Java IDE like NetBeans, IntelliJ IDEA, or Eclipse.

### 1. Database Setup

You need to set up a MySQL database and create the necessary tables for the application to function.

1.  Open your MySQL client (e.g., MySQL Workbench, command line).

2.  Create the database:
    ```sql
    CREATE DATABASE bankmanagementsystem;
    ```

3.  Use the newly created database:
    ```sql
    USE bankmanagementsystem;
    ```

4.  Execute the following SQL commands to create the required tables:

    ```sql
    -- Table for storing personal details from the first signup page
    CREATE TABLE signup (
        formno VARCHAR(20),
        name VARCHAR(50),
        fname VARCHAR(50),
        dob VARCHAR(20),
        gender VARCHAR(10),
        email VARCHAR(50),
        marital VARCHAR(20),
        address VARCHAR(100),
        city VARCHAR(50),
        pincode VARCHAR(20),
        state VARCHAR(50)
    );

    -- Table for storing additional details from the second signup page
    CREATE TABLE signup2 (
        formno VARCHAR(20),
        religion VARCHAR(20),
        category VARCHAR(20),
        income VARCHAR(30),
        education VARCHAR(50),
        occupation VARCHAR(50),
        pan VARCHAR(20),
        aadhar VARCHAR(20),
        scitizen VARCHAR(5),
        eaccount VARCHAR(5)
    );

    -- Table for storing account details from the third signup page
    CREATE TABLE signup3 (
        formno VARCHAR(20),
        atype VARCHAR(50),
        cardno VARCHAR(25),
        pin VARCHAR(10),
        facility VARCHAR(200)
    );

    -- Table for authentication/login
    CREATE TABLE login (
        formno VARCHAR(20),
        cardno VARCHAR(25),
        pin VARCHAR(10)
    );

    -- Table for storing all bank transactions
    CREATE TABLE bank (
        pin VARCHAR(10),
        date VARCHAR(50),
        mode VARCHAR(20),
        amount VARCHAR(20)
    );
    ```

### 2. Application Setup

1.  Clone the repository to your local machine:
    ```bash
    git clone https://github.com/alevvio/BankManagementSystem.git
    ```

2.  Open the project in your preferred Java IDE. As this is a NetBeans project, opening it in NetBeans is recommended for seamless setup.

3.  Navigate to the database connection file: `src/ASimulatorSystem/Conn.java`.

4.  Update the MySQL database credentials (username and password) if they differ from the defaults:
    ```java
    // Inside the Conn() constructor
    c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "root");
    // Change "root" and "root" to your MySQL username and password respectively.
    ```

5.  Ensure the required libraries (MySQL JDBC Driver and JCalendar) are added to your project's build path. If you are using NetBeans, the project should automatically recognize the dependencies listed in `project.properties`.

### 3. Running the Application

*   The main entry point for the application is `src/ASimulatorSystem/Login.java`.
*   Compile and run the `Login.java` file from your IDE to start the ATM simulator.

## How to Use

1.  On launching the application, you will be greeted with the **Login** screen.
2.  If you are a new user, click the **SIGN UP** button.
3.  Proceed through the three-page registration form, filling in your personal, additional, and account details.
4.  Upon successful registration, a unique **Card Number** and **PIN** will be generated and displayed. Make sure to note these down.
5.  Return to the login screen and enter your credentials to **SIGN IN**.
6.  Once logged in, you will be directed to the **Transactions** menu.
7.  From here, you can select any of the available banking operations: Deposit, Cash Withdrawal, Fast Cash, Mini Statement, PIN Change, or Balance Enquiry.
8.  Click **EXIT** to close the application.
