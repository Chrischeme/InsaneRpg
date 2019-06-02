using SimpleTCP;
using System;
using System.Text;

namespace Client
{
    class Program
    {
        static void Main(string[] args)
        {
            var client = new SimpleTcpClient();
            client.StringEncoder = Encoding.UTF8;
            client.DataReceived += Client_DataRecieved;
            var message = Console.ReadLine();
            client.WriteLineAndGetReply(message, TimeSpan.FromSeconds(3));
        }

        private static void Client_DataRecieved(object sender, Message e)
        {
            Console.WriteLine($"Recieved: {e.MessageString}");
        }
    }
}
