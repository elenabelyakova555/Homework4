public class Main {
    public static void main(String[] args) {

    // Задание 1
        System.out.println("Задание 1");
        int age =23;
        if (age>=18) {
        System.out.println("Поздравляю с совершенолетием");
    }
        if (age<18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        // Задание 2
        System.out.println("Задание 2");
        if (7<=age && age<18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (18<age && age<24) {
            System.out.println("Человек ходит в университет");
        }
        if (24<=age ) {
            System.out.println("Человек ходит на работу");
    }
        // Задание 3
        System.out.println("Задание 3");
        int capacity= 102;
        int seatingPlaces=60;
        int standingPlaces=42;
        int seatUsed=60;
        int standingUsed=23;
        if (seatUsed<seatingPlaces) {
            System.out.println("Есть еще " + (seatingPlaces-seatUsed) + " сидячих мест");
        }
        if (seatUsed==seatingPlaces) {
            System.out.println( "сидячих мест нет");
        }
        if (standingUsed<standingPlaces) {
            System.out.println("Есть еще " + (standingPlaces-standingUsed) + " стоячих мест");
        }
        if (standingUsed==standingPlaces) {
            System.out.println( "стоячих мест нет");
    }
        // Задание 4
        System.out.println("Задание 4");
        if (age>=18) {
            System.out.println("Поздравляю с совершенолетием");
        }
        else  {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
}
        // Задание 5
        System.out.println("Задание 5");
        if (7<=age && age<18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (18<age && age<24) {
            System.out.println("Человек ходит в университет");
        }
        else if (24<=age ) {
            System.out.println("Человек ходит на работу");
        }
        // Задание 6
        System.out.println("Задание 6");
        int capacity1= 102;
        int seatingPlaces1=60;
        int standingPlaces1=42;
        int seatUsed1=60;
        int standingUsed1=23;
        if (seatUsed1<seatingPlaces1) {
            System.out.println("Есть еще " + (seatingPlaces1-seatUsed1) + " сидячих мест");
        }
        else {
            System.out.println( "сидячих мест нет");
        }
        if (standingUsed1<standingPlaces1) {
            System.out.println("Есть еще " + (standingPlaces-standingUsed) + " стоячих мест");
        }
        else {
            System.out.println( "стоячих мест нет");
        }
        // Задание 7
        System.out.println("Задание 7");
        int age1 =35;
        if (2<=age1 && age1<7) {
            System.out.println("Если возраст человека равен " +age1+ " лет то, ребенок ходит в детский сад. ");
        }
        else if (7<=age1 && age1<18) {
            System.out.println("Если возраст человека равен " +age1+ " лет то, ребенок ходит в школу");
        }
        else if (18<age1 && age1<24) {
            System.out.println("Если возраст человека равен " +age1+ " лет то,человек ходит в университет");
        }
        else if (24<=age1 ) {
            System.out.println("Если возраст человека равен " +age1+ " лет то,человек ходит на работу");
        }
        // Задание 8
        System.out.println("Задание 8");
        int age2 =4;
        if (age2<5) {
            System.out.println("Если ребенку меньше " +age2+ " лет то, он не может кататься на аттракционе. ");
        }
        else if (5<=age2 && age2<14) {
            System.out.println("Если ребенку " +age2+ " лет то, он  может кататься на аттракционе только в сопровождении взрослого.Если взрослого нет, то кататься нельзя. ");
        }
        else if (14<=age2) {
            System.out.println("Если ребенку " +age2+ " лет то, он  может кататься на аттракционе");
        }
        // Задание 9
        System.out.println("Задание 9");
        int one =4;
        int two =4;
        int three =4;
        if (one>two) {
            if (one>=three) {
                System.out.println("Максимальное число - " +one );
            }
            else if (three>one){
                System.out.println("Максимальное число - " +three );
            }
            } else if (two>one) {
                if (two>=three)
                System.out.println( "Максимальное число - " +two);
        } else if (three>two) {
                System.out.println("Максимальное число - " +three);
            } else  {
            if (one>three) {
                System.out.println("Максимальное число - " +one );
            }  else if (three>one){
                    System.out.println("Максимальное число - " +three );
            } else  {
                System.out.println("Все 3 числа равны");
            }

        }
        }
    }

