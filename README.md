# Java по Шилдту

Учебный проект по книге Герберта Шилдта «Java. Полное руководство», 12-е издание. Примеры рассчитаны на Java SE 17.

## Сборка и запуск

Понадобятся JDK 17 и Maven. Убедитесь, что `mvn -version` показывает Java 17, затем выполните из корня проекта:

```powershell
mvn test
```

В IntelliJ IDEA откройте корень проекта как Maven-проект, выберите JDK 17 и запустите метод `main` класса `org.example.Schildt.Main`. Из терминала стартовый пример можно запустить после сборки:

```powershell
java -cp target/classes org.example.Schildt.Main
```
