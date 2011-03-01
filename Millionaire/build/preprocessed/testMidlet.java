/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.LoginScreen;
import org.netbeans.microedition.lcdui.SplashScreen;
import org.netbeans.microedition.lcdui.WaitScreen;
import org.netbeans.microedition.util.SimpleCancellableTask;

/**
 * @author info
 */
public class testMidlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;
    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form createquestion;
    private TextField textField;
    private TextField textField2;
    private TextField textField1;
    private TextField textField4;
    private TextField textField3;
    private TextField textField5;
    private List StartScreen;
    private List Administrator;
    private Form Login;
    private TextField textField6;
    private Form Questions;
    private SplashScreen splashScreen;
    private Command adminmenu;
    private Command exitCommand;
    private Command itemCommand;
    private Command itemCommand1;
    private Command itemCommand2;
    private Command itemCommand4;
    private Command itemCommand3;
    private Command backCommand;
    private Command exitCommand1;
    private Command exitCommand2;
    private Command backCommand1;
    private Command stopCommand;
    private Command verify;
    private Command logout;
    private Command newQuestion;
    private Command addQuestion;
    private Command mainmenu;
    private Command next;
    private Command askaudience;
    private Image image1;
    private Image image;
    private Image image2;
    private SimpleCancellableTask task;
    private SimpleCancellableTask task1;
    private Image image3;
    //</editor-fold>//GEN-END:|fields|0|
    //To indicate that application has started for first time
    private boolean flag = false;
//Array of Questions
    private manageQuestions myQt = new manageQuestions();
    private Questions qto = new Questions();
