***

# MultiScreenApp

**Лабораторна робота №3 – Мультиекранний застосунок з навігацією та ViewModel**
Студент: Папін Едуард, К-41

***

## Опис

Додаток демонструє мультиекранну архітектуру у Jetpack Compose: три екрани (Home, Profile, Settings), навігація з передачею параметрів, state hoisting, глибокі посилання (deep link) та збереження стану через ViewModel + StateFlow.

***

## Основні фічі

- Головний екран (HomeScreen) з кнопками переходу
- ProfileScreen приймає userId, показує дані користувача
- SettingsScreen з інпутом для зміни імені, стан зберігається у ViewModel
- State hoisting для TextField
- Глибокий deep link (myapp://profile/{userId})
- Збереження стану при ротації екрана (ViewModel + StateFlow)
- Навігація через Navigation Compose

***

## Запуск проекту

1. Відкрити у Android Studio
2. Зібрати проєкт
3. Запустити на емуляторі або пристрої
4. HomeScreen — кнопка переходу на ProfileScreen з userId, кнопка на SettingsScreen
5. На SettingsScreen змінити ім’я, переконатись у збереженні при ротації

***

## Технології

- Jetpack Compose
- Navigation Compose
- ViewModel + StateFlow
- Kotlin
- Android Studio

***

## Скриншоти
<img width="1080" height="2400" alt="Screenshot_20251007_171120" src="https://github.com/user-attachments/assets/877db644-823c-4085-84c5-3e3f8611d7a3" />

[Screen_recording_20251007_171052.webm](https://github.com/user-attachments/assets/1b8a509c-c47e-46e5-8b60-6c5e7518503a)


***

## Автор

Папін Едуард (К-41), 2025


