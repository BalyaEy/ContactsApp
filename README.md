# Contacts App

This project is a simple console-based contact directory application built in Java. It is designed to help you practice basic Object-Oriented Programming (OOP) principles and collection frameworks (such as ArrayList) while implementing basic CRUD (Create, Read, Update, Delete) operations.

## Project Purpose

- To reinforce OOP concepts in Java (classes, objects, encapsulation).
- To practice using collection classes to manage data.
- To build a simple application that allows users to add, delete, search, and list contact information via a console-based menu.

## Features

- **Add Contact:** Create a new contact record by providing name, phone, and email.
- **Delete Contact:** Remove a contact based on the phone number.
- **Search Contact:** Find a contact using the phone number.
- **List All Contacts:** Display all saved contacts in the directory.
- **User-friendly Console Menu:** Navigate the application using a simple, text-based menu.

## Technologies

- Java SE (Standard Edition)
- Java Collections (ArrayList)
- Console-based User Interface

## Project Structure

The project follows the structure below:
ContactsApp/
├── README.md
├── .gitignore
└── src
└── main
└── java
└── com
└── example
└── contacts
├── model
│ └── Person.java
├── service
│ └── RehberService.java
└── Main.java


## Installation and Running Instructions

1. **Clone the Repository:**

   Open your terminal and run:
git clone https://github.com/BalyaEy/ContactsApp.git

2. **Navigate to the Project Directory:**
  Open your terminal and run:
cd ContactsApp

3. **Open the Project:**

- Use your preferred IDE (IntelliJ IDEA, Eclipse, etc.) to open the project, or proceed to compile and run via the terminal.

4. **Compile and Run via Terminal (Optional):**

- **Compile:**
  ```
  javac -d bin src/main/java/com/example/contacts/*.java src/main/java/com/example/contacts/model/*.java src/main/java/com/example/contacts/service/*.java
  ```
- **Run:**
  ```
  java -cp bin com.example.contacts.Main
  ```

## How to Use

When you run the application, you will be presented with a menu:

1. **Add Contact:** Choose option "1" and enter the details (name, phone, email) to add a new contact.
2. **Delete Contact:** Choose option "2", then enter the phone number of the contact you wish to delete.
3. **Search Contact:** Choose option "3" and enter the phone number to find a specific contact.
4. **List All Contacts:** Choose option "4" to display all contacts.
5. **Exit:** Choose option "5" to terminate the application.

## Contributing

If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with descriptive messages.
4. Create a pull request to merge your changes into the main project.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
