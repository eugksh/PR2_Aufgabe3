package haw.PR2;

public class PersonenWagen {
    private int sitzPlaetze;
    private int stehtPlaetze;

    public PersonenWagen(int sP, int sTP) {

        this.sitzPlaetze=sP;
        this.stehtPlaetze=sTP;

    }

    public int getSitzPlaetze() {
        return sitzPlaetze;
    }

    public int getStehtPlaetze() {
        return stehtPlaetze;
    }

}
