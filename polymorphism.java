// ১. Method Overloading (Compile-time) এর উদাহরণ
class Calculator {
    // দুটি সংখ্যা যোগ করে
    int add(int a, int b) {
        return a + b;
    }
    // তিনটি সংখ্যা যোগ করে (নাম এক, প্যারামিটার আলাদা)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// ২. Method Overriding (Runtime) এর উদাহরণ
class ParentSound {
    void sound() {
        System.out.println("প্রাণীটি ডাকছে...");
    }
}

class Cat extends ParentSound {
    @Override
    void sound() { // প্যারেন্ট ক্লাসের মেথডকে ওভাররাইড করা হলো
        System.out.println("বিড়ালটি ম্যাও ম্যাও করছে।");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        // Overloading টেস্ট
        Calculator cal = new Calculator();
        System.out.println(cal.add(5, 10));     // আউটপুট: 15
        System.out.println(cal.add(5, 10, 15)); // আউটপুট: 30

        // Overriding টেস্ট
        ParentSound myCat = new Cat();
        myCat.sound(); // আউটপুট: বিড়ালটি ম্যাও ম্যাও করছে।
    }
}
