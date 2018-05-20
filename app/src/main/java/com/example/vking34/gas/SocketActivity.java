package com.example.vking34.gas;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.vking34.gas.socket.MessageSender;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import com.example.vking34.gas.socket.receiveMess;
public class SocketActivity extends AppCompatActivity {

    private EditText et_mess;
    private Button btn_send;
    private Socket socket;

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socket);

        et_mess = (EditText) findViewById(R.id.et_mess);

        btn_send = (Button) findViewById(R.id.btn_send);


        try{
            Log.d("SocketConnection", "Connecting ...");
            socket = new Socket("192.168.1.2", 6060);

            Intent intent = new Intent(this, receiveMess.class);

            intent.putExtra("socket", (Parcelable) socket);

            startService(intent);

        } catch (IOException e) {
            e.printStackTrace();
        }

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send(v);
            }
        });
    }

    private void send(View view){

        MessageSender messageSender = new MessageSender();
        messageSender.execute(et_mess.getText().toString());
    }
}
