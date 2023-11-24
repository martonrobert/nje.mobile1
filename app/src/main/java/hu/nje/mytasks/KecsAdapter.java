package hu.gamf.njezh;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import hu.gamf.njezh.Player;

import java.util.List;
public class KecsAdapter extends RecyclerView.Adapter<KecsAdapter.ViewHolder> {

    private List<Player> players;

    public KecsAdapter(List<Player> players) {
        this.players = players;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // A játékos elemének a létrehozása
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_kecs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(players.get(position).getName());
        holder.number.setText(String.valueOf(players.get(position).getNumber()));
        holder.position.setText(players.get(position).getPosition());
    }

    @Override
    public int getItemCount() {

        return players.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView number;
        public TextView position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            position = itemView.findViewById(R.id.position);
        }
    }
}