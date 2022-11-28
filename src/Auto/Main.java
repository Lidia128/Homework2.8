package Auto;
import Auto.categore.CategoreB;
import Auto.categore.CategoreC;
import Auto.categore.CategoreD;
import Auto.driver.Driver;
import Auto.driver.DriverB;
import Auto.driver.DriverC;

import java.util.List;
import java.util.Objects;
public class Main {

    public static void main(String[] args) {
        Mehanik<Car> ivan = new Mehanik<>("Иван", "Сухов", "Pirelli");
        Mehanik<Transport> vasiliy = new Mehanik<>("Василий", "Кошкин", "Pirelli");
        Mehanik<Bus> misha = new Mehanik<>("Михаил", "Пушков", "Pirelli");
        Sponsor lukoil = new Sponsor("Лукойл", 2_000_000);
        Sponsor michlen = new Sponsor("Michilen", 3_000_000);

        Truck maz = new Truck("маз", "d-985", 3.0, Weight.N1);
        maz.addDriver(new DriverC("Коля", true, 10, new CategoreC()));
        maz.addMehanik(vasiliy);
        maz.addSponsor(michlen);

        Truck kraz = new Truck("краз", "d-985", 3.6, Weight.N2);
        Truck man = new Truck("ман", "d-985", 3.2, Weight.N2);
        Truck vaz = new Truck("ваз", "d-985", 4.0, Weight.N3);

        Car lada = new Car("лада", "3125", 1.6, TypeOfBody.COUPE);
        lada.addDriver(new DriverB("Ола", true, 3, new CategoreB()));
        lada.addMehanik(ivan);
        lada.addSponsor(lukoil);

        Car muzda = new Car("mazda", "3-87", 2.0, TypeOfBody.HACHBEKk);
        Car bmw = new Car("bmw", "x-5", 3.1, TypeOfBody.CROSSOVER);
        Car moskvich = new Car("москвич", "425", 1.8, TypeOfBody.MINIVAN);

        Bus bus = new Bus("bus", "желтый", 2.6, Capacity.LARGE);
        bus.addDriver(new DriverC("Коля", true, 10, new CategoreC()));
        bus.addMehanik(vasiliy);
        bus.addSponsor(michlen);

        Bus mers = new Bus("mers", "черный", 3.0, Capacity.SMALL);
        Bus volhganin = new Bus("волжанин", "белый", 3.8, Capacity.MEDIUM);
        Bus ekarus = new Bus("экарус", "красны ", 3.5, Capacity.EXTRA_LARGE);

        maz.infoAuto();
        maz.startDrive();
        maz.stopDrive();

        lada.infoAuto();
        lada.startDrive();
        lada.stopDrive();

        bus.infoAuto();
        bus.startDrive();
        bus.stopDrive();

        Driver<CategoreB> driverB = new Driver<>("Ола", true, 3, new CategoreB());
        Driver<CategoreC> driverC = new Driver<>("Коля", true, 10, new CategoreC());
        Driver<CategoreD> driverD = new Driver<>("Толя", true, 15, new CategoreD());

        driverB.start();
        driverC.stop();
        driverD.refuel();

        lada.pitStop();
        maz.bestTimeTrack();
        ekarus.maxSpeed();

        List<Transport> transports = List.of(
                lada, muzda, bmw, moskvich,
                maz, kraz, man, vaz,
                bus, mers, volhganin, ekarus);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(lada);
        serviceStation.addTruck(maz);
        serviceStation.service();
        serviceStation.service();

        for (Transport transport : transports) {
            printInfo(transport);
        }
    }

    public static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrend() + " " + transport.getModel() +
                        " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println();
        }
    }

    private static void printInfo(Driver<?> driver, Transport transport) {
        System.out.println("Водитель " + driver.getName() + " " + transport.getModel() +
                " будет участвовать в заезде");
        transport.printType();
    }

    private static void printInfo(Transport transport) {
        System.out.println("Информация по автомобилю " + transport.getBrend() + " " + transport.getModel());
        System.out.println("Водители: ");
        for (Driver<?> driver : transport.getDrivers()) {
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры: ");
        for (Sponsor sponsor : transport.getSponsors()) {
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики: ");
        for (Mehanik<?> mehanik : transport.getMehaniks()) {
            System.out.println(mehanik.getName() + " " + mehanik.getSurname() + " " + mehanik.getCompany());
        }
    }
}
