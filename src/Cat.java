public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){

        this.name = name;
    }
    public void setAge(int age){

        this.age = age;
    }


    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }


    public void greet(){
        System.out.printf("Мяу! Меня зовут %s, мне %d лет.", getName(), getAge());
    }

//    @Override
//    public void angryMeow() {
//        sayMeow();
//        sayMeow();
//        sayMeow();
//    }
    public void sharpClaws(){
        String target = "Когтеточка";
        System.out.println("Предмет, о который точить когти - " + target);
    }
    public void runAtNight(){
        int times = 3;
        System.out.println("Сколько раз нарезать круги по квартире - " + times);
    }
//    public void foodDemand(){
//        for (int i = 0; i < 5; i++) {
//            sayMeow();
//        }
//    }

    @Override
    public String toString(){
        return "Cat{" + "name = " + name + "; age = " + age + "}";
    }


}
