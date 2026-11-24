// Страница 265 книги (PDF 266). Наследование интерфейса через extends.
// Один интерфейс может расширять другой.
interface A10 {
    void meth1();
    void meth2();
}

// Интерфейс B10 теперь включает meth1() и meth2() - он добавляет meth3().
interface B10 extends A10 {
    void meth3();
}

// Этот класс должен реализовать все методы интерфейсов A10 и B10.
class MyClass10 implements B10 {
    public void meth1() {
        System.out.println("Реализация meth1().");
    }

    public void meth2() {
        System.out.println("Реализация meth2().");
    }

    public void meth3() {
        System.out.println("Реализация meth3().");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass10 ob = new MyClass10();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
