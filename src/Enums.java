public class Enums {
    enum Day {Mon, Tue, Wed, Thu, Fri, Sat, Sun};

    public static void main(String[] args) {
        Day today = Day.Sun;
        System.out.println(today);

        switch (today) {
            case Mon, Tue, Wed, Thu, Fri -> System.out.println("It's a weekday!");
            case Sat, Sun -> System.out.println("It's a weekend!");
        }
    }
}
