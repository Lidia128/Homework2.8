package Auto;

public class Bus extends Transport implements Improving {
    private Capacity capacity;
    public Bus(String brend, String model, double volume, Capacity capacity) {
        super(brend, model, volume);
        this.capacity = capacity; }
    public Capacity getCapacity() {
        return capacity;
    }
    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
    @Override
    public boolean service() {
        System.out.println("Автобус " + getBrend() + " " + getBrend() + " в диагностике не требуется");
        return false;}
    @Override
    public void startDrive() {
        System.out.println("Автобус поехал");}
    @Override
    public void stopDrive() {
        System.out.println("Автобус остановился");}
    @Override
    public void infoAuto() {
        super.infoAuto();}
    @Override
    public void pitStop() {System.out.println("Пит-стоп для автобуса"); }
    @Override
    public void bestTimeTrack() {
        System.out.println("Лучшее время круга для автобуса");}
    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для автобуса");}
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по авто не достастаточно.");
        } else {
            System.out.println("Вместимость автобуса: " + capacity.getFrom() + " чел." + " до "
                    + capacity.getTo() + " чел."); }
    }
    @Override
    public void repair() {
        System.out.println("Автобус " + getBrend() + " " + getModel() + " починен!");
    }
}