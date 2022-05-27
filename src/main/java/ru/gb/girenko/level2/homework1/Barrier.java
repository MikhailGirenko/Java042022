package ru.gb.girenko.level2.homework1;

public class Barrier implements Hurdle {
  private int height;

    public Barrier(int height) {
        this.height = height;
    }

    @Override
    public void cross(Athletics action) {
        action.jump(height);
    }
}
