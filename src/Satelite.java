import java.util.ArrayList;

public class Satelite {
    // klasy do konkretnych stron parsowanie przez Satelite wielowątkowo
    // properties klasa ile chcemy wątków do obsługi parsowania dancyh
    // pula wątków -> zwraca obiekt Satelite

        // wspolne
        private String position;

        private ArrayList<String> names;

        private Transponder[] transponders;

        //

    // rozne przerozne
    /*SATBEAMS*/
    private String status = null;
    private String norad = null;
    private String cospar = null;
    private String satelite_model = null;
    private String band;


    private String operator = null;

    private String launch_site = null;

    private String launch_mass = null;

    private String launch_date = null;
    /*Koniec SATBEAMS*/

    /*King of sat*/
    private int channels;
    private int FTA;
    private String Longitude = null;
    private String max_declination = null;
    private String last_update = null;

    /*Koniec King of Sat*/


    //

    public void printInfo (){
        System.out.println(); // Pozycja, Name i liczbe transponderow
    } // ogolne wspolne

    public void printTranspondersInfo(){
        // for i printuje Transpondery
    };

    public Satelite(String position,ArrayList<String> names,Transponder[] transponders){
        this.position = position;
        this.names = names;
        this.transponders = transponders;
    }
}