Vier Säulen der Objektorientierung

1. Prinzip: Vererbung
Informationen teilen.

2. Prinzip: Kapselung
Wer darf was sehen? Klassenvariablen sind private und Zugriff geht nur über Getter und Setter.

3. Prinzip: Abstraktion
Klassen mit undefinierten Methoden. Informationen verstecken.

4. Prinzip: Polymorphie
Vererbte Methoden können überschrieben und dadurch verändert werden. Signaturen können nicht geändert werden.


for (Vehicle v : list) {
    if (v instanceof FuelCar) {
       (FuelCar)v.fuel();
    }
}

list.forEach(v -> {
  if (v instanceof FuelCar x) {
     x.fuel();
  }
};

Consumer<Vehicle> consumer = v -> {
      if (v instanceof FuelCar x) {
         x.fuel();
      }
}

list.forEach(consumer);