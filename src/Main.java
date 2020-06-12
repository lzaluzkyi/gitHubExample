import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Car> hashSet = new HashSet<>();
        Set<Car> linkedHashSet = new LinkedHashSet<>();
        Set<Car> treeSet = new TreeSet<>();

        hashSet.add(new Car(1994));
        hashSet.add(new Car(2002));
        hashSet.add(new Car(2020));
        hashSet.add(new Car(2002));
        hashSet.add(new Car(1994));
        hashSet.add(new Car(2002));
        hashSet.add(new Car(2020));
        hashSet.add(new Car(2002));
        hashSet.add(new Car(1994));
        hashSet.add(new Car(2002));
        hashSet.add(new Car(2020));
        hashSet.add(new Car(2002));


        for (Car car : hashSet) {
            System.out.println(car);
        }




    }

}

