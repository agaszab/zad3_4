public class Computer {
    String nazwa;
    Memory memory;
    Procesor procesor;

    Computer (String nazwa, Procesor proc, Memory mem ){

        this.procesor=proc;
        this.memory=mem;
        this.nazwa=nazwa;

    }

    void showInfo (){

        System.out.println ("Nazwa komputera: "+this.nazwa+ ",producent: "+this.procesor.producent+ ", model: "+this.procesor.model+", taktowanie: "+this.procesor.taktowanie+", ilość pamięci: "+this.memory.ilosc);
    }


}
