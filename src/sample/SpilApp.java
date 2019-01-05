package sample;

//Import fra forskellige klasser. Det meste er fra FXGL
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;


//Public klasser med nedarvning
public class SpilApp extends GameApplication
{

    //Privat enum som deklareres.
    //private enum type;

    //Override a method,
    @Override
    //Protected, som er en klasse type, der kan ses fra subklasser og pakke medlemmer
    //Denne er til initiasering af spillets grundværdier, der blandt er længde bredde og lignende detaljer
    //Denne metode er med en parameter, som er en objekt af en klasse.
    protected void initSettings(GameSettings settings)
    {
        //Objektet har en metode med en parameter(argumemt)
        settings.setWidth(1280);
        settings.setHeight(600);
        settings.setVersion("Version 1.0");
        settings.setTitle("Spil app");
        settings.setMenuEnabled(false);
        settings.setIntroEnabled(true);


    }

    @Override
    protected void initInput()
    {

    }

    //@Override
    protected void initAssets() throws Exception
    {

    }


}
