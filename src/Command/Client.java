package Command;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        Light light = new Light();
        RemoteController remoteController = new RemoteController();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        // 开灯
        remoteController.onButtonPressed(0);
        // 关灯
        remoteController.offButtonPressed(0);
        // 开灯
        remoteController.onButtonPressed(0);
        System.out.println("===undo===");
        // undo
        remoteController.undo();
        // undo
        remoteController.undo();
        // undo
        remoteController.undo();

    }
}
