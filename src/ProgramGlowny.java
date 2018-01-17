class ProgramGlowny {

    public static void main(String[] args) {

        Procesor proc1 = new Procesor("DELL", "GE45", 567);
        Procesor proc2 = new Procesor("Intel", "VT667", 778);

        Memory mem1 = new Memory(35, proc1);
        Memory mem2 = new Memory(75, proc2);

        Computer comp1 = new Computer("PC", proc1, mem1);
        Computer comp2 = new Computer("MAC", proc2, mem2);

        Overlock over = new Overlock();

        comp1.showInfo();
        comp2.showInfo();

        over.increaseCpuClock(comp1, 500);
        over.decreaseCpuClock(comp2,23);

        comp1.showInfo();
        comp2.showInfo();
    }
}