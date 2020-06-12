import java.util.Objects;

public class Car implements Comparable<Car>{

   private Integer createYear;

    public Car(Integer createYear) {
        this.createYear = createYear;
    }

    public Integer getCreateYear() {
        return createYear;
    }

    public void setCreateYear(Integer createYear) {
        this.createYear = createYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(createYear, car.createYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createYear);
    }

    @Override
    public String toString() {
        return "Car{" +
                "createYear=" + createYear +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.createYear - o.getCreateYear();
    }
}