//private alterRMS arms = new alterRMS();

    /**
     * The testMidlet constructor.
     */
    public testMidlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|
    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getStartScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
        switchDisplayable(null, getStartScreen());//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == Administrator) {//GEN-BEGIN:|7-commandAction|1|66-preAction
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|1|66-preAction
                // write pre-action user code here
                AdministratorAction();//GEN-LINE:|7-commandAction|2|66-postAction
                // write post-action user code here
            } else if (command == backCommand1) {//GEN-LINE:|7-commandAction|3|74-preAction
                // write pre-action user code here
                switchDisplayable(null, getStartScreen());//GEN-LINE:|7-commandAction|4|74-postAction
                // write post-action user code here
            } else if (command == exitCommand2) {//GEN-LINE:|7-commandAction|5|72-preAction
                // write pre-action user code here
                switchDisplayable(null, getStartScreen());//GEN-LINE:|7-commandAction|6|72-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|102-preAction
        } else if (displayable == Login) {
            if (command == backCommand) {//GEN-END:|7-commandAction|7|102-preAction
                // write pre-action user code here
                switchDisplayable(null, getStartScreen());//GEN-LINE:|7-commandAction|8|102-postAction
                // write post-action user code here
            } else if (command == verify) {//GEN-LINE:|7-commandAction|9|106-preAction
                // write pre-action user code here
                if (textField6.getString().equals("1234")) {
                    textField6.setString("");
                    switchDisplayable(null, getAdministrator());//GEN-LINE:|7-commandAction|10|106-postAction
                } else {
                    textField6.setString("");
                    switchDisplayable(null, getStartScreen());
                }
            }//GEN-BEGIN:|7-commandAction|11|140-preAction
        } else if (displayable == Questions) {
            if (command == askaudience) {//GEN-END:|7-commandAction|11|140-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|12|140-postAction
                // write post-action user code here
            } else if (command == mainmenu) {//GEN-LINE:|7-commandAction|13|135-preAction
                // write pre-action user code here
                switchDisplayable(null, getStartScreen());//GEN-LINE:|7-commandAction|14|135-postAction
                // write post-action user code here
            } else if (command == next) {//GEN-LINE:|7-commandAction|15|138-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|16|138-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|17|59-preAction
        } else if (displayable == StartScreen) {
            if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|17|59-preAction
                // write pre-action user code here
                StartScreenAction();//GEN-LINE:|7-commandAction|18|59-postAction
                // write post-action user code here
            } else if (command == exitCommand1) {//GEN-LINE:|7-commandAction|19|62-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|20|62-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|21|122-preAction
        } else if (displayable == createquestion) {
            if (command == addQuestion) {//GEN-END:|7-commandAction|21|122-preAction
                myQt.createQtn();
                myQt.addQuestion(textField.getString(), textField1.getString(), textField2.getString(), textField3.getString(), textField4.getString(), textField5.getString());
                //arms.createRecordStore();
                // arms.addRecordStore(textField.getString(),textField1.getString() ,textField2.getString(), textField3.getString(), textField4.getString(), textField5.getString());
                textField.setString("");
                textField1.setString("");
                textField2.setString("");
                textField3.setString("");
                textField4.setString("");
                textField5.setString("");

                switchDisplayable(null, getSplashScreen());//GEN-LINE:|7-commandAction|22|122-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|23|114-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|23|114-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|24|114-postAction
                // write post-action user code here
            } else if (command == adminmenu) {//GEN-LINE:|7-commandAction|25|130-preAction
                // write pre-action user code here
                switchDisplayable(null, getAdministrator());//GEN-LINE:|7-commandAction|26|130-postAction
                // write post-action user code here
            } else if (command == logout) {//GEN-LINE:|7-commandAction|27|128-preAction
                // write pre-action user code here
                switchDisplayable(null, getStartScreen());//GEN-LINE:|7-commandAction|28|128-postAction
                // write post-action user code here
            } else if (command == newQuestion) {//GEN-LINE:|7-commandAction|29|126-preAction
                // write pre-action user code here
                switchDisplayable(null, getCreatequestion());//GEN-LINE:|7-commandAction|30|126-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|31|7-postCommandAction
        }//GEN-END:|7-commandAction|31|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|32|
    //</editor-fold>//GEN-END:|7-commandAction|32|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|20-getter|0|20-preInit
    /**
     * Returns an initiliazed instance of itemCommand component.
     * @return the initialized component instance
     */
    public Command getItemCommand() {
        if (itemCommand == null) {//GEN-END:|20-getter|0|20-preInit
            // write pre-init user code here
            itemCommand = new Command("Admin", Command.ITEM, 0);//GEN-LINE:|20-getter|1|20-postInit
            // write post-init user code here
        }//GEN-BEGIN:|20-getter|2|
        return itemCommand;
    }
    //</editor-fold>//GEN-END:|20-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand1 ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of itemCommand1 component.
     * @return the initialized component instance
     */
    public Command getItemCommand1() {
        if (itemCommand1 == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            itemCommand1 = new Command("Play", Command.ITEM, 0);//GEN-LINE:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return itemCommand1;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image ">//GEN-BEGIN:|26-getter|0|26-preInit
    /**
     * Returns an initiliazed instance of image component.
     * @return the initialized component instance
     */
    public Image getImage() {
        if (image == null) {//GEN-END:|26-getter|0|26-preInit
            // write pre-init user code here
            image = Image.createImage(1, 1);//GEN-LINE:|26-getter|1|26-postInit
            // write post-init user code here
        }//GEN-BEGIN:|26-getter|2|
        return image;
    }
    //</editor-fold>//GEN-END:|26-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initiliazed instance of image1 component.
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|27-getter|1|27-@java.io.IOException
                image1 = Image.createImage("/s-WARREN-BUFFETT-CARTOON-large.jpg");
            } catch (java.io.IOException e) {//GEN-END:|27-getter|1|27-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|27-getter|2|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|3|
        return image1;
    }
    //</editor-fold>//GEN-END:|27-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image2 ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initiliazed instance of image2 component.
     * @return the initialized component instance
     */
    public Image getImage2() {
        if (image2 == null) {//GEN-END:|28-getter|0|28-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|28-getter|1|28-@java.io.IOException
                image2 = Image.createImage("/Photo on 2010-09-17 at 21.30.jpg");
            } catch (java.io.IOException e) {//GEN-END:|28-getter|1|28-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|28-getter|2|28-postInit
            // write post-init user code here
        }//GEN-BEGIN:|28-getter|3|
        return image2;
    }
    //</editor-fold>//GEN-END:|28-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initiliazed instance of task component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask() {
        if (task == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            task = new SimpleCancellableTask();//GEN-BEGIN:|38-getter|1|38-execute
            task.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|38-getter|1|38-execute
                    // write task-execution user code here
                }//GEN-BEGIN:|38-getter|2|38-postInit
            });//GEN-END:|38-getter|2|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|3|
        return task;
    }
    //</editor-fold>//GEN-END:|38-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand2 ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initiliazed instance of itemCommand2 component.
     * @return the initialized component instance
     */
    public Command getItemCommand2() {
        if (itemCommand2 == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            itemCommand2 = new Command("Delete", Command.ITEM, 0);//GEN-LINE:|43-getter|1|43-postInit
            // write post-init user code here
        }//GEN-BEGIN:|43-getter|2|
        return itemCommand2;
    }
    //</editor-fold>//GEN-END:|43-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand3 ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initiliazed instance of itemCommand3 component.
     * @return the initialized component instance
     */
    public Command getItemCommand3() {
        if (itemCommand3 == null) {//GEN-END:|45-getter|0|45-preInit
            // write pre-init user code here
            itemCommand3 = new Command("Add", Command.ITEM, 0);//GEN-LINE:|45-getter|1|45-postInit
            // write post-init user code here
        }//GEN-BEGIN:|45-getter|2|
        return itemCommand3;
    }
    //</editor-fold>//GEN-END:|45-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand4 ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initiliazed instance of itemCommand4 component.
     * @return the initialized component instance
     */
    public Command getItemCommand4() {
        if (itemCommand4 == null) {//GEN-END:|47-getter|0|47-preInit
            // write pre-init user code here
            itemCommand4 = new Command("Edit", Command.ITEM, 0);//GEN-LINE:|47-getter|1|47-postInit
            // write post-init user code here
        }//GEN-BEGIN:|47-getter|2|
        return itemCommand4;
    }
    //</editor-fold>//GEN-END:|47-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|50-getter|0|50-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|50-getter|0|50-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|50-getter|1|50-postInit
            // write post-init user code here
        }//GEN-BEGIN:|50-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|50-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: createquestion ">//GEN-BEGIN:|55-getter|0|55-preInit
    /**
     * Returns an initiliazed instance of createquestion component.
     * @return the initialized component instance
     */
    public Form getCreatequestion() {
        if (createquestion == null) {//GEN-END:|55-getter|0|55-preInit
            // write pre-init user code here
            createquestion = new Form("New Question", new Item[] { getTextField(), getTextField1(), getTextField2(), getTextField3(), getTextField4(), getTextField5() });//GEN-BEGIN:|55-getter|1|55-postInit
            createquestion.addCommand(getAddQuestion());
            createquestion.setCommandListener(this);//GEN-END:|55-getter|1|55-postInit
            // write post-init user code here
        }//GEN-BEGIN:|55-getter|2|
        return createquestion;
    }
    //</editor-fold>//GEN-END:|55-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: StartScreen ">//GEN-BEGIN:|57-getter|0|57-preInit
    /**
     * Returns an initiliazed instance of StartScreen component.
     * @return the initialized component instance
     */
    public List getStartScreen() {
        if (StartScreen == null) {//GEN-END:|57-getter|0|57-preInit
            // write pre-init user code here
            StartScreen = new List("Menu", Choice.IMPLICIT);//GEN-BEGIN:|57-getter|1|57-postInit
            StartScreen.append("Administrator", null);
            StartScreen.append("Play Game", null);
            StartScreen.addCommand(getExitCommand1());
            StartScreen.setCommandListener(this);
            StartScreen.setSelectedFlags(new boolean[] { false, false });//GEN-END:|57-getter|1|57-postInit
            // write post-init user code here
        }//GEN-BEGIN:|57-getter|2|
        return StartScreen;
    }
    //</editor-fold>//GEN-END:|57-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: StartScreenAction ">//GEN-BEGIN:|57-action|0|57-preAction
    /**
     * Performs an action assigned to the selected list element in the StartScreen component.
     */
    public void StartScreenAction() {//GEN-END:|57-action|0|57-preAction
        // enter pre-action user code here
        String __selectedString = getStartScreen().getString(getStartScreen().getSelectedIndex());//GEN-BEGIN:|57-action|1|63-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Administrator")) {//GEN-END:|57-action|1|63-preAction
                // write pre-action user code here
                switchDisplayable(null, getLogin());//GEN-LINE:|57-action|2|63-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Play Game")) {//GEN-LINE:|57-action|3|64-preAction

                switchDisplayable(null, getQuestions());//GEN-LINE:|57-action|4|64-postAction
                if (!flag) {
                    myQt.retrieveQtn();
                    flag = true;
                }
                for (int i = Questions.size(); i < myQt.count; i++) {
                    Questions.append(myQt.myQtn[i].corAns);
                }
            }//GEN-BEGIN:|57-action|5|57-postAction
        }//GEN-END:|57-action|5|57-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|57-action|6|
    //</editor-fold>//GEN-END:|57-action|6|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|61-getter|0|61-preInit
    /**
     * Returns an initiliazed instance of exitCommand1 component.
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|61-getter|0|61-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|61-getter|1|61-postInit
            // write post-init user code here
        }//GEN-BEGIN:|61-getter|2|
        return exitCommand1;
    }
    //</editor-fold>//GEN-END:|61-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Administrator ">//GEN-BEGIN:|65-getter|0|65-preInit
    /**
     * Returns an initiliazed instance of Administrator component.
     * @return the initialized component instance
     */
    public List getAdministrator() {
        if (Administrator == null) {//GEN-END:|65-getter|0|65-preInit
            // write pre-init user code here
            Administrator = new List("Administrator", Choice.IMPLICIT);//GEN-BEGIN:|65-getter|1|65-postInit
            Administrator.append("Create Question", null);
            Administrator.append("Edit Question", null);
            Administrator.append("Delete Question", null);
            Administrator.addCommand(getExitCommand2());
            Administrator.addCommand(getBackCommand1());
            Administrator.setCommandListener(this);
            Administrator.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|65-getter|1|65-postInit
            // write post-init user code here
        }//GEN-BEGIN:|65-getter|2|
        return Administrator;
    }
    //</editor-fold>//GEN-END:|65-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: AdministratorAction ">//GEN-BEGIN:|65-action|0|65-preAction
    /**
     * Performs an action assigned to the selected list element in the Administrator component.
     */
    public void AdministratorAction() {//GEN-END:|65-action|0|65-preAction
        // enter pre-action user code here
        String __selectedString = getAdministrator().getString(getAdministrator().getSelectedIndex());//GEN-BEGIN:|65-action|1|68-preAction
        if (__selectedString != null) {
            if (__selectedString.equals("Create Question")) {//GEN-END:|65-action|1|68-preAction
                // write pre-action user code here
                switchDisplayable(null, getCreatequestion());//GEN-LINE:|65-action|2|68-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Edit Question")) {//GEN-LINE:|65-action|3|69-preAction
                // write pre-action user code here
//GEN-LINE:|65-action|4|69-postAction
                // write post-action user code here
            } else if (__selectedString.equals("Delete Question")) {//GEN-LINE:|65-action|5|70-preAction
                // write pre-action user code here
//GEN-LINE:|65-action|6|70-postAction
                // write post-action user code here
            }//GEN-BEGIN:|65-action|7|65-postAction
        }//GEN-END:|65-action|7|65-postAction
        // enter post-action user code here
    }//GEN-BEGIN:|65-action|8|
    //</editor-fold>//GEN-END:|65-action|8|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|71-getter|0|71-preInit
    /**
     * Returns an initiliazed instance of exitCommand2 component.
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|71-getter|0|71-preInit
            // write pre-init user code here
            exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|71-getter|1|71-postInit
            // write post-init user code here
        }//GEN-BEGIN:|71-getter|2|
        return exitCommand2;
    }
    //</editor-fold>//GEN-END:|71-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand1 ">//GEN-BEGIN:|73-getter|0|73-preInit
    /**
     * Returns an initiliazed instance of backCommand1 component.
     * @return the initialized component instance
     */
    public Command getBackCommand1() {
        if (backCommand1 == null) {//GEN-END:|73-getter|0|73-preInit
            // write pre-init user code here
            backCommand1 = new Command("Back", Command.BACK, 0);//GEN-LINE:|73-getter|1|73-postInit
            // write post-init user code here
        }//GEN-BEGIN:|73-getter|2|
        return backCommand1;
    }
    //</editor-fold>//GEN-END:|73-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initiliazed instance of textField component.
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            textField = new TextField("Question", null, 32, TextField.ANY);//GEN-LINE:|85-getter|1|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|2|
        return textField;
    }
    //</editor-fold>//GEN-END:|85-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField1 ">//GEN-BEGIN:|86-getter|0|86-preInit
    /**
     * Returns an initiliazed instance of textField1 component.
     * @return the initialized component instance
     */
    public TextField getTextField1() {
        if (textField1 == null) {//GEN-END:|86-getter|0|86-preInit
            // write pre-init user code here
            textField1 = new TextField("Option A", null, 32, TextField.ANY);//GEN-LINE:|86-getter|1|86-postInit
            // write post-init user code here
        }//GEN-BEGIN:|86-getter|2|
        return textField1;
    }
    //</editor-fold>//GEN-END:|86-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|87-getter|0|87-preInit
    /**
     * Returns an initiliazed instance of textField2 component.
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|87-getter|0|87-preInit
            // write pre-init user code here
            textField2 = new TextField("Option B", null, 32, TextField.ANY);//GEN-LINE:|87-getter|1|87-postInit
            // write post-init user code here
        }//GEN-BEGIN:|87-getter|2|
        return textField2;
    }
    //</editor-fold>//GEN-END:|87-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|88-getter|0|88-preInit
    /**
     * Returns an initiliazed instance of textField3 component.
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|88-getter|0|88-preInit
            // write pre-init user code here
            textField3 = new TextField("Option C", null, 32, TextField.ANY);//GEN-LINE:|88-getter|1|88-postInit
            // write post-init user code here
        }//GEN-BEGIN:|88-getter|2|
        return textField3;
    }
    //</editor-fold>//GEN-END:|88-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|89-getter|0|89-preInit
    /**
     * Returns an initiliazed instance of textField4 component.
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|89-getter|0|89-preInit
            // write pre-init user code here
            textField4 = new TextField("Option D", null, 32, TextField.ANY);//GEN-LINE:|89-getter|1|89-postInit
            // write post-init user code here
        }//GEN-BEGIN:|89-getter|2|
        return textField4;
    }
    //</editor-fold>//GEN-END:|89-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initiliazed instance of textField5 component.
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|90-getter|0|90-preInit
            // write pre-init user code here
            textField5 = new TextField("Correct Answer", null, 32, TextField.ANY);//GEN-LINE:|90-getter|1|90-postInit
            // write post-init user code here
        }//GEN-BEGIN:|90-getter|2|
        return textField5;
    }
    //</editor-fold>//GEN-END:|90-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Login ">//GEN-BEGIN:|93-getter|0|93-preInit
    /**
     * Returns an initiliazed instance of Login component.
     * @return the initialized component instance
     */
    public Form getLogin() {
        if (Login == null) {//GEN-END:|93-getter|0|93-preInit
            // write pre-init user code here
            Login = new Form("Login", new Item[] { getTextField6() });//GEN-BEGIN:|93-getter|1|93-postInit
            Login.addCommand(getBackCommand());
            Login.addCommand(getVerify());
            Login.setCommandListener(this);//GEN-END:|93-getter|1|93-postInit
            // write post-init user code here
        }//GEN-BEGIN:|93-getter|2|
        return Login;
    }
    //</editor-fold>//GEN-END:|93-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|94-getter|0|94-preInit
    /**
     * Returns an initiliazed instance of textField6 component.
     * @return the initialized component instance
     */
    public TextField getTextField6() {
        if (textField6 == null) {//GEN-END:|94-getter|0|94-preInit
            // write pre-init user code here
            textField6 = new TextField("Password", null, 32, TextField.ANY);//GEN-LINE:|94-getter|1|94-postInit
            // write post-init user code here
        }//GEN-BEGIN:|94-getter|2|
        return textField6;
    }
    //</editor-fold>//GEN-END:|94-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: task1 ">//GEN-BEGIN:|99-getter|0|99-preInit
    /**
     * Returns an initiliazed instance of task1 component.
     * @return the initialized component instance
     */
    public SimpleCancellableTask getTask1() {
        if (task1 == null) {//GEN-END:|99-getter|0|99-preInit
            // write pre-init user code here
            task1 = new SimpleCancellableTask();//GEN-BEGIN:|99-getter|1|99-execute
            task1.setExecutable(new org.netbeans.microedition.util.Executable() {
                public void execute() throws Exception {//GEN-END:|99-getter|1|99-execute
                    // write task-execution user code here
                }//GEN-BEGIN:|99-getter|2|99-postInit
            });//GEN-END:|99-getter|2|99-postInit
            // write post-init user code here
        }//GEN-BEGIN:|99-getter|3|
        return task1;
    }
    //</editor-fold>//GEN-END:|99-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stopCommand ">//GEN-BEGIN:|103-getter|0|103-preInit
    /**
     * Returns an initiliazed instance of stopCommand component.
     * @return the initialized component instance
     */
    public Command getStopCommand() {
        if (stopCommand == null) {//GEN-END:|103-getter|0|103-preInit
            // write pre-init user code here
            stopCommand = new Command("Stop", Command.STOP, 0);//GEN-LINE:|103-getter|1|103-postInit
            // write post-init user code here
        }//GEN-BEGIN:|103-getter|2|
        return stopCommand;
    }
    //</editor-fold>//GEN-END:|103-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: verify ">//GEN-BEGIN:|105-getter|0|105-preInit
    /**
     * Returns an initiliazed instance of verify component.
     * @return the initialized component instance
     */
    public Command getVerify() {
        if (verify == null) {//GEN-END:|105-getter|0|105-preInit
            // write pre-init user code here
            verify = new Command("Verify", Command.SCREEN, 0);//GEN-LINE:|105-getter|1|105-postInit
            // write post-init user code here
        }//GEN-BEGIN:|105-getter|2|
        return verify;
    }
    //</editor-fold>//GEN-END:|105-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|113-getter|0|113-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|113-getter|0|113-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|113-getter|1|113-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.addCommand(getNewQuestion());
            splashScreen.addCommand(getLogout());
            splashScreen.addCommand(getAdminmenu());
            splashScreen.setCommandListener(this);
            splashScreen.setImage(getImage3());
            splashScreen.setText("Question Creation Successful");//GEN-END:|113-getter|1|113-postInit
            // write post-init user code here
        }//GEN-BEGIN:|113-getter|2|
        return splashScreen;
    }
    //</editor-fold>//GEN-END:|113-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: image3 ">//GEN-BEGIN:|115-getter|0|115-preInit
    /**
     * Returns an initiliazed instance of image3 component.
     * @return the initialized component instance
     */
    public Image getImage3() {
        if (image3 == null) {//GEN-END:|115-getter|0|115-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|115-getter|1|115-@java.io.IOException
                image3 = Image.createImage("/how_to_be_successful.jpg");
            } catch (java.io.IOException e) {//GEN-END:|115-getter|1|115-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|115-getter|2|115-postInit
            // write post-init user code here
        }//GEN-BEGIN:|115-getter|3|
        return image3;
    }
    //</editor-fold>//GEN-END:|115-getter|3|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: Questions ">//GEN-BEGIN:|119-getter|0|119-preInit
    /**
     * Returns an initiliazed instance of Questions component.
     * @return the initialized component instance
     */
    public Form getQuestions() {
        if (Questions == null) {//GEN-END:|119-getter|0|119-preInit
            // write pre-init user code here
            Questions = new Form("Quiz", new Item[] { });//GEN-BEGIN:|119-getter|1|119-postInit
            Questions.addCommand(getMainmenu());
            Questions.addCommand(getNext());
            Questions.addCommand(getAskaudience());
            Questions.setCommandListener(this);//GEN-END:|119-getter|1|119-postInit
            // write post-init user code here
        }//GEN-BEGIN:|119-getter|2|
        return Questions;
    }
    //</editor-fold>//GEN-END:|119-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: addQuestion ">//GEN-BEGIN:|121-getter|0|121-preInit
    /**
     * Returns an initiliazed instance of addQuestion component.
     * @return the initialized component instance
     */
    public Command getAddQuestion() {
        if (addQuestion == null) {//GEN-END:|121-getter|0|121-preInit
            // write pre-init user code here
            addQuestion = new Command("Add Question", Command.ITEM, 0);//GEN-LINE:|121-getter|1|121-postInit
            // write post-init user code here
        }//GEN-BEGIN:|121-getter|2|
        return addQuestion;
    }
    //</editor-fold>//GEN-END:|121-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: newQuestion ">//GEN-BEGIN:|125-getter|0|125-preInit
    /**
     * Returns an initiliazed instance of newQuestion component.
     * @return the initialized component instance
     */
    public Command getNewQuestion() {
        if (newQuestion == null) {//GEN-END:|125-getter|0|125-preInit
            // write pre-init user code here
            newQuestion = new Command("New Question", Command.ITEM, 0);//GEN-LINE:|125-getter|1|125-postInit
            // write post-init user code here
        }//GEN-BEGIN:|125-getter|2|
        return newQuestion;
    }
    //</editor-fold>//GEN-END:|125-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: logout ">//GEN-BEGIN:|127-getter|0|127-preInit
    /**
     * Returns an initiliazed instance of logout component.
     * @return the initialized component instance
     */
    public Command getLogout() {
        if (logout == null) {//GEN-END:|127-getter|0|127-preInit
            // write pre-init user code here
            logout = new Command("Log Out", Command.ITEM, 0);//GEN-LINE:|127-getter|1|127-postInit
            // write post-init user code here
        }//GEN-BEGIN:|127-getter|2|
        return logout;
    }
    //</editor-fold>//GEN-END:|127-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: adminmenu ">//GEN-BEGIN:|129-getter|0|129-preInit
    /**
     * Returns an initiliazed instance of adminmenu component.
     * @return the initialized component instance
     */
    public Command getAdminmenu() {
        if (adminmenu == null) {//GEN-END:|129-getter|0|129-preInit
            // write pre-init user code here
            adminmenu = new Command("Back to Admin Menu", Command.ITEM, 0);//GEN-LINE:|129-getter|1|129-postInit
            // write post-init user code here
        }//GEN-BEGIN:|129-getter|2|
        return adminmenu;
    }
    //</editor-fold>//GEN-END:|129-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: mainmenu ">//GEN-BEGIN:|134-getter|0|134-preInit
    /**
     * Returns an initiliazed instance of mainmenu component.
     * @return the initialized component instance
     */
    public Command getMainmenu() {
        if (mainmenu == null) {//GEN-END:|134-getter|0|134-preInit
            // write pre-init user code here
            mainmenu = new Command("Main Menu", Command.ITEM, 0);//GEN-LINE:|134-getter|1|134-postInit
            // write post-init user code here
        }//GEN-BEGIN:|134-getter|2|
        return mainmenu;
    }
    //</editor-fold>//GEN-END:|134-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: next ">//GEN-BEGIN:|137-getter|0|137-preInit
    /**
     * Returns an initiliazed instance of next component.
     * @return the initialized component instance
     */
    public Command getNext() {
        if (next == null) {//GEN-END:|137-getter|0|137-preInit
            // write pre-init user code here
            next = new Command("Next", Command.ITEM, 0);//GEN-LINE:|137-getter|1|137-postInit
            // write post-init user code here
        }//GEN-BEGIN:|137-getter|2|
        return next;
    }
    //</editor-fold>//GEN-END:|137-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: askaudience ">//GEN-BEGIN:|139-getter|0|139-preInit
    /**
     * Returns an initiliazed instance of askaudience component.
     * @return the initialized component instance
     */
    public Command getAskaudience() {
        if (askaudience == null) {//GEN-END:|139-getter|0|139-preInit
            // write pre-init user code here
            askaudience = new Command("Ask Audience", Command.ITEM, 0);//GEN-LINE:|139-getter|1|139-postInit
            // write post-init user code here
        }//GEN-BEGIN:|139-getter|2|
        return askaudience;
    }
    //</editor-fold>//GEN-END:|139-getter|2|



    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        try {

            myQt.createQtn();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }
    /*function to create recordstore*/

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
