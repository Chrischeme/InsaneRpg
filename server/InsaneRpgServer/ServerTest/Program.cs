using SimpleTCP;
using System;

namespace ServerTest
{
    class Program
    {
        static void Main(string[] args)
        {
            var server = new SimpleTcpServer().Start(8000);
            server.DataReceived += (sender, msg) => {
                Console.WriteLine($"Message was: {msg.MessageString}");
                msg.Reply("Content-Type: text/plain\n\nHello from my web server!");
            };
            while (true)
            {

            }
        }
    }
}
