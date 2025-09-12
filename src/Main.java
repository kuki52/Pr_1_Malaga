import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        firstTask();
        secondTask();
        thirdTask();
    }

    public static void firstTask(){
        float rubles = 30002.7f;
        float rateUSD = 78.5f;

        float dollars = rubles / rateUSD;

        System.out.println("У вас на счету " + rubles + " рублей. В долларах это " + dollars + " долларов. Так держать!");
    }

    public static void secondTask(){
        var text = new StringBuilder();
        String weather = new Scanner(System.in).next();

        if (Objects.equals(weather, "Дождь")){
            text.append("Беру с собой зонт. ");
        }
        else {
            text.append("Иду налегке. ");
        }

        text.append("Люблю гулять!");
        System.out.println(text);
    }

    public static void thirdTask(){
        var answer = new StringBuilder();
        var scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            int countEggs = scanner.nextInt();
            if(countEggs > 3){
                answer.append("Рекомендую приготовить омлет. ");
            }
            else if (countEggs < 3) {
                answer.append("Рекомендую позавтракать бутербродами.");
            }

            answer.append("Приятного аппетита!");
        }

        System.out.println(answer); // 1
    }
}