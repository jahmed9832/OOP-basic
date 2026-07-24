// ইন্টারফেস (Interface) তৈরি
interface Animal {
    // ইন্টারফেসের মেথডগুলোর সাধারণত কোনো বডি থাকে না
    void eat();
    void makeSound();
}

// Child Class যা Animal ইন্টারফেস-কে ইমপ্লিমেন্ট (implement) করেছে
class Dog implements Animal {
    
    // ইন্টারফেসের মেথডগুলোকে অবশ্যই এখানে ডিফাইন (Override) করতে হবে
    public void eat() {
        System.out.println("This dog is eating meat!");
    }

    public void makeSound() {
        System.out.println("Dog is barking: Woof Woof!");
    }
    
    // Dog ক্লাসের নিজস্ব মেথড
    void sleep() {
        System.out.println("Dog is sleeping!");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // ইন্টারফেস থেকে পাওয়া (ওভাররাইড করা) মেথডগুলো কল করা হচ্ছে
        myDog.eat();       
        myDog.makeSound(); 
        
        // Dog ক্লাসের নিজস্ব মেথড
        myDog.sleep();     
    }
}