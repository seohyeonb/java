public class Homework5 {
    public static void main(String[] args) {
        Computer com = new Computer("Core i7", "16GB", "2TB", "White", 500);
        Monitor mon = new Monitor(24, "Black", 45);

        com.turnOn();
        mon.turnOn();

        com.printSpec();
        mon.printSpec();
    }
}

class Computer {
    String cpu;
    String memory;
    String hdd;
    String color;
    int power;

    Computer(String cpu, String memory, String hdd, String color, int power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }

    void turnOn() {
        System.out.println("Turning on the computer.");
    }

    void printSpec() {
        System.out.println("The spec of the computer");
        System.out.println("    CPU: " + cpu);
        System.out.println("    Memory: " + memory);
        System.out.println("    HDD: " + hdd);
        System.out.println("    Color: " + color);
        System.out.println("    Power: " + power + "W");
    }
}

class Monitor {
    int size;
    String color;
    int power;

    Monitor(int size, String color, int power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    void printSpec() {
        System.out.println("The spec of the monitor");
        System.out.println("    Size: " + size + " inch");
        System.out.println("    Color: " + color);
        System.out.println("    Power: " + power + "W");
    }
}
