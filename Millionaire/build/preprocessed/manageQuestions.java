
import java.io.IOException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;
/*
 *class to manage the different Questions
 *
 */

/**
 *
 * @eseza muwanga apple enthusiast, programmer, entrepreneur in alternative investments
 */
public class manageQuestions {

    /** Declaring array to store questions**/
    Questions myQtn[] = null;
    int count, added;
    //private int I;

    /** count indicates the number of records added indicates number of records added**/
    //creating constructor for the class
    manageQuestions() {

        myQtn = new Questions[40];
        count = 0;
        added = 0;



    }

    //method to write a question to the disk
    void createQtn() {


        for (int i = count - added; i < count; i++) {

            myQtn[i].createQtn();

        }
    }
    //method to read from disk and intialise myQtns object

    void retrieveQtn() {
        //int I = 0;

        //open the record store
        try {

            //Open Record Store
            RecordStore rsQtns = RecordStore.openRecordStore("qtnRecord", false);

            //Get the length of Record Store in a Length member variable
            int Length = rsQtns.getNumRecords();

            //Start From RecordiD 1
            int RecordID = 1;

            for (int i = 0; i < Length; i++) {
                myQtn[i] = new Questions();
                try {
                    RecordID = myQtn[i].retrieveQtn(RecordID);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                count++;

            }
            //Close Record Store
         rsQtns.closeRecordStore();

        } catch (RecordStoreFullException ex) {
            ex.printStackTrace();
        } catch (RecordStoreNotFoundException ex) {
            ex.printStackTrace();
        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        }


    }

    void addQuestion(String qtn, String opta, String optb, String optc, String optd, String ans) {

        Questions e = new Questions();

        //e.id = 0;

        e.corAns = ans;
        e.newQtn = qtn;
        e.optA = opta;
        e.optB = optb;
        e.optC = optc;
        e.optD = optd;


        myQtn[count++] = e;

        added++;

    }
}
