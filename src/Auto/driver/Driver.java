package Auto.driver;

import Auto.categore.Categore;

import java.util.Objects;

public class Driver<T extends Categore> {
    private String name;
    private boolean hasDriveverLicense;
    private int experience;
    private T categore;
    public Driver(String name, boolean hasDriveverLicense, int experience, T categore) {
        this.name = name;
        this.hasDriveverLicense = hasDriveverLicense;
        this.experience = experience;
        this.categore = categore;    }
    public String getName() { return name; }
    public boolean isHasDriveverLicense (){return hasDriveverLicense;}
    public void setHasDriveverLicense(boolean hasDriveverLicense) {this.hasDriveverLicense = hasDriveverLicense;}
    public int getExperience() { return experience;}
    public void setExperience(int experience) {this.experience = experience; }
    public T getCategore() {return categore; }
    public void setCategore(T categore) {
        if (categore == null){
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.categore = categore; }
    public void start () { System.out.println("Водитель " + name + " начал движение");}
    public void stop ( ) {System.out.println("Водитель " + name + " закончил движение");    }
    public void refuel (){System.out.println("Водитель " + name + " заправляет авто");    }
    @Override
    public String toString() {
        return name + "стаж вождения: " + hasDriveverLicense + " лет, " + " категория "+ categore;}

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return name.equals(driver.name);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
