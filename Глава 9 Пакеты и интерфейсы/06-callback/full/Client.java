// Страница 257 книги (PDF 258). Версия с дополнительным методом.
class Client implements Callback {
    public void callback(int p) {
        System.out.println("callback() вызывается со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Классы, которые реализуют интерфейсы, " +
                "могут также определять и другие члены.");
    }
}
