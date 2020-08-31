package com.lab111.labwork5;

public class Main {

    public static void main(String[] args) {

        RelationalTable relationalTable=new RelationalTable();

        relationalTable.add(new Object[]{"Чистый код","Роберт Мартин",25});
        relationalTable.add(new Object[]{"Язык программирования C++","Стенли Липпман",13});
        relationalTable.add(new Object[]{"Java 8. Полное руководство","Герберт Шилдт",15});
        relationalTable.add(new Object[]{"Чистый код","Роберт Мартин",25});
        relationalTable.add(new Object[]{"Язык программирования C++","Стенли Липпман",13});
        relationalTable.add(new Object[]{"Java 8. Полное руководство","Герберт Шилдт",15});
        relationalTable.add(new Object[]{"Чистый код","Роберт Мартин",25});
        relationalTable.add(new Object[]{"Язык программирования C++","Стенли Липпман",13});
        relationalTable.add(new Object[]{"Java 8. Полное руководство","Герберт Шилдт",15});


        System.out.println("==================");
        Iterator it = relationalTable.getIterator();
        while ((it.hasNext())) {
            System.out.println(it.next());
        }
        System.out.println("==================");
        Iterator iterator=relationalTable.getIterator();
        Iterator iterator2=relationalTable.getIteratorPrev();

        relationalTable.add(new Object[]{"I'm cool","Герберт Шилдт",15});

        System.out.printf("%30s%30s%30s%n","Назавание Книги","Автор","Количество");
        for(int i=0;iterator.hasNext();i++) {
            if (i % 3==0) {
                System.out.println();
            }
            System.out.printf("%30s",iterator.next());
        }
        System.out.println("\n");
        System.out.printf("%30s%30s%30s%n","Количество","Автор","Назавание Книги");
        for(int i=3;iterator2.hasNext();i--) {
            if (i % 3==0) {
                System.out.println();
            }
            System.out.printf("%30s",iterator2.next());
        }
        System.out.println();
        relationalTable.select("Чистый код");
        relationalTable.select(15);
    }
}
