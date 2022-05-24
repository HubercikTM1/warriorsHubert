package com.company;

import com.company.classes.CharacterClass;
import com.company.classes.arenas.Syberia;
import com.company.classes.characters.Archer;
import com.company.classes.characters.Healer;
import com.company.classes.characters.Mage;
import com.company.classes.characters.Warrior;

import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) {

        //test
        //Warrior war1 = new Warrior("Name");
        //war1.info();

        MenuWindow menuWindow = new MenuWindow(200, 200);


        /*
        polimorfizm - Skoro wiemy, że wszystkie te klasy reprezentują tak naprawdę bardzo podobne obiekty
         o podobnych cechach możemy je powiązać ze sobą za pomocą interfejsu, który będzie pewnym "kontraktem",
         mówiącym o tym, że klasy go implementujące, muszą zawierać pewne metody. Dzięki temu, że
         wszystkie takie obiekty moglibyśmy teraz umieścić przykładowo w tablicy, nieprawdopodobnie zmniejszyli byśmy rozmiar kodu,
          a tym samym zwiększyli jego czytelność.
         */

        /*
        enkapsulacja - (inaczej hermetyzacja) to ukrywanie widoczności pól danej klasy dla innych klas,
        co w ten sposób chroni dane przechowywane w tych polach przed niepowołanym, lub co najmniej nieuzasadnionym dostępem.
        Np. w jednej klasie niektore pola klasysa private a niektore public
        */

        /*
        Modyfikator private oznacza, że kod jest dostępny tylko w zadeklarowanej klasie
        (co ciekawe, w przypadku konstruktorów ma to takie znaczenie, że obiektu danej klasy nie stworzymy spoza tej klasy).
         Modyfikator protected oznacza, że kod jest dostępny w tym samym pakiecie i podklasach.
         */

    }
}
