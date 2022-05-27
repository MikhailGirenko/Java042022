package ru.gb.girenko.level2.homework1;

public class App {
    public static void main(String[] args) {
        Athletics[] athletics = {
                new Robot("R2-D2",3000,1),
                new Cat("Vaska", 1000,3),
                new Human("Ivan",500,2)};
        Hurdle[] hurdles ={
                new RunningTrack(800),
                new Barrier(2),
                new Barrier(4),
        };

        for (Athletics athlete: athletics) {
            System.out.println();
            for (Hurdle hurdle: hurdles ) {
                hurdle.cross(athlete);
                if (!athlete.isStatus()) {
                    break;
                }
            }
        }
    }
}
