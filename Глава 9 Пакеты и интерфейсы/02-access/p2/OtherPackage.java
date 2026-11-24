// Страницы 251-252 книги (PDF 252-253). Не подкласс в другом пакете.
package p2;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("Конструктор класса из другого пакета");

        // Только класс или пакет, где объявлено поле.
        // System.out.println("n = " + p.n);

        // Только класс Protection.
        // System.out.println("n_pri = " + p.n_pri);

        // В этом случае нужны тот же пакет или доступ из подкласса.
        // System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
