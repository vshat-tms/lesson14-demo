public class PropsJava {
    public static void main(String[] args) {
        User4J user = new User4J("Ivan", 22);
        System.out.println(user);

        PointKotlin pk = new PointKotlin(2, 4);
        pk.getX();
    }

}

class User4J {
    public String name;
    public int age;

    public User4J(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("age can't be negative");
        }
        this.age = age;
    }

    public void setName(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Name can't be null");
        }

        if(name.length() < 2) {
            throw new IllegalArgumentException("Name length should be at least 2 chars");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "User4J{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Point {
    public int x;
    public int y;

    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;

        System.out.println(z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}

class User5 {
    private final String firstName;
    private final String lastName;

    User5(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Ex1231{
    public static void main(String[] args) {
        User5 user = new User5("Ivan", "Petrov");
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getFullName());

        System.out.println("--------------");

        User5Kt userKt = new User5Kt("Ivan2", "Petrov2");
        System.out.println(userKt.getFirstName());
        System.out.println(userKt.getLastName());
        System.out.println(userKt.getFullName());
    }
}