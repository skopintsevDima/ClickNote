package clicknote.main.notes;

import java.util.ArrayList;

/**
 * Created by skopi on 11.12.2016.
 */

public class Note {

    private String title;

    public static ArrayList<Note> initData()
    {
        ArrayList<Note> noteArrayList = new ArrayList<Note>();
        //!!!Загрузить список заметок из базы данных
        for (int i = 0; i < 10; i++)
            noteArrayList.add(new Note(String.valueOf(i)));
        return  noteArrayList;
    }

    public Note()
    {

    }

    public Note(String title)
    {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
