package ru.gb.girenko.level2.homework1;

public class Human implements Athletics {
    private final String name;
    private final int maxLength;
    private final int maxHeight;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public Human(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.status=true;
    }

    @Override
    public void run(int length) {
        if(maxLength>=length){
            System.out.println("Human "+name+" пробежал успешно "+length+ " метров!");
        }else {
            System.out.println("Human "+name+" не смог пробежать "+length+ " метров!");
            status=false;
        }
    }

    @Override
    public void jump(int height) {
        if (maxHeight>=height) {
            System.out.println ("Human "+name+" взял высоту "+height+" метров!");
        }else {
            System.out.println("Human " +name+  " не перепрыгнул "+height+" метров!");
            status=false;
        }
    }
}
