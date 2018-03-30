package matlogic.remotecontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main_ui extends AppCompatActivity {




    @BindView(R.id.txtReply)
    TextView txtReply;

    private requestManager regManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ui);
        ButterKnife.bind(this);
        txtReply.setText("Hello from Butterknife");


        regManager = new requestManager(getApplicationContext(),"http://192.168.1.3/appTest");

    }

    @OnClick(R.id.btnMsg1)
    public void sendMsg1(){
        txtReply.setText("started");
        Toast.makeText(Main_ui.this,
                "Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT).show();
        regManager.initializeGet("",regManager,regManager);
    }
}
