# nje.mobile1
NJE Mobil I.
Alkalmazásunk célja, hogy a magyar NB1-es csapatokat megismerjék, ráadásul az ott játszó játékosokat is megnézhetik az applikáció használói.
Kezdőoldalon egy listázza az összes aktuálisan (2023.11) NB1-es csapatait. Csapatra kattintva látható az ott játszó játékos Teljes neve, mezszáma, posztja.
Visszalépés során mindig a főoldalra fog minket dobni az applikáció.
Egyelőre 4 csapatnak van kész a teljes felülete, továbbfejlesztést igényel az applikációnk.

Szakmaibb nyelven:
Az applikációban 1 Activity van és minden csapatra kattintással egy új fragment jelenik meg, amiben egy RecycleView, setText van elhelyezve. 
Összes nézet ConstraitLayout-al készült!
Képeket a drawable mappából jeleníti meg.
Mindne csapat rendelkezik egy Adapter,Fragment, XML felülettel. ( 4 ami elkészült idáig )

Tovább fejlesztés ötletek:
Az applikációt API-n keresztül kezelni, kibővíteni további bajnokságokkal.
Bejelentkezési lehetőséget létrehozni, akutális meccs eredményeket megjeleníteni az oldalon.
