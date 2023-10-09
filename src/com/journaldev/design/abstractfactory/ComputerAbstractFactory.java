package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
public interface ComputerAbstractFactory {
    public Computer createComputer();
    //эта строка объявляет интерфейс ComputerAbstractFactory
    //эта строка определяет методы которые должны быть реализованы в классах которые реализуют этот интерфейс
}