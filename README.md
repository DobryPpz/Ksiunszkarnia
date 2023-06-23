# Ksiunszkarnia
Projekt zaliczeniowy na przedmiot SKE:P
# Jak używać
Aplikację należy uruchomić, jest self-contained, zawiera już tomcata.
Można się zarejestrować przez przeglądarkę i zalogować.
Po wejściu na stronę widnieje lista wszystkich książek dostępnych w księgarni.
Można jedną lub więcej z nich dodać do koszyka, a z poziomu koszyka złożyć zamówienie.
Można też wyświetlić status swoich zamówień.
Po zalogowaniu się na konto admina ma się dostęp do panelu admina, skąd można dodać lub usuwać książki 
z księgarni i zmieniać status zamówień.
# Instalacja
Należy stworzyć bazę sql o nazwie `ksiunszkarnia_db`. W pliku application.properties ustawić odpowiednie dane
logowania do bazy. Wszystkie tabele są tworzone automatycznie. Czasem trzeba aplikację zamknąć i uruchomić ponownie
żeby wszystkie tabele na pewno dobrze się utworzyły. W folderze sql_scripts jest skrypt tworzenia konta adminowego.
Żeby stworzyć konto admina należy ten skrypt uruchomić na bazie `ksiunszkarnia_db` i w razie potrzeby zmienić dane
logowania dla admina.
