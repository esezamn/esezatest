/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import java.util.Enumeration;
import java.util.Vector;
import java.io.*;
import javax.microedition.rms.*;

/**
 * created by eseza muwanga
 */
public class rms extends MIDlet {


    private RecordStore Qtns;
    private RecordStore optionA;
    private RecordStore optionB;
    private RecordStore optionC;
    private RecordStore optionD;

    public void startApp() {}
    public void pauseApp() {}
    public void destroyApp(boolean unconditional) {
    }


   public void createRecordStore(){
        try {



            Qtns = RecordStore.openRecordStore("Questions", true);
            optionA  = RecordStore.openRecordStore("OptionA", true);
            optionB  = RecordStore.openRecordStore("OptionB", true);
            optionC  = RecordStore.openRecordStore("OptionC", true);
            optionD  = RecordStore.openRecordStore("OptionD", true);



             } catch (RecordStoreException ex) {

                    ex.printStackTrace();
        }

    }
    /*function to add to recordstore created*/

    public synchronized void addRecordStore(String optA, String optB, String optC, String optD,String qtn){

        //converting the string to bytes
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ByteArrayOutputStream baos1 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos2 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos3 = new ByteArrayOutputStream();
        ByteArrayOutputStream baos4 = new ByteArrayOutputStream();
        DataOutputStream dops = new DataOutputStream(baos);
        DataOutputStream dops1 = new DataOutputStream(baos1);
        DataOutputStream dops2 = new DataOutputStream(baos2);
        DataOutputStream dops3 = new DataOutputStream(baos3);
        DataOutputStream dops4 = new DataOutputStream(baos4);
        try {
            dops.writeUTF(qtn);
            dops1.writeUTF(optA);
            dops2.writeUTF(optB);
            dops3.writeUTF(optC);
            dops4.writeUTF(optD);

        } catch (IOException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
        byte[] qutns = baos.toByteArray();
        byte[] byteOptA = baos1.toByteArray();
        byte[] byteOptB = baos2.toByteArray();
        byte[] byteOptC = baos3.toByteArray();
        byte[] byteOptD = baos4.toByteArray();

        /*byte[] byteOptA =  optA.getBytes();
        byte[] byteOptB =  optB.getBytes();
        byte[] byteOptC =  optC.getBytes();
        byte[] byteOptD =  optD.getBytes();
        byte[] byteOptQ =  qtn.getBytes();
        */
        try {

            //adding data to the record store

           optionA.addRecord(byteOptA, 0, byteOptA.length);
           optionB.addRecord(byteOptB, 0, byteOptB.length);
           optionC.addRecord(byteOptC, 0, byteOptC.length);
           optionD.addRecord(byteOptD, 0, byteOptD.length);
           Qtns.addRecord(qutns, 0,qutns.length);

        } catch (RecordStoreException ex) {
            ex.printStackTrace();
        }

    }

    //function to enumarate through the records..

    public synchronized RecordEnumeration recordEnum(RecordStore rs) throws RecordStoreNotOpenException{

        return rs.enumerateRecords(null, null, false);


    }

    //function to close recordStore

    public void closeRecordStore(RecordStore rs)throws RecordStoreNotOpenException,RecordStoreException{
        if(rs.getNumRecords()==0){
            String fileName = rs.getName();
            rs.closeRecordStore();
            rs.deleteRecordStore(fileName);

        }else{
            rs.closeRecordStore();
        }
    }

}
