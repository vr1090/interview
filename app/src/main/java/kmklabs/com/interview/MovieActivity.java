package kmklabs.com.interview;

import android.support.annotation.VisibleForTesting;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MovieActivity extends AppCompatActivity implements MovieView {
    TextView title = null;
    MoviePresenter presenter;

    @VisibleForTesting
    public void setPresenter(MoviePresenter _presenter){
        this.presenter = _presenter;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        title = (TextView)findViewById(R.id.title);
        if(presenter == null )
            presenter = new Presenter(this);
        presenter.showTitle();
    }

    @Override
    public void showTitle(String _title) {
        this.title.setText(_title);
    }

    @Override
    public void showMovie(List<Movie> movies) {

    }
}
