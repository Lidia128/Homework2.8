package Auto;
import Auto.driver.Driver;
import java.util.Objects;
public class Car extends Transport implements Improving {
    private TypeOfBody typeOfBody;
    public Car(String brend, String model, double volume, TypeOfBody typeOfBody) {
        super(brend, model, volume);
        this.typeOfBody = typeOfBody; }
    public TypeOfBody getTypeOfBody() {
        return typeOfBody;}
    public void setTypeOfBody(TypeOfBody typeOfBody) {
        this.typeOfBody = typeOfBody; }
    @Override
    public boolean service() {
        return Math.random() > 0.7;}
    @Override
    public void infoAuto() {
        super.infoAuto();
    }
    @Override
    public void startDrive() {System.out.println("Легковая машина поехала"); }
    @Override
    public void stopDrive() {System.out.println("Легковая машина остановилась");}
    @Override
    public void pitStop() {System.out.println("Пит-стоп для легковой машины");}
    @Override
    public void bestTimeTrack() {System.out.println("Лучшее время круга для легковой машины");}
    @Override
    public void maxSpeed() {System.out.println("Максимальная скорость для легковой машины");}
    @Override
    public void printType() {
        if (typeOfBody==null){
            System.out.println("Данных по авто не достастаточно.");
        }else {
            System.out.println("Тип кузова авто: " + typeOfBody);}
    }
    @Override
    public void repair() {
        System.out.println("Машина " + getBrend()+ " "+ getModel() + " починена!"); }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getBrend().equals(getBrend());
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getBrend());
    }
}
