using System;

namespace ServerTest
{
    class Program
    {
        static void Main(string[] args)
        {
            Server server = new Server();
            var input = Console.ReadLine();
            var run = true;
            while (run)
            {
                switch (input)
                {
                    case "2":
                        server.StopServer();
                        break;
                    default:
                        run = false;
                        break;
                }
            }
        }
    }
}
