package com.example.vking34.gas.socket;

import android.os.AsyncTask;
import android.util.Log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class MessageSender extends AsyncTask<String, Void, Void> {

    private static final String TAG = "SocketActivity";

    Socket socket;
    DataOutputStream dos;
    DataInputStream din;
    PrintWriter pw;

    @Override
    protected Void doInBackground(String... voids) {

        String mess = voids[0];

        try{
            socket = new Socket("192.168.1.1", 6060);

            Log.d(TAG, "Just connected to " + socket.getRemoteSocketAddress());

            pw = new PrintWriter(socket.getOutputStream());
            pw.write(mess);
            pw.flush();
            pw.close();
            socket.close();
        }catch (IOException e)
        {

            Log.d(TAG, e.getMessage());
        }


        return null;
    }
}
