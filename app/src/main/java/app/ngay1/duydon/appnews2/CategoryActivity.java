package app.ngay1.duydon.appnews2;

import android.app.ListActivity;
import android.os.Bundle;

import app.ngay2.adapter.PaperAdapter;
import app.ngay2.test.Variables;

/**
 * Created by DuyDon on 01.04.2016.
 */
public class CategoryActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        int paper = bundle.getInt(Variables.PAPER);
        setTitle(Variables.PAPERS[paper]);

    }
}
