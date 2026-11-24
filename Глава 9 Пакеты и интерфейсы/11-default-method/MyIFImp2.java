// Страница 268 книги (PDF 269). Переопределение стандартного метода.
class MyIFImp2 implements MyIF {
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "Другая строка.";
    }
}
