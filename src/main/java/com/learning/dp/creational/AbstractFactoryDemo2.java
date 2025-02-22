package com.learning.dp.creational;

//client class where actually the object are created.
public class AbstractFactoryDemo2 {
    public static void main(String[] args) {
        CarFactory europeCarFactory = new EuropeCarFactoryImpl();
        europeCarFactory.createCar().assemble();

        CarFactory northAmericaCarFactory = new AmericaCarFactoryImpl();
        northAmericaCarFactory.createCar().assemble();
    }
}

// it's a main factory i want to create cars globally.
interface CarFactory {
    public Car createCar();
}

interface Car {
    void assemble();
}

class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Sedan is assembled");
    }
}

class HatchBack implements Car {
    @Override
    public void assemble() {
        System.out.println("HatchBack is assembled");
    }
}

class EuropeCarFactoryImpl implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
}

class AmericaCarFactoryImpl implements CarFactory {
    @Override
    public Car createCar() {
        return new HatchBack();
    }
}

