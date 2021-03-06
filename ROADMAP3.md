Roadmap 3
-

1. Log4j

    1.1. Список вопросов для изучения:
    - Как правильно собрать .jar с библиотеками?
    - Функционал библиотеки как средства для логирования?
    - Как работать с записью (лога) в файл?
    
    1.2. Метод исследования:
    - Прочтение документации.
    
    1.3. Ожидаемые результаты:
    - План подключения log4j
    
2.  Java DB Connectivity

    2.1. Список вопросов для изучения:
    - Как подключить SQL базу данных?
    - Как упаковать h2db в .jar проекта?
    - Как подключаться к БД и работать с ней?
    
    2.2. Метод исследования:
    - Прочтение документации к java.sql.
    - Прочтение документации к h2db.
    - Изучение синтаксиса SQL и модели реляционной БД.
    
    2.3. Ожидаемые результаты:
    - План подключения h2db к проекту и упаковки её в .jar.
    
3. FlyWay
    
    3.1. Список вопросов для изучения:
    - Что такое миграция БД?
    - Как инициализировать заполнение тестовыми данными через миграцию, если БД не найдена в папке с приложением?
    
    3.2. Метод исследования:
    - Прочтение документации.
    
    3.3. Ожидаемые результаты:
    - Навыки работы с FlyWay и план настройки миграция для проекта.
    
4. Подключение и настройка log4j в проекте.
    
    4.1. Вывод в stdout.
    
    4.2. Вывод в текстовый файл aaa.log.
   
5. Подключить встраиваемую БД.
    
6. Переработать существующий проект под Anemic Data Model
    
    6.1. Переделать существующие сервисы под работу с DAL.
    
    6.2. Реализовать DAO для работы с h2db при помощи Java DB Connectivity (если их несколько, то вынести в пакет DAL).
    
    6.3. Заменить содержимое существующего пакета domains на содержимое пакета models.
    
    6.4. Удалить ненужный пакет models.
    
7. Считывать настройки БД из переменных окружения.
    
8. Подключение и настройка миграций FlyWay.

    8.1. Реализовать инициализацию БД с тестовыми в случае, если БД не найдена в папке проекта.
    
9. Проверить код приложения на соблюдение принципов SOLID, и исправить в случае необходимости.