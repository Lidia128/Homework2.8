package Auto;

import Auto.driver.Driver;

import java.util.*;

public abstract  class Transport implements Improving {
    private String brend;
    private String model;
    private double volume;
    private final Set<Driver<?>> drivers = new HashSet<>();
    private final Set<Mehanik<?>> mehaniks = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();
    public Transport(String brend, String model, double volume) {
        this.brend = brend;
        this.model = model;
        this.volume = volume; }
    public void startDrive() {
        System.out.println("Начать движение.");
    }
    public void stopDrive() {
        System.out.println("Закончить движение");
    }
    public void infoAuto() {
        System.out.println("Траснспортное средство " + getBrend() + " модель " + getModel() + " с объемом " +
                " двигателя " + getVolume()); }
    public void addDriver (Driver<?>...drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMehanik (Mehanik<?>...mehaniks){
        this.mehaniks.addAll(Arrays.asList(mehaniks));
    }
    public void addSponsor (Sponsor... sponsors){
        this.sponsors.addAll(Arrays.asList(sponsors)); }
    public Set<Driver<?>> getDrivers() {
        return drivers; }
    public Set<Mehanik<?>> getMehaniks() {
        return mehaniks; }
    public Set<Sponsor> getSponsors() {
        return sponsors; }
    public String getBrend() {
        return brend;
    }
    public String getModel() {
        return model;
    }
    public abstract void printType ();
    public abstract boolean service ();
    public abstract void repair ();
    public double getVolume() {
        return volume;
    }
}

