// Страница 258 книги (PDF 259). Другая реализация того же контракта.
// Еще одна реализация Callback06Full.
class AnotherClient implements Callback06Full {
    // Реализовать метод интерфейса Callback06Full.
    public void callback(int p) {
        System.out.println("Еще одна версия callback()");
        System.out.println("p в квадрате равно " + (p * p));
    }
}
