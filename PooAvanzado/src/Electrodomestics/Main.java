package Electrodomestics;

public class Main {
    public static void main(String[] args) {
        Electrodomestic iron = new Electrodomestic();
        System.out.println("The iron has a weight of " + iron.getWeight() + " kg, a color of " + iron.getColor() + " and a price of " + iron.getPriceBase() + " euros.");

        WashingMachine washingMachine = new WashingMachine(200, 22);
        System.out.println("The washing machine has a weight of " + washingMachine.getWeight() + " kg, a color of " + washingMachine.getColor() + " and a price of " + washingMachine.getPriceBase() + " euros.");

        Television television = new Television(500, "cyan", 'K', 10, 40, true);
        System.out.println("The television has a weight of " + television.getWeight() + " kg, a color of " + television.getColor() + " an energetic consumption of " + television.getEnergeticConsumption() + " and a price of " + television.getPriceBase() + " euros.");

        Electrodomestic [] electrodomestics = new Electrodomestic[6];

        electrodomestics [0] = new Electrodomestic();
        electrodomestics [1] = new WashingMachine(200, 18);
        electrodomestics [2] = new Television(380, "black", 'F', 20, 40, true);
        electrodomestics [3] = new Electrodomestic(150, 20);
        electrodomestics [4] = new WashingMachine();
        electrodomestics [5] = new Television(600, "white", 'A', 40, 10, false);

        int countElectrodomestic = 0, countWashingMachine = 0, countTelevision = 0;

        for (int i = 0; i < electrodomestics.length; i++) {
            countElectrodomestic++;
            if (electrodomestics[i] instanceof WashingMachine){ //instanceof sirve para comprobar si dentro del la posicion del array electrodomestic es un WashingMachine
                countWashingMachine++;
                WashingMachine w = (WashingMachine) electrodomestics[i]; //downcasting
                System.out.println("load of washingmachine is: " + w.getLoad());
            } else if (electrodomestics[i] instanceof Television) {
                countTelevision++;
                Television t = (Television) electrodomestics[i];
                System.out.println("The resolution of TV is: " + t.getResolution());
            }
        }
    }
}