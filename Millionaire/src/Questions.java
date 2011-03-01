/** importing classes**/
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;
import javax.microedition.rms.RecordStoreNotFoundException;


/*
 * Java Class that handles the Storage and Creation of Questions
 * 
 */

/**
 *
 * @Eseza Muwanga apple enthusiast, programmer, entrepreneur in silver investment
 */



public class Questions {

    /*declaring variables that the question consists of*/
    String newQtn, optA, optB, optC, optD, corAns;
    /*****question*optionA, optionB, option C, option D,correct Answer*/

    void createQtn(){
        try {
            /**declaring the recordstore**/
            RecordStore rsQtns = RecordStore.openRecordStore("Questions", true);


            /**creating an output stream**/

            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            DataOutputStream os = new DataOutputStream(baos);
            try {
                //writing values to be saved to output stream
                os.writeUTF(this.newQtn);
                os.writeUTF(this.optA);
                os.writeUTF(this.optB);
                os.writeUTF(this.optC);
                os.writeUTF(this.optD);
                os.writeUTF(this.corAns);

                /**closing the stream**/

                os.close();


                /**writing record to the record store**/
                byte[] data = baos.toByteArray();
                int id = rsQtns.addRecord(data, 0, data.length);

                /** close the record **/


                rsQtns.closeRecordStore();

            } catch (IOException ex) {
                //ex.printStackTrace();
                ex.printStackTrace();
            }

        } catch (RecordStoreException ex) {
                ex.printStackTrace();
        }

        }

    /**function for retrieving data from the record store **/

    int retrieveQtn(int recordID) throws IOException{

      boolean flag = true;
      while(flag){
            try {
                RecordStore rsQtns = RecordStore.openRecordStore("Questions", false);
                byte[] data = rsQtns.getRecord(recordID);

                //reset flag
                flag = false;

                DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));


                //retrieving all the data


                this.newQtn = is.readUTF();
                this.optA = is.readUTF();
                this.optB  = is.readUTF();
                this.optC = is.readUTF();
                this.corAns = is.readUTF();


                //close the record store

                is.close();
                rsQtns.closeRecordStore();

            } catch (RecordStoreException ex) {
                ex.printStackTrace();
            }


      }

            return (++recordID);

    }





}
