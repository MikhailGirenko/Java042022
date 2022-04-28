package ru.gb.girenko.homework5;

public class homework5 {
    public static void main(String[] args) {
        Employees[] emp = new Employees[5];

        emp[0] = new Employees("MikhailGirenko","director", "mg@gmail.com", "89111110011", 500000,30);
        emp[1] = new Employees("Vasiliy Pupkin","developer", "vp@gmail.com", "89111111122", 100000,22);
        emp[2] = new Employees("Ivan Ivanov","developer", "ii@gmail.com", "89111112222", 150000,44);
        emp[3] = new Employees("Irina Petrova","manager", "ip@gmail.com", "89111113322", 120000,32);
        emp[4] = new Employees("Anna Ivanova","manager", "ai@gmail.com", "89111111144", 130000,52);

        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getAge()>40){
                emp[i].print();
                System.out.println();
            }
        }


    }
}
