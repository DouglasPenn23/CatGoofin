    public class Cat extends Pet {
        int age;
        String name;
        String color;

        public Cat(int petAge, String petName, String petColor) {
            super(petAge, petName, petColor);
        }


        @Override
        public void speak() {
            System.out.println("Meow");
        }
    }
