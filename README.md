# AAAapp

[![Build Status](https://travis-ci.org/ArtBekk/AAAapp.svg?branch=master)](https://travis-ci.org/ArtBekk/AAAapp)


**Планы разработки:**

- [Roadmap1](ROADMAP1.md)

- [Roadmap2](ROADMAP2.md)

- [Roadmap3](ROADMAP3.md)

- [Roadmap4](ROADMAP4.md)


**Описание проекта:**

Целью данного проекта является создания приложения, которое будет иметь функции аутентификации, авторизации и аккаунтинга пользователя. Проект написан на языке Kotlin и для его запуска вам потребуется иметь на компьютере установленный комплект Java разработчика(JDK). Скачать актуальную версию JDK можно с официального сайта Oracle.


**Компилирование проекта:**

Cкомпилировать проект можно запустив скрипт BUILD.sh. Для компилирования вам понадобиться Kotlin Compiler.
Скачать Kotlin Compiler можно на [данном сайте](https://chocolatey.org/packages/kotlinc). Сперва скачайте и установите менеджер пакетов Chocolatey по ссылке https://chocolatey.org, далее на этом же сайте найдите компилятор (kotlinc) и установите его на свой компьютер.
Так же можно собрать приложение из консоли, введя в нее:

    kotlinc -include-runtime src/ -d bin/AAAapp.jar -cp ./lib/kotlinx-cli-0.2.1.jar

**Запуск проекта:**

Для начала работы с приложением запустите скрипт RUN.sh, передав программе нужные вам параметры. Для того чтобы узнать какие параметры может принимать приложение выведите справку, передав параметр -h.
Возможно запустить приложение из консоли. Для этого перейдите в дерикторию, в которой находится файл jar, и запустите его введя в консоль:

    java -jar AAAapp.jar -h

Вместо параметра -h вы можете передавать любые другие параметры, доступные приложению. Запуск приложения без параметров или с параметром -h выведет справку.

**Тестирование проекта:**

Для запуска теcтов проекта запустите файл TEST.sh. Тестовые сценарии описаны в Roadmap1.
