class CPU {

    int price;

    CPU(int price) {
        this.price = price;
    }

    void display() {
        System.out.println("Price of CPU: " + price);
    }

    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Number of cores: " + cores);
            System.out.println("Manufacturer of processor: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int mem, String m) {
            memory = mem;
            manufacturer = m;
        }

        void display() {
            System.out.println("Memory: " + memory);
            System.out.println("Manufacturer of RAM: " + manufacturer);
        }
    }
}

class Main {
    public static void main(String[] args) {

        CPU obj = new CPU(222000);
        CPU.Processor pro = obj.new Processor(3, "Intel");
        CPU.RAM rm = new CPU.RAM(32, "Dell");

        obj.display();
        pro.display();
        rm.display();
    }
}

