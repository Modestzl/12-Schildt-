// Страница 268 книги (PDF 269). Пример запуска из книги.
// Использовать стандартный метод.
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();
        // Метод getNumber() можно вызывать, потому что
        // он явно реализован в MyIFImp:
        System.out.println(obj.getNumber());
        // Метод getString() тоже можно вызывать
        // из-за наличия стандартной реализации:
        System.out.println(obj.getString());
    }
}
