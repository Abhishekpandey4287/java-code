class neha {
    public static void main(String[] args) {
        Animal rat = new Animal();
        rat.age = 5;
        rat.colour ="white";
        rat.legs = 4;
        System.out.println(rat.age +" " + rat.legs + " "+ rat.colour);

        Animal dog = new Animal();
        dog.colour= "black";
        dog.legs = 4;
        dog.age = 1;
        System.out.println(dog.age +" " + dog.legs + " "+ dog.colour);

       Animal name = new Animal(5,4);
        System.out.println(name.age +" " + name.legs);
    }
}
 class Animal{
    int age ;
    String colour;
    int legs;
    Animal(){
        System.out.println("animal is eating ");
    }
    Animal(int age, int legs){
        System.out.println("animal is walking with his legs");
    }
}

