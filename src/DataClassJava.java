import java.util.Objects;

public class DataClassJava {
    public static void main(String[] args) {
        PersonJ p = new PersonJ("Ihor", 35);
        PersonJ p2 = new PersonJ("Ihor", 35);

        System.out.println(p);
        System.out.println(p.equals(p2));
        System.out.println(p == p2);
    }
}

// POJO = plain old java object
final class PersonJ {
    private final String name;
    private final int age;

    PersonJ(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonJ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonJ personJ = (PersonJ) o;
        return age == personJ.age && Objects.equals(name, personJ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}