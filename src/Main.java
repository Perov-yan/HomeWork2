
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Объявляем переменные:");
        System.out.println("Переменная dog = "+ dog +".");
        System.out.println("Переменная cat = "+ cat +".");
        System.out.println("Переменная paper = "+ paper +".");
        System.out.println(" ");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("К переменным прибавлено 4:");
        System.out.println("Переменная dog = "+ dog +".");
        System.out.println("Переменная cat = "+ cat +".");
        System.out.println("Переменная paper = "+ paper +".");
        System.out.println(" ");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Из переменных вычтены значения:");
        System.out.println("Из dog - 3.5 = "+ dog +".");
        System.out.println("Из cat - 1.6 = "+ cat +".");
        System.out.println("Из paper - 7639 = "+ paper +".");
        System.out.println(" ");

        var friend = 19;
        System.out.println("Добавили новую переменную:");
        System.out.println("Переменная friend = " + friend);
        friend = friend + 2;
        System.out.println("Увеличили значение переменной friend на 2 = " + friend);
        friend = friend / 7;
        System.out.println("Поделили переменную friend на 7 = " +  friend);
        System.out.println(" ");

        var frog = 3.5;
        System.out.println("Добавили новую переменную:");
        System.out.println("Переменная frog = " + frog);
        frog = frog * 10;
        System.out.println("Переменная frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("Переменная frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("Переменная frog + 4 = " + frog);
        System.out.println(" ");

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Добавили новые переменные:");
        System.out.println("Масса первого боксера = " + firstBoxer + " кг" );
        System.out.println("Масса второго боксера = " + secondBoxer + " кг" );
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Масса обоих боксеров = " + totalWeight + " кг" );
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Разница в массе боксеров = " + differenceWeight + " кг" );
        System.out.println(" ");

        var x = 11;
        var y = 2;
        System.out.println("Добавили новые переменные:");
        System.out.println("x = " + x + " кг");
        System.out.println("y = " + y + " кг");
        var result = x % y;
        System.out.println("остаток деления = " + result + " кг");
        System.out.println(" ");

        var hoursTotal = 640;
        var workingHours = 8;
        System.out.println("Добавили новые переменные:");
        System.out.println("Рабочих часов всего "+ hoursTotal);
        System.out.println("Кажыдй сотрудник посвящает работе по " + workingHours + " часов");
        var totalEmployees = hoursTotal / workingHours;
        System.out.println("Всего работников в компании - "+ totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        hoursTotal = workingHours * totalEmployees;
        System.out.println("сли в компании работает  "+ totalEmployees + " человек, то всего "+ hoursTotal + " часов работы может быть поделено между сотрудниками");
    }
}