// Страница 251 книги (PDF 252). Подкласс из другого пакета.
package p2;

class Protection2 extends p1.Protection {
    Protection2() {
        System.out.println("Конструктор производного класса из другого пакета");

        // Только класс или пакет, где объявлено поле.
        // System.out.println("n = " + n);

        // Только класс Protection.
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
