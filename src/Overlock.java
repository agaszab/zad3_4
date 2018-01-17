public class Overlock {

    void increaseCpuClock(Computer computer, int a) {

        computer.procesor.taktowanie += a;
    }

    void decreaseCpuClock(Computer computer, int a) {

        computer.procesor.taktowanie -= a;
    }
}
