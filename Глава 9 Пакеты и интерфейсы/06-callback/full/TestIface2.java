// Страница 258 книги (PDF 259). Полиморфизм: меняется объект реализации.
class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
