// Страница 254 книги (PDF 255).
// Класс, конструктор и метод show() доступны за пределами пакета.
package mypack;

  public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}
