// Parent Class (Super Class)
class Animal {
    void eat() {
        System.out.println("This animal is eating!");
    }
}

// Child Class (Sub Class) যা Animal-কে ইনহেরিট করেছে
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking!");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Dog ক্লাসের নিজস্ব মেথড
        myDog.bark(); 
        
        // Animal ক্লাস থেকে উত্তরাধিকার সূত্রে পাওয়া মেথড
        myDog.eat();  
    }
}
