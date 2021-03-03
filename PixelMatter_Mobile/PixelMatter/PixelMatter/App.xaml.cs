using EmbedIO;
using EmbedIO.Files;
using EmbedIO.WebApi;
using PixelMatter.Controllers;
using System.IO;
using System.Reflection;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace PixelMatter
{
    public partial class App : Application
    {
        public App()
        {
            InitializeComponent();
            // Server must be started, before WebView is initialized,
            // because we have no reload implemented in this sample.
            Task.Factory.StartNew(async () =>
            {
                using (var server = new WebServer(HttpListenerMode.EmbedIO, "http://127.0.0.1:8080/"))
                {
                    Assembly assembly = typeof(App).Assembly;
                    server.WithLocalSessionManager();
                    server.WithWebApi("/api", m => m.WithController(() => new DeviceCommunicationController()));
                    server.WithEmbeddedResources("/", assembly, "PixelMatter.dist");
                    await server.RunAsync();
                }
            });

            MainPage = new MainPage();
        }

        protected override void OnStart()
        {

        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
    }
}
