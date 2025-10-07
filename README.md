MultiScreenApp
Лабораторна робота №3 – Мультиекранний застосунок з навігацією та ViewModel
Студент: Папін Едуард, К-41

Опис
Додаток демонструє мультиекранну архітектуру у Jetpack Compose: три екрани (Home, Profile, Settings), навігація з передачею параметрів, state hoisting, глибокі посилання (deep link) та збереження стану через ViewModel + StateFlow.

Основні фічі
Головний екран (HomeScreen) з кнопками переходу﻿

ProfileScreen приймає userId, показує дані користувача﻿

SettingsScreen з інпутом для зміни імені, стан зберігається у ViewModel﻿

State hoisting для TextField﻿

Глибокий deep link (myapp://profile/{userId})﻿

Збереження стану при ротації екрана (ViewModel + StateFlow)﻿

Навігація через Navigation Compose﻿

Запуск проекту
Відкрити у Android Studio﻿

Зібрати проєкт﻿

Запустити на емуляторі або пристрої﻿

HomeScreen — кнопка переходу на ProfileScreen з userId, кнопка на SettingsScreen﻿

На SettingsScreen змінити ім’я, переконатись у збереженні при ротації﻿

Технології
Jetpack Compose

Navigation Compose

ViewModel + StateFlow

Kotlin

Android Studio

Скриншоти

[Screen_recording_20251007_171052.webm](https://github.com/user-attachments/assets/bbe1feb1-e638-42ae-9d67-12c3e2952bd5)
<img width="1080" height="2400" alt="Screenshot_20251007_171120" src="https://github.com/user-attachments/assets/07b1e088-b277-41d5-88eb-884b9c8bdf5b" />


Автор
Папін Едуард (К-41), 2025
