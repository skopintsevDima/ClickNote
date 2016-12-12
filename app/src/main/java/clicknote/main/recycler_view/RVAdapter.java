package clicknote.main.recycler_view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import clicknote.main.R;
import clicknote.main.notes.Note;

/**
 * Created by skopi on 11.12.2016.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.NoteViewHolder> {

    public static class NoteViewHolder extends RecyclerView.ViewHolder {

        private TextView title;

        public NoteViewHolder(View itemView)
        {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.title);
        }
    }

    private List<Note> notes;

    public RVAdapter(List<Note> notes)
    {
        this.notes = notes;
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item, parent, false);
        NoteViewHolder noteViewHolder = new NoteViewHolder(v);
        return noteViewHolder;
    }

    @Override
    public void onBindViewHolder(NoteViewHolder noteViewHolder, int index) {
        noteViewHolder.title.setText(notes.get(index).getTitle());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
