package vehicles;

public class TestVehicle {
    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println("The chassis number is " + vehicle1.getChassisNo());
        System.out.println(vehicle1.toString());

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println("The chassis number is " + vehicle2.getChassisNo());
        System.out.println(vehicle2.toString());

        // Mengubah static variable MAKE lewat vehicle2 (berlaku untuk semua instance)
        Vehicle.setMake("Seer");
        System.out.println("\n--- Setelah MAKE diubah menjadi Seer ---");
        System.out.println(vehicle1.toString());
        System.out.println(vehicle2.toString());

        // Membuat object static nested class Engine (vehicle3)
        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("\nVehicle number " + vehicle3.getChassisNo()
                + " is a " + vehicle3.getModel()
                + " model and has an engine capacity of " + Vehicle.Engine.getEngineCapacity() + "cc");

        // Catatan: vehicle1 dan vehicle2 tidak memiliki akses ke method/field khusus di Engine
        // karena mereka bertipe Vehicle, bukan Vehicle.Engine.

        printTotalVehicles();
    }

    public static void printTotalVehicles() {
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}