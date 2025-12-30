# Проект автоматизации тестирования для [Альфа-Банка](https://alfabank.ru/)
## Содержание:

- [Использованный стек технологий](#использованный-стек-технологий)
- [Запуск тестов из терминала](#запуск-тестов-из-терминала)
- [Сборка в Jenkins](#сборка-в-jenkins)
- [Allure Report](#пример-allure-отчета)
- [Уведомления о результатах тестов в Telegram с использованием бота](#уведомления-о-результатах-тестов-в-telegram-с-использованием-бота)
- [Видео примера запуска тестов в Selenoid](#видео-примера-запуска-теста-в-selenoid)

## Использованный стек технологий

<p align="center"> 
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/logo/Intellij-original.svg"></a> 
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java-original-wordmark.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/logo/Selenide.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="media/logo/Selenoid.svg"></a>
<a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="media/logo/Allure-Report.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle-original.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/Junit-original-wordmark.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/Github-original.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/logo/Jenkins-original.svg"></a>
</p>

## Запуск тестов из терминала

### Команда для запуска из терминала
```
gradle clean alfamainpage_test
```
При выполнении команды, данные тесты запустятся удаленно в <code>Selenoid</code>. 

## <img width="4%" style="vertical-align:middle" title="Jenkins" src="media/logo/Jenkins-original.svg"> Сборка в Jenkins

[Сборка в Jenkins](https://jenkins.autotests.cloud/job/qa_guru_38_alfa_main_page_ui/)

Чтобы запустить сборку необходимо перейти в раздел <code>Собрать с параметрами</code>, выбрать следующие значения параметров:
- *BROWSER - (браузер - chrome)*
- *BROWSER_VERSION - (версия браузера - 128.0)*
- *BROWSER_RESOLUTION (размер окна браузера - 1920x1080)*
<p align="center">
<img title="Jenkins Build" src="media/screens/Сборка%20Jenkins.jpg">
</p>

## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/logo/Allure-Report.svg"> Пример Allure отчета

[Allure отчет](https://jenkins.autotests.cloud/job/qa_guru_38_alfa_main_page_ui/12/allure/)
### *Основная страница*
<p align="center">
<img title="Allure Report" src="media/screens/Allure%20отчет.jpg">
</p>

### *Тест-кейсы*
<p align="center">  
<img title="Allure Tests" src="media/screens/Allure%20тесты.jpg" width="850">  
</p>

### <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> Уведомления о результатах тестов в Telegram с использованием бота

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screens/Telegram%20bot.jpg">
</p>

### <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/logo/Selenoid.svg"> Видео примера запуска теста в Selenoid

<p align="center">
  <img title="Selenoid Video" src="media/screens/Видео%20Selenoid.gif">
</p>