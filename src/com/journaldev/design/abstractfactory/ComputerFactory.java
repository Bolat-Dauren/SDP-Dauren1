package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
        //внутри метода getComputer вызывается метод createComputer() фабрики,
        // переданной в качестве параметра, и возвращается созданный объект класса Computer
    }
}