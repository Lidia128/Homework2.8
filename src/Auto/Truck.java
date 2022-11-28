package Auto;

public class Truck extends Transport implements Improving{
    private Weight weight;
    public Truck (String brend, String model, double volume,Weight weight) {
        super(brend, model, volume);
        this.weight = weight; }
    public Weight getWeight() { return weight; }
    public void setWeight(Weight weight) { this.weight = weight; }
    @Override
    public boolean service() {return Math.random() > 0.75; }
    @Override
    public void startDrive(){System.out.println("Грузовик поехал"); }
    @Override
    public void stopDrive() {System.out.println("Грузовик остановился");}
    @Override
    public void infoAuto() {
        super.infoAuto();
    }
    @Override
    public void pitStop() {System.out.println("Пит-стоп для грузовой машины");}
    @Override
    public void bestTimeTrack() {System.out.println("Лучшее время круга для грузовой машины");}
    @Override
    public void maxSpeed() {System.out.println("Максимальная скорость для грузовой машины");}
    @Override
    public void printType() {
        if (weight==null){
            System.out.println("Данных по авто не достастаточно.");
        }else {
            String from = weight.getFrom()==null?" ": " от " + weight.getFrom()+" т.";
            String to = weight.getTo()==null?"": " до " + weight.getTo() + " т.";
            System.out.println("Грузоподъемность авто: " + from + to);}
    }
    @Override
    public void repair() {
        System.out.println("Грузовик " + getBrend()+ " "+ getModel() + " починен!");
    }
}
