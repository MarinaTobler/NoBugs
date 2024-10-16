import org.example.task1.Book;
import org.example.task2.Student;
import org.example.task3.Point;
import org.example.task4.Clock;
import org.example.task5.Car;

public class Main {
    public static void main(String[] args) {
        // Task1

        System.out.println("\nTask1\n");

        Book book = new Book();
        book.setName("Learned optimism");
        book.setAuthor("Martin Seligman");
        book.setYear(1990);
        book.display();

        //Task2

        System.out.println("\nTask2\n");

        Student student = new Student();
        student.setName("Edward Stuart");
        student.setRecordBookNumber(123456789);
        student.setAvgScore(4.8);
        student.print();

        //Task3

        System.out.println("\nTask3\n");

        Point point = new Point(5.5, 4.6);
        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.moveRight();

        //Task4

        System.out.println("\nTask4\n");

        Clock clock = new Clock(16,59,59);

        System.out.println("Current time: " + clock.readTime());

        clock.tick();
        System.out.println("After 1 second: " + clock.readTime());

        clock.tick();
        System.out.println("After another second: " + clock.readTime());

        //Task5

        System.out.println("\nTask5\n");

        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("RAV4");
        car.setYearOfProduction(2021);
        car.start();
        car.drive(50);
        car.stop();
    }
}