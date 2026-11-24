// Страницы 247-248 книги (PDF 248-249). Простой пакет.
// Простой пакет.
package mypack;

class Balance01 {
    String name;
    double bal;

    Balance01(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0)
            System.out.print("--> ");
        System.out.println(name + ": $" + bal);
    }
}

class AccountBalance {
    public static void main(String[] args) {
        Balance01[] current = new Balance01[3];

        current[0] = new Balance01("K. J. Fielding", 123.23);
        current[1] = new Balance01("Will Tell", 157.02);
        current[2] = new Balance01("Tom Jackson", -12.33);

        for (int i = 0; i < 3; i++) current[i].show();
    }
}
