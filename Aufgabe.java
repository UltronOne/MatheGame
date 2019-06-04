import javafx.scene.layout.Pane;
public abstract class Aufgabe
{
    // Attribute
    protected int punkte;

    // Methoden
    public abstract void richtigeLoesungAnzeigen();

    public abstract boolean loesungUeberpruefen(String typ);

    public abstract Pane darstellungErstellen();
    
    public abstract void neu();
    
    public abstract String getTyp();

    public int getPunkte()
    {
        return punkte;
    }

}
