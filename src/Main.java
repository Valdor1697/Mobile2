public class Main {
    public static void main(String[] args) {

        int balance = 200; // Изначальный баланс на счету клиента в рублях
        int refill = 1600; // Сумма пополнения баланса в рублях
        int bonus = 100; // Стоимость одного бонуса в рублях


        boolean followedRule = refill >= 1000; // Соответствует ли сумма пополнения условиям бонусной программы?

        int addBonus; // Колличество бонусов
        int finalBalance; // Итоговая сумма баланса

        if (followedRule) {

            addBonus = refill / bonus;
            finalBalance = balance + refill + addBonus;

        } else {

            addBonus = 0;
            finalBalance = balance + refill;

        }

        System.out.println("Сумма баланса: " + finalBalance);
        System.out.println("Колличество бонусов: " + addBonus);

    }
}
