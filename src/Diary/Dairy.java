package Diary;

import java.util.ArrayList;
import java.util.List;

public class Dairy {

    private final String password;
    private  boolean isLocked= false;
    private ArrayList<Entry> entries = new ArrayList<>();

    public Dairy(String username,String password){

        this.password = password;
    }
    public void unlockDairy(String password){

        isLocked = !password.equals(this.password);
    }

    public void lockDairy(){

        isLocked();
    }
    public boolean isLocked(){

        return isLocked = true;
    }
    public void createEntry(String title, String body, String id){
        Entry entry = new Entry(title, body, id);
        entries.add(entry);
    }
    public void deleteEntry(int entryId){
        Entry id = findEntryById(entryId);
        entries.remove(id);

    }
    public Entry findEntryById(int entryNumber){
        entryNumber = entryNumber -1;
        System.out.println(entries.toString());
        return entries.get(entryNumber);
    }

    public void updateEntry(int entryId, String title, String body){
        var foundEntry = findEntryById(entryId);
        foundEntry.setTittle(title);
        foundEntry.setBody(body);
        entries.add(foundEntry);
    }

    public String viewEntry(int entryId) {
        if (entries.get(entryId-1) == null) return "oops! ";
        return findEntryById(entryId).toString();
    }
}
