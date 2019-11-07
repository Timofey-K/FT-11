package queueprior;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Comparator;

public class Queueprior {

    public static void main(String[] args) {
        Queue<Klient> klients = new PriorityQueue<>(3,priorComp);
        addDataToQueue(klients);
        pollDataFromQueue(klients);
        }

        public static Comparator<Klient> priorComp = new Comparator<Klient>() {
            @Override
            public int compare(Klient o1, Klient o2) {
                return (int) (o2.getValue()-o1.getValue());
            }
        };

    private static void addDataToQueue(Queue<Klient> klients) {
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значения");
            int prior;
            int value = sc1.nextInt();
            String name = sc1.nextLine();
            if (value<65){
                prior = 2;
            } else {
                prior =1; }
            klients.add(new Klient(value, name, prior));
        }
    }

    private static void pollDataFromQueue(Queue<Klient> klients) {
        while(true){
            Klient cust = klients.poll();
            if(cust == null) break;
            System.out.println(cust.getName());
        }
    }


}