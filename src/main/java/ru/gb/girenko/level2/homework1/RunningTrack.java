package ru.gb.girenko.level2.homework1;

public class RunningTrack implements Hurdle {
private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public void cross(Athletics action) {
        action.run(length);

    }
}
