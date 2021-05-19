package Command;

import java.util.ArrayList;
import java.util.List;

public class RemoteController {

    List<Command> onCommands;
    List<Command> offCommands;
    List<Command> undoCommand;

    public RemoteController(){
        this.onCommands = new ArrayList<Command>();
        this.offCommands = new ArrayList<Command>();
        for (int i = 0; i < 5; i++){
            onCommands.add(new NoCommand());
            offCommands.add(new NoCommand());
        }
        this.undoCommand = new ArrayList<Command>();
    }

    // 给按钮设置命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands.set(no, onCommand);
        offCommands.set(no, offCommand);
    }
    // 按下开的按钮
    public void onButtonPressed(int no){
        onCommands.get(no).execute();
        // 记录本次操作，用于undo
        undoCommand.add(onCommands.get(no));
    }
    // 按下关的按钮
    public void offButtonPressed(int no){
        offCommands.get(no).execute();
        // 记录本次操作，用于undo
        undoCommand.add(offCommands.get(no));
    }
    // 按下undo按钮
    public void undo(){
        undoCommand.get(undoCommand.size()-1).undo();
        undoCommand.remove(undoCommand.size()-1);
    }

}
