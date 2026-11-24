// Страница 258 книги (PDF 259). Вызов через ссылку на интерфейс.
class TestIface {
    public static void main(String[] args) {
        Callback06Full c = new Client06Full();
        c.callback(42);
    }
}
