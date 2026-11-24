// Страница 258 книги (PDF 259). Полиморфизм: меняется объект реализации.
class TestIface2 {
    public static void main(String[] args) {
        Callback06Full c = new Client06Full();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob; // c теперь ссылается на объект AnotherClient
        c.callback(42);
    }
}
