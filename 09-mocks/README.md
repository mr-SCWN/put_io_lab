# Pytanie 2.1

#### W jaki sposób zmienić działanie obiektu zastępczego by weryfikował czy interakcja metody loadExpenses z obiektem zastępczym bazy danych była poprawna, tj. najpierw otwarto połączenie z bazą (connect), następnie pobrano dane (queryAll), a na końcu zakończono połączenie (close)?

- Możemy skorzystać z Mockito do sprawdzenia, czy metody zostały wywołane w oczekiwanej kolejności. 

- Najpierw tworzymy obiekt zastępczy dla bazy danych, określamy, jakie wywołania metod oczekujemy na tym obiekcie i jakie odpowiedzi mają być zwrócone. 

- Następnie wywołujemy metodę, którą chcemy przetestować.

- Na końcu weryfikujemy, czy metody na obiekcie zastępczym zostały wywołane zgodnie z oczekiwaną kolejnością.

-------------------------------------

# Pytanie 5.1

#### Czy kolejność oczekiwań dla tej samej metody, dopasowanej dla różnych argumentów ma znaczenie?

Tak. Kolejność oczekiwań ma znaczenie w Mockito. 

Oczekiwania traktowane są jako sekwencja, a metody są wywoływane w tej samej kolejności, co ich definicja. Jeśli oczekujemy różnych zachowań dla tej samej metody z różnymi argumentami, to ich realizacja zależy od kolejności zdefiniowanych oczekiwań.
