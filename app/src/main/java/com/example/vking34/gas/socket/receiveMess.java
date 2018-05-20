package com.example.vking34.gas.socket;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;
import com.example.vking34.gas.SocketActivity;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class receiveMess extends IntentService {

    private Socket socket;

    public receiveMess()
    {
        super("receiving Messages");
    }
    public receiveMess(String name, Socket s) {
        super(name);
        this.socket = s;
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.v("receiveMess", "started");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String inString = "";
        try {

            assert intent != null;
            socket = intent.getParcelableExtra("socket");
            DataInputStream in = new DataInputStream(socket.getInputStream());

            while (true) {
                inString = in.readUTF();
                System.out.println("Server says: " + inString);
                if (inString.equals("bye")) {
                    break;
                }
            }
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
