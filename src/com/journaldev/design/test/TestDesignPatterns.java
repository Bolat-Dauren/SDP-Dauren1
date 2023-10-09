package com.journaldev.design.test;
//пакеты используются в джава для организации и структурирования классов что позволяют избегать конфликтов имен

import com.journaldev.design.abstractfactory.PCFactory;
import com.journaldev.design.abstractfactory.ServerFactory;

import com.journaldev.design.model.Computer;

public class TestDesignPatterns {
    public static void main(String[] args) {
        testAbstractFactory();
    }
    //этот метод testAbstractFactory() выполняет тестирование абстрактных фабрик
    //внутри него создаются объекты Computer с использованием абстрактных фабрик PCFactory и ServerFactory которые предоставляют конфигурацию для компьютеров типа PC и сервера соответственно

    private static void testAbstractFactory() {
        Computer pc = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));

        //этот код создает объект компьютера типа PC с заданными характеристиками RAM (2 GB), HDD (500 GB) и CPU (2.4 GHz), используя фабрику PCFactory
        //фабрика PCFactory внутри вызывает метод createComputer() который создает объект PC с указанными характеристиками

        Computer server = com.journaldev.design.abstractfactory.ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}