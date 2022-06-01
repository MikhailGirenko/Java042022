package ru.gb.girenko;

class ArraySize {
   static int arr (String[][] strArr)
        throws  MyArrayDataException,MyArraySizeException{
        int sum=0;
        if(strArr.length != 4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].length!=4){
                throw new MyArraySizeException();
            }
            for (int j = 0; j < strArr[i].length; j++) {
                try{
                    sum += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sum;
    }
}
