using SimpleTCP;
using System;
using System.Text;

namespace Client
{
    class Program
    {
        static void Main(string[] args)
        {
            var client = new SimpleTcpClient().Connect("127.0.0.1", 8000);
            client.DataReceived += (sender, msg) => {
                Console.WriteLine($"Message was: {msg.MessageString}");
            };
            var message = Console.ReadLine();
            client.WriteLine(message);
            Console.ReadLine();
            while (true)
            {

            }
        }
    }
}
