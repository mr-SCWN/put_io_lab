# Pytanie 3.1. 

#### Czy testy przestałyby działać, gdyby zmieniono adnotację przy metodzie setUp z BeforeEach na BeforeAll? Uzasadnij swoją odpowiedź.

Testy przestaną działać. Daltego że gdybyśmy zmienili adnotację przy metodzie setUp, ona musiałaby być statyczna.

-------------------------------

# Pytanie 4.1

#### Która metoda zostanie oznaczona jako Failure, a która jako Error?

Metoda test1() zostanie oznaczona jako Failure.

Metoda test2() zostanie oznaczona jako Error.

-----------------------------
# Pytanie 4.2

#### Na jaką klasę rzucanego obiektu oczekuje JUnit by stwierdzić, że test się nie powiódł w sensie kategorii Failure (będzie oznaczony wykrzyknikiem na tle żółtego kółka).

JUnit oczekuje na klase AssertionError.

----------------------------------

# Pytanie 5.1

#### Jaki to typ testowania: blackbox czy whitebox?

Taki typ testowania jest whitebox'em

--------------------------------
# Pytanie 5.2

#### Ile możliwych ścieżek działania znajduje się w metodzie calculate, zakładając że punkt startowy to początek metody, a punkt końcowy to jej koniec? (Zanim przejdziesz do kolejnego kroku zadania, skonsultuj odpowiedź z prowadzącym.)

4 ścieżki działania
