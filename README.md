# Проект автоматизации тестирования для [Альфа-Банка](https://alfabank.ru/)
<p align="center">  <img width="40%" title="Alfa logo" src="media/logo/Logo-alfabank.svg">

## Содержание:

- [Использованный стек технологий](#использованный-стек-технологий)
- [Запуск тестов из терминала](#запуск-тестов-из-терминала)
- [Сборка в Jenkins](#jenkins-build)
- [Allure Report](#allure-report)
- [Уведомления о результатах тестов в Telegram с использованием бота](#telegram)
- [Видео примера запуска тестов в Selenoid](#video-selenoid)

## Использованный стек технологий

<p align="center">
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java-original-wordmark.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle-original.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/Junit-original-wordmark.svg"></a>
<a href="https://selenide.org/"><img width="6%" title="Selenide" src="media/logo/Selenide.svg"></a>
<a href="https://aerokube.com/selenoid/"><img width="6%" title="Selenoid" src="media/logo/Selenoid.svg"></a>
<a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="media/logo/Allure-Report.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/logo/Jenkins-original.svg"></a>
<a href="https://telegram.org/"><img width="6%" title="Telegram" src="media/logo/Telegram.svg"></a>
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/logo/Intellij-original.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/Github-original.svg"></a> 

</p>

- В данном проекте автотесты написаны на языке <code>Java</code>.
- В качестве сборщика был использован <code>Gradle</code>.
- Использованы фреймворки <code>JUnit 5</code> и <code>Selenide</code>.
- При прогоне тестов браузер запускается в <code>Selenoid</code>.
- Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием <code>Allure-отчета</code> и отправкой результатов в <code>Telegram</code> при помощи бота.

## Запуск тестов из терминала

### Команда для запуска из терминала
```
gradle clean test
```
### Удаленный запуск в Jenkins
```
clean test
-Dbrowser=${BROWSER}
-Dbrowser_version=${BROWSER_VERSION}
-Dbrowser_resolution=${BROWSER_RESOLUTION}
-Dremote_browser=${REMOTE_URL}
```

При выполнении команды, данные тесты запустятся удаленно в <code>Selenoid</code>.

<a id="jenkins-build"></a>
## <a href="https://jenkins.autotests.cloud/job/qa_guru_38_alfa_main_page_ui/"><img width="4%" style="vertical-align:middle" title="Jenkins" src="media/logo/Jenkins-original.svg">Сборка в Jenkins</a>

[//]: # (## [<img width="4%" style="vertical-align:middle" title="Jenkins" src="media/logo/Jenkins-original.svg"> Сборка в Jenkins]&#40;https://jenkins.autotests.cloud/job/qa_guru_38_alfa_main_page_ui/&#41;)

Чтобы запустить сборку необходимо перейти в раздел <code>Собрать с параметрами</code>, выбрать следующие значения параметров:
- *BROWSER - (браузер - chrome)*
- *BROWSER_VERSION - (версия браузера - 128.0)*
- *BROWSER_RESOLUTION (размер окна браузера - 1920x1080)*
<p align="center">
<img title="Jenkins Build" src="media/screens/Сборка%20Jenkins.jpg">
</p>

<a id="allure-report"></a>
## <a href="https://jenkins.autotests.cloud/job/qa_guru_38_alfa_main_page_ui/18/allure/"><img width="4%" style="vertical-align:middle" title="Allure Report" src="media/logo/Allure-Report.svg"> Пример Allure отчета</a>

### *Основная страница*
<p align="center">
<img title="Allure Report" src="media/screens/Allure%20отчет.jpg">
</p>

### *Тест-кейсы*
<p align="center">  
<img title="Allure Tests" src="media/screens/Allure%20тесты.jpg" width="850">  
</p>

<a id="telegram"></a>
### <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> Уведомления о результатах тестов в Telegram с использованием бота

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screens/Telegram%20bot.jpg">
</p>

<a id="video-selenoid"></a>
### <img width="4%" style="vertical-align:middle" title="Selenoid" src="media/logo/Selenoid.svg"> Видео примера запуска теста в Selenoid

<p align="center">
  <img title="Selenoid Video" src="media/screens/Видео%20Selenoid.gif">
</p>