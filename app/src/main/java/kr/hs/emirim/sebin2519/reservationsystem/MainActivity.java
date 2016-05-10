package kr.hs.emirim.sebin2519.reservationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;//크로미터
    Button butStart,butDone;
    RadioButton radioDate, radioTime;
    CalendarView calView;
    TimePicker timePick;
    TextView textResult;

    //xml에서 같은 이름을 찾아 참조값들을 메인메모리에 할당
    //액티비티가 생성되었을 떄 호출됨

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//implation: (하드웨어 안드로이드sdk)올린다

        chrono=(Chronometer)findViewById(R.id.chrono); //형변환
        butStart=(Button)findViewById(R.id.but_start);
        butDone=(Button)findViewById(R.id.but_done);
        radioDate=(RadioButton)findViewById(R.id.radio_date);
        radioTime=(RadioButton)findViewById(R.id.radio_time);
        calView=(CalendarView)findViewById(R.id.calendar);
        timePick=(TimePicker)findViewById(R.id.time_pick);
        textResult=(TextView)findViewById(R.id.text_result);

        timePick.setVisibility(View.INVISIBLE); //INVISIBLE: 안보이게 하는 것(radio버튼을 클릭했을때 나오게 하기 위함)
        calView.setVisibility(View.INVISIBLE);

    }
}
