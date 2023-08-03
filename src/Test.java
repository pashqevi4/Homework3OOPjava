import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Беляш", 7));
        cats.add(new Cat("Семён", 3));
        cats.add(new Cat("Гошан", 11));
        cats.add(new Cat("Шаверма", 4));
        cats.add(new Cat("Бонифаций", 8));
        cats.add(new Cat("Абырвалг", 15));

        Comparator<Cat> kitties = new Comparator<Cat>() {
            @Override
            public int compare(Cat cat1, Cat cat2) {
                return cat1.getAge() - cat2.getAge();
            }
        };
        cats.sort(kitties);

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        Cat cat1 = new Cat("Барсик", 3);
        Name name = () -> cat1.getName();
        System.out.println(name.getCatName());
    }
}
