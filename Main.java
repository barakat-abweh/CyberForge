
### Step 4: Add Initial Java Code

1. Create a basic JavaFX project structure:
   - `src/`
      - `Main.java`
      - `controller/`
      - `model/`
      - `view/`

2. Add this to `Main.java` to serve as a starting point:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CyberForge");
        Label label = new Label("Welcome to CyberForge - Your Cross-Platform Networking Client!");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
