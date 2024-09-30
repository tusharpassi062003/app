package java.username.mycalculator1;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
//import org.mozilla.javascript.context;
//import org.mozilla.javascript.scriptable;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView resultTv, solutionTv;
    MaterialButton buttonC, buttonBrackOpen, buttonBrackClose;
    MaterialButton buttonDivide, buttonMultiply, buttonPlus, buttonMinus, buttonEquals;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonAC, buttonDot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.soution_TV);

        assignId(buttonC, R.id.button_c);
        assignId(buttonBrackOpen, R.id.button_open_bracket);
        assignId(buttonBrackClose, R.id.button_close);
        assignId(buttonDivide, R.id.button_divide);
        assignId(buttonMultiply, R.id.button_Multiply);
        assignId(buttonPlus, R.id.button_Plus);
        assignId(buttonMinus, R.id.button_Minus);
        assignId(buttonEquals, R.id.button_Equals);
        assignId(button0, R.id.button_0);
        assignId(button1, R.id.button_1);
        assignId(button2, R.id.button_2);
        assignId(button3, R.id.button_3);
        assignId(button4, R.id.button_4);
        assignId(button5, R.id.button_5);
        assignId(button6, R.id.button_6);
        assignId(button7, R.id.button_7);
        assignId(button8, R.id.button_8);
        assignId(button9, R.id.button_9);
        assignId(buttonAC, R.id.button_AC);
        assignId(buttonDot, R.id.button_Dot);


    }

    void assignId(MaterialButton btn, int id) {
        btn = findViewById(id);
        //  btn.setOnClickListener(this);
        {

        }


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    @Override
    public void onClick(View view) {
        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();
        solutionTv.setText(buttonText);

        if (button.equals("AC")) {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }
        if (buttonText.equals("=")) {
            solutionTv.setText(resultTv.getText());
            return;

        }
        if (buttonText.equals("C")) {
            //  dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);
        } else {
            // dataToCalculate= dataToCalculate+buttonText;
        }
//solutionTv =setText(dataToCalculate);

        //  String finalResult = getResult(dataToCalculate);
        //  if (!finalResult.equals("Err")){
        //     resultTv.setText(finalResult);

    }

    String getResult(String data) {
        try {
            //Context context = Context.enter();
            // Context.SetOptimizationLevel(-1);
            //Scriptable scriptable = context.intStandardObjects();context;
            //String finalResult = Context.evaluateString(scriptable,data,"javascript,1,null).toSt
            // return finalResult;
        } catch (Exception e) {
            return "Err";
        }
        return data;
    }
}










