// Страница 257 книги (PDF 258). Первая, минимальная версия Client06Basic.
class Client06Basic implements Callback06Basic {
    // Реализовать метод интерфейса Callback06Basic.
    public void callback(int p) {
        System.out.println("callback() вызывается с " + p);
    }
}
