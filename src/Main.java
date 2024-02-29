
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
        System.out.println("Добавидли новую переменную:");
        System.out.println("Переменная friend = " + friend);
        friend = friend + 2;
        System.out.println("Увеличили значение переменной friend на 2 = " + friend);
        friend = friend / 7;
        System.out.println("Поделили переменную friend на 7 = " +  friend);
        System.out.println(" ");

        var frog = 3.5;
        System.out.println("Добавидли новую переменную:");
        System.out.println("Переменная frog = " + frog);
        frog = frog * 10;
        System.out.println("Переменная frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("Переменная frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("Переменная frog + 4 = " + frog);

    }
}