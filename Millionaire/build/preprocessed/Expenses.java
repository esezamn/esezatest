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
/**
* This class is the base for handling the storage part of our
* Expenses application
*
* It handles all the writing and reading of the data from
* record store.
*
* An instance of this class will be created in the main Midlet
*
* @author jay
*/
public class Expenses {

/**
* The reason for which the expense was incurred
*/
String Reason = null;

/**
* The Amount of money that spent for the particular expense
*/
int Amount ;

/**
* Method to write the st to disk
*/
void writeToDisk() throws IOException {
try {
RecordStore ExpenseRecord = RecordStore.openRecordStore("ExpRecord", true);
//Creating output streams
ByteArrayOutputStream baos = new ByteArrayOutputStream();
DataOutputStream os = new DataOutputStream(baos);
//Writing value to be saved to output stream
os.writeUTF(this.Reason);
os.writeInt(this.Amount);

//close stream
os.close();

byte[] data = baos.toByteArray();

//Write the record to the record store
int id = ExpenseRecord.addRecord(data, 0, data.length);
//Close Record store
ExpenseRecord.closeRecordStore();
} catch (RecordStoreFullException ex) {
ex.printStackTrace();
} catch (RecordStoreNotFoundException ex) {
ex.printStackTrace();
} catch (RecordStoreException ex) {
ex.printStackTrace();
}
}

/**
*Method to read record from disk and
* initialize values of member variables
* @param RecordID the id of the record to be read
*/
int readFromDisk(int RecordID) throws IOException {
boolean flag = true;
while (flag) {
try {
RecordStore ExpenseRecord = RecordStore.openRecordStore("ExpRecord",false);
//read get the record, specified by RecordID in a byte array
byte[] data = ExpenseRecord.getRecord(RecordID);


//If record is read, RecordID is valid and flag
//needs to be reset
flag = false;

DataInputStream is = new DataInputStream(new ByteArrayInputStream(data));

//retrieve

this.Reason = is.readUTF();
this.Amount = is.readInt();


//close stream
is.close();
ExpenseRecord.closeRecordStore();
} catch (RecordStoreFullException ex) {
ex.printStackTrace();
} catch (RecordStoreNotFoundException ex) {

ex.printStackTrace();
} catch (InvalidRecordIDException ex) {
//If invalid recordID, it means that the
//the record was deleted, and we need to search
//in next id for a proper record.
RecordID++;
} catch (RecordStoreException ex) {
ex.printStackTrace();
}
}
//Return the ID of next record
return (++RecordID);
}
}