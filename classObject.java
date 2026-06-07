// একটি Class তৈরি করা হলো
class Car {
    // Attributes (বৈশিষ্ট্য)
    String brand;
    int speed;

    // Method (কাজ বা আচরণ)
    void drive() {
        System.out.println(brand + " Car running at " + speed + " km/h speed.");
    }
}

public class classObject {
    public static void main(String[] args) {
        // Car ক্লাসের একটি Object তৈরি করা হলো
        Car myCar = new Car();
        
        // অবজেক্টের বৈশিষ্ট্য সেট করা
        myCar.brand = "Toyota";
        myCar.speed = 120;
        
        // মেথড কল করা
        myCar.drive(); // আউটপুট: Toyota গাড়িটি 120 km/h গতিতে চলছে Lights।
    }
}
