package ru.gb.girenko;

class MyArrayDataException extends NewException {
    MyArrayDataException(int x,int y ){
        super(String.format("Некорректные данные в ячейке: [%d, %d]\n", x, y));
    }
}
