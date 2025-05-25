import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ethan", "Foster", 27));
        people.add(new Person("Charlotte", "Harrison", 35));
        people.add(new Person("James", "Russell", 23));
        people.add(new Person("Amelia", "Sullivan", 40));
        people.add(new Person("Benjamin", "Coleman", 29));
        people.add(new Person("Lily", "Peterson", 32));
        people.add(new Person("Henry", "Gonzalez", 26));
        people.add(new Person("Ella", "Morales", 37));
        people.add(new Person("Daniel", "Carter", 21));
        people.add(new Person("Grace", "Evans", 45));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search (first or last): ");
        String search = scanner.nextLine().toLowerCase();

        // Step 2: Filter matching names
        List<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().toLowerCase().equals(search) ||
                    p.getLastName().toLowerCase().equals(search)) {
                matches.add(p);
            }
        }

        System.out.println("Matching people:");
        for (Person p : matches) {
            System.out.println(p);
        }

        // Step 3: Age stats
        if (!people.isEmpty()) {
            int totalAge = 0;
            int minAge = Integer.MAX_VALUE;
            int maxAge = Integer.MIN_VALUE;

            for (Person p : people) {
                int age = p.getAge();
                totalAge += age;
                if (age < minAge) minAge = age;
                if (age > maxAge) maxAge = age;
            }

            double averageAge = (double) totalAge / people.size();
            System.out.printf("\nAverage Age: %.2f\n", averageAge);
            System.out.println("Oldest Age: " + maxAge);
            System.out.println("Youngest Age: " + minAge);
        }
    }
}