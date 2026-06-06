// Abstract Class (এর সরাসরি অবজেক্ট তৈরি করা যায় না)
abstract class Vehicle {
    // Abstract Method (এর কোনো বডি বা কোড থাকবে না, চাইল্ড ক্লাসকে এটা ইমপ্লিমেন্ট করতেই হবে)
    abstract void startEngine();

    // Regular Method (সাধারণ মেথডও থাকতে পারে)
    void stop() {
        System.out.println("যানবাহনটি থেমে গেল।");
    }
}

class Bike extends Vehicle {
    // Abstract মেথডের আসল বডি এখানে দেওয়া হলো
    @Override
    void startEngine() {
        System.out.println("বাইকটি সেলফ স্টার্ট দিয়ে চালু হলো।");
    }
}
public class abstraction {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle(); -> এটা করা যাবে না (Error আসবে)
        
        Vehicle myBike = new Bike();
        myBike.startEngine(); // আউটপুট: বাইকটি সেলফ স্টার্ট দিয়ে চালু হলো।
        myBike.stop();        // আউটপুট: যানবাহনটি থেমে গেল।
    }
}
