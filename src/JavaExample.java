import java.util.ArrayList;
import java.util.List;

public class JavaExample {
    public static int i = 2;

    public static void main(String[] args) {
        new Example3("hello, constructor (from java)");
        new Example4(
                "hello, constructor (from java) 2",
                "23423"
        );

        "s".isBlank();

        new Example4();


//        System.out.println(SingletonJava.instance.get());
//        //System.out.println(SingletonJava.instance.inc());
//
//        SingletonJava.instance.inc();
//        System.out.println(SingletonJava.instance.get());
//
//        System.out.println(KotlinObject.INSTANCE.get());

    }


    void example1() {
        Integer i = 3;
        List<Integer> intList = new ArrayList<>();

    }
}

class PersonJava {
    private static int globalId = 0;

    private int id;
    private final String name;

    PersonJava(String name) {
//        this.id = globalId++;
        this.name = name;
    }

    PersonJava(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void sayHi() {

    }
}

class JavaObject {
    public static int counter = 0;
}

class SingletonJava {
    public static final SingletonJava instance = new SingletonJava();

    private int counter = 0;

    private SingletonJava() {

    }

    void inc() {
        counter++;
    }

    int get() {
        return counter;
    }
}

class UserJ {
    private final String name;

    UserJ(String name) {
        this.name = name;
    }
}

class ConstantsJ {
    public static final String SITE_URL = "https://google.ru";
    public static final UserJ DEFAULT_USER = new UserJ("Petr");
}

class JavaExample2 {
    private String name = null;
    private int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ex() {
        final var x = new KotlinExample3();
        final KotlinExample3 x2 = new KotlinExample3();

        var z = new JavaExample2();
        x.getName().isBlank();
        z.getName().isBlank();
    }
}