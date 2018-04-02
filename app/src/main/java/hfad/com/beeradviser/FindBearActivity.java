package hfad.com.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBearActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_bear);


    }

    //call when the user clicks the button
    public void onClickFindBeer(View view) {

        //get link on TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        //get link on Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //get variant, choice in Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //output choice variant
        brands.setText(beerType);
    }
}
