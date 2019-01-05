package sample;

//Import fra forskellige klasser. Det meste er fra FXGL
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;


//Public klasser med nedarvning
public class SpilApp extends GameApplication
{

    //Privat enum som deklareres.
    private enum Type;

    @Override
    protected void initSettings(GameSettings settings)
    {
        settings.setWidth(1280);

    }


}
