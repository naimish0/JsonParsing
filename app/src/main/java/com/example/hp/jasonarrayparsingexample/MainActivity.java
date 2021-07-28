package com.example.hp.jasonarrayparsingexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    String vari="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text=(TextView)findViewById(R.id.abc);

        String var="{\"student\":[{\"name\":\"ravi\",\"id\":\"101\"},{\"name\":\"prateek\",\"id\":\"420\"}]}";
        try {
            JSONObject jsn=new JSONObject(var);
            JSONArray jsnarray=jsn.getJSONArray("student");
            for(int i=0;i<jsnarray.length();i++){
                jsn=jsnarray.getJSONObject(i);
                String var1=jsn.getString("name");
                String var2=jsn.getString("id");
                //text.setText(var1+"\n"+var2);
                vari+="\n"+var1+":="+var2;
            }
            text.setText(vari);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
