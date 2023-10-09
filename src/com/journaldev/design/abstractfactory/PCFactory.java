package com.journaldev.design.abstractfactory;
import com.journaldev.design.model.Computer;
import com.journaldev.design.model.PC;
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;
    public PCFactory(String ram, String hdd, String cpu){ //конструктор инициализирует поля ram, hdd и cpu объекта PCFactory переданными значениями
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}