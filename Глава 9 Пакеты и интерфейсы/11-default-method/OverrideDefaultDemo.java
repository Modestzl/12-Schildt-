// ДОПОЛНЕНИЕ для запуска MyIFImp2 со страницы 268 (PDF 269).
// Сам класс MyIFImp2 приведён в книге; этот main добавлен для сравнения.
class OverrideDefaultDemo {
    public static void main(String[] args) {
        MyIF11 obj = new MyIFImp2();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
