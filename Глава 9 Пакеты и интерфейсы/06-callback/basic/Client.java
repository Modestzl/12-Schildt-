// Страница 257 книги (PDF 258). Первая, минимальная версия Client.
class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback() вызывается с " + p);
    }
}
