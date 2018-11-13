package kreacyjne.abstractFactory.example1.car;

public class Car {
    private String manufacturer;
    private int horsepower;
    private String model;
    private int year;

    protected Car(String manufacturer, int horsepower, String model, int year) {
        this.manufacturer = manufacturer;
        this.horsepower = horsepower;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", horsepower=" + horsepower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
