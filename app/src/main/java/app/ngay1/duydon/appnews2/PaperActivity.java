package app.ngay1.duydon.appnews2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import app.ngay2.adapter.PaperAdapter;
import app.ngay2.test.Variables;


public class PaperActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaperAdapter adapter = new PaperAdapter(this,R.id.tvPaper, Variables.PAPERS);
        setListAdapter(adapter);
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
        Intent intent = new Intent("app.ngay1.duydon.appnews2.CATEGORY");
        intent.putExtra(Variables.PAPER, position);

        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_paper, menu);
        return true;
    }
}
