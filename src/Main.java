import org.lwjgl.;

public class Main implements Runnable{

    private int width = 1200;
    private int height = 720;

    private Thread thread;
    private boolean running = false;

    public void start() {
        running = false;
        thread = new Thread(this, "Game");
        thread.start();
    }

    public void init() {
        GLFW.glfwInit();
    }

    public void run() {
        init();
        while (running) {
            update();
            render();
        }
    }

    private void render() {
    }

    private void update() {
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
