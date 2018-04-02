package hfad.com.beeradviser;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBearActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

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

        //get list class BeerExpert
        List<String> brandList = expert.getBrands(beerType);

        //building String on data to List
        StringBuilder brandsFormatted = new StringBuilder();

        //sorting display a new line
        for(String brand : brandList) {
            brandsFormatted.append(brand).append('\n');
        }

        //display the beers result
        brands.setText(brandsFormatted);
    }
}
