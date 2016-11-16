package sh.dfm.content;

import android.content.Context;

/**
 * Created by legioner on 11/16/16.
 */
public class ColorSpec {

    Context context;

    public ColorSpec(Context context) {
        this.context = context;
    }




    String getEffect(String color) {

        //Resources res = getResources();
        String[] colorResults =  context.getResources().getStringArray(R.array.color_result);
        String[] colors = context.getResources().getStringArray(R.array.color_selection);

        String effect = null;
        for (int i=0; i<colors.length; i++){
            if (color.equals(colors[i])){effect = colorResults[i];}
        }
        return effect;
    }

}