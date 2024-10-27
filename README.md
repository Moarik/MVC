# Калькулятор (MVC) на Java

## Описание проекта
Это простое приложение калькулятора, разработанное с использованием паттерна MVC (Model-View-Controller). Калькулятор поддерживает базовые арифметические операции: сложение, вычитание, умножение и деление. В приложении реализована обработка ошибок деления на ноль и проверка ввода.

## Технологии
- Java
- Swing для создания графического интерфейса пользователя (GUI)
- MVC архитектура

## Структура проекта
- `CalculatorModel`: Модель, в которой реализована бизнес-логика приложения.
- `CalculatorView`: Представление, которое отвечает за интерфейс пользователя.
- `CalculatorController`: Контроллер, который управляет передачей данных между моделью и представлением.

## Запуск приложения
1. Склонируйте репозиторий:  
   ```bash
   git clone https://github.com/Moarik/MVC.git

### 2. **Логические коммиты**

Разбейте проект на логические коммиты, чтобы легко отслеживать изменения. Примеры коммитов:

1. **Добавлена модель** — добавьте классы и методы модели `CalculatorModel`.
2. **Создан интерфейс** — добавьте код представления в `CalculatorView`.
3. **Реализован контроллер** — добавьте код для обработки взаимодействий в `CalculatorController`.
4. **Добавлена обработка ошибок** — добавьте проверку деления на ноль и обработку некорректного ввода.
5. **Обновлен README.md** — добавьте файл README.md с инструкциями. 
