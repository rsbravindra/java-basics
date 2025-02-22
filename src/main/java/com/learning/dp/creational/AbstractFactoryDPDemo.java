package com.learning.dp.creational;
/**
 * Abstract Factory Design Pattern is a creational design pattern which provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 * The main goal of the abstract factory design pattern is to encapsulate a group of individual factories that have a common theme.
 * It is a way of encapsulating a group of related or dependent objects without specifying their concrete classes.
 * It also provides a way of encapsulating a group of related or dependent objects without specifying their concrete classes.
 * It is a way of encapsulating a group of individual factories that have a common theme.
 * It is a way of encapsulating a group of related or dependent objects without specifying their concrete classes.
 * The abstract factory provides a way of encapsulating a group of individual factories that have a common theme.
 * In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create concrete objects that are part of the theme.

 * Real time examples of Abstract Factory Design Pattern are:
 * 1. Factory pattern for getting database connection object of a particular type (e.g. Oracle, SQL Server etc.)
 * 2. Creating a factory for getting a particular type of object (e.g. Animal, Vehicle etc.)
 * 3. Creating a factory for getting a particular type of parser (e.g. JSON parser, XML parser etc.)
 * 4. Creating a factory for getting a particular type of UI components (e.g. Button, Textbox etc.)
 * 5. Creating a factory for getting a particular type of logger (e.g. File logger, Console logger etc.)
 * 6. Creating a factory for getting a particular type of cache (e.g. Memory cache, Disk cache etc.)
 * 7. Creating a factory for getting a particular type of messaging service (e.g. SMTP, POP3 etc.)
 * 8. Creating a factory for getting a particular type of encryption algorithm (e.g. AES, RSA etc.)
 */


// Abstract Factory Pattern Example

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factory 1
class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

// Concrete Factory 2
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Abstract Product A
interface Button {
    void paint();
}

// Abstract Product B
interface Checkbox {
    void paint();
}

// Concrete Product A1
class WinButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in Windows style.");
    }
}

// Concrete Product B1
class WinCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style.");
    }
}

// Concrete Product A2
class MacButton implements Button {
    public void paint() {
        System.out.println("Rendering a button in macOS style.");
    }
}

// Concrete Product B2
class MacCheckbox implements Checkbox {
    public void paint() {
        System.out.println("Rendering a checkbox in macOS style.");
    }
}
public class AbstractFactoryDPDemo {
    public static void main(String[] args) {
        GUIFactory factory = new WinFactory();
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }
}


