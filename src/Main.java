public class Main {
    public static void main(String[] args) {
    Fish fish = new Fish();
      fish.setBread("Щука");
      fish.setAge(3);
      fish.setLength(10);
      fish.setWeight(1);
      fish.setSpeed(3);
        System.out.println("Пародасы:"+fish.getBread());
        System.out.println("Жашы:"+fish.getAge());
        System.out.println("Узундугу:"+fish.getLength());
        System.out.println("Салмагы:"+fish.getWeight());
        System.out.println("Ылдамдыгы:"+fish.getSpeed());


        Parrot parrot = new Parrot();
        parrot.setName("Жако");
        parrot.setAge(2);
        parrot.setWeight(1);
        parrot.setColor("green");
          System.out.println("name:"+parrot.getName());
          System.out.println("age:"+parrot.getAge());
          System.out.println("weight:"+parrot.getWeight());
          System.out.println("color:"+parrot.getColor());


          Dog dog = new Dog();
          dog.setName("Bingo");
          dog.setAge(6);
          dog.setWeight(25);
          dog.setHeight(56);
          dog.setBreed("Sheepdog");
      System.out.println("name:"+dog.getName());
      System.out.println("age:"+dog.getAge());
      System.out.println("weight:"+dog.getWeight());
      System.out.println("height:"+dog.getHeight());
      System.out.println("breed:"+dog.getBreed());


      Cat cat = new Cat();
      cat.setName("Tom");
      cat.setAge(7);
      cat.setWeight(12);
      cat.setColor("black");
      cat.setBreed("Mein-kun");
        System.out.println("name:"+cat.getName());
        System.out.println("age:"+cat.getAge());
        System.out.println("weight:"+cat.getWeight());
        System.out.println("color:"+cat.getColor());
        System.out.println("breed:"+cat.getBreed());
    }
}