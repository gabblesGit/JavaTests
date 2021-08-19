package ru.isys.trainings.task5;

public class Computer {

    protected class ComputerInfo{
        public String os;
        public String cpu;
        public String ram;
    }

    public ComputerInfo Comp = new ComputerInfo();

    public Computer(String os, String cpu, String ram) {
        this.Comp.os = os;
        this.Comp.cpu = cpu;
        this.Comp.ram = ram;
    }

    public ComputerInfo getComp() {
        return this.Comp;
    }

    public static void main(String[] args) {

        Computer cmp = new Computer("WIN", "RYZEN", "32Gb" );

        System.out.println(cmp.getComp().cpu);
    }
}
