package com.mygdx.insanerpg.desktop;

import com.badlogic.gdx.net.Socket;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class InsaneRpgClient implements Runnable
{
    public void run()
    {
        try
        {
            Socket socket = new Socket(serverIpAddress, serverPort);
            socket.setSoTimeout(5000);

            while (true)
            {
                try
                {
                    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
                    Log.d("Nicklas", "Out it goes");
                    out.println(Command);

                    if (Command == "CMD:GetOptions<EOF>")
                    {
                        Log.d("Nicklas", "Getting options");
                        try
                        {
                            Log.d("Nicklas", "Line 1");
                            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                            Log.d("Nicklas", "Line 2");
                            String answer = in.readLine();
                            Log.d("Nicklas", "answer = " + answer );
                        }
                        catch (Exception ee)
                        {
                            Log.d("Nicklasasasas", ee.toString());
                        }
                    }
                    break;

                }

                catch (Exception e)
                {
                    Log.d("Nicklas", "CAE = " + e.toString());
                    break;

                }
            }
            socket.close();
        }
        catch (ConnectException ee)
        {
            Log.d("Nicklas", "Kunne ikke forbinde");

        }
        catch (Exception e)
        {
            Log.d("Nicklasssssss", e.toString());
        }
    }
}