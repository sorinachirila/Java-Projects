# Homework 2 - Tema 2 - Java Advanced

1.  Să se implementeze clasa Multime, care reprezintă o mulţime de întregi.  Clasa va conţine următoarele câmpuri private: 
   - int[] date – array de numere. Se va inițializa în constructor; 
   - int dim – dimensiunea vectorului date; totodată reprezintă numărul maxim de elemente din mulţime; 
   - int n – numărul curent de elemente din mulţime; în orice moment de timp, elementele mulţimii vor fi primele n elemente din vectorul date. 
   - Pe parcursul existenţei mulţimii, numărul n şi elementele din date se pot modifica, dar câmpul dim rămâne neschimbat.
   - Membrii publici: 
     - constructorul fără parametri care iniţializează câmpurile private ale mulţimii; dimensiunea maximă a mulţimii va fi o valoare oarecare prestabilită. Sa zicem valoarea 10;
     - constructorul cu un parametru pentru câmpul dim, reprezentând dimensiunea maximă a mulţimii; 
     - metoda void adauga(int) care adaugă un element în mulţime; în cazul în care elementul deja există, mulţimea rămâne nemodificată; în cazul în care vectorul date este plin, se va afişa un mesaj de eroare; 
     - metoda void extrage(int) care extrage un element din mulţime; în cazul în care mulţimea nu conţine elementul, ea rămâne neschimbată;
     - metoda void afisare() care afişează mulţimea.
   - Folositi următoarea secvență de cod pentru a testa(se va scrie în metoda statică main(…)):
     - Multime m = new Multime(10);
     - m.adauga(4);  m.adauga(3);  m.afisare();  m.extrage(4);  m.extrage(4);  m.afisare();  m.adauga(9);  
     - m.adauga(2);  m.adauga(2);  m.afisare();  
 2.  Creează o clasă abstractă Vehicle care are următorii membri private:
   - int speed: viteza cu care se deplasează vehiculul
   - int gear: treapta de viteză
   - Clasa are următoarele metode:
    - void changeGear(int newGear): metodă ce setează membrul privat gear cu parametrul primit,  ce reprezintă noua treaptă de viteză a vehiculului
    - void speedUp(int increment): metod[ ce aduce parametrul primit de metode, la viteza curente a vehiculului
    - void applyBrakes(int decrement): metodă ce scade viteza vehiculului cu valoarea primită prin parametrul metodei
    - Clasa are o metodă abstractă:
     - void printState(): metodă care afișează starea obiectului
     - Creați 2 clase Truck și Bus care extind clasa abstractă Vehicle. Ambele clase trebuie să implementeze metoda abstractă printState().
       Implementearea sa afiseze un mesaj sugestiv pentru fiecare clasa, de exemplu: "Truck state: …." Sau "Bus state:….". 
     - Testați codul folosind următoarea secvență de cod:
      - Truck  truck = new Truck(); 
      - truck.changeGear(2); 
      - truck.speedUp(3); 
      - truck.applyBrakes(1);
      - truck.printStates();
      - Bus bus = new Bus(); 
      - bus.changeGear(1); 
      - bus.speedUp(4); 
      - bus.applyBrakes(3); 
      - bus.printStates(); 
3. A swimmer can swim and breath. A walker can walk and breath. Pornind de la cele 2 propoziții proiectează, folosind clase și interfete.
  - a.  Creează interfața Swim ce conține metoda void swim()
  - b.  Creează interfața Breath ce conține metoda void breath()
  - c.  Creează interfața Walk ce conține metoda void walk()
  - d.  Creează clasa Swimmer ce implementează interfețele Swim și Breath și implementează metodele.
           Implementarea trebuie să afișeze un mesaj sugestiv la consolă. 
  - e.  Creează clasa Walker ce implementează interfețele Walk si Breath și implementează metodele.
           Implementarea trebuie să afișeze un mesaj sugestiv la consolă.
  - f.  În metoda main() instanțiază un obiect de tipul Walker și un obiect de tipul Swimmer.
           Pentru fiecare obiect apelează metodele lui și urmărește ce se afișează la consolă.
  
   
