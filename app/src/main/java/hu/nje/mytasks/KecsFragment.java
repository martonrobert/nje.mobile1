package hu.gamf.njezh;

import static hu.gamf.njezh.R.*;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import hu.gamf.njezh.Player;
import java.util.List;
import java.util.ArrayList;

public class KecsFragment extends Fragment {

    private List<Player> players = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(layout.fragment_kecs, container, false);


        loadPlayers();


        RecyclerView recyclerView = view.findViewById(id.HouseRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        recyclerView.setAdapter(new FradiAdapter(players));

        return view;
    }

    private void loadPlayers() {
        players.add(new Player("Varga Bence", 20, "Kapus"));
        players.add(new Player("Belényesi Csaba", 18, "Kapus"));
        players.add(new Player("Katona Levente", 6, "Védő"));
        players.add(new Player( "Matheus", 21, "Védő"));
        players.add(new Player("Nagy Olivér", 25, "Védő"));
        players.add(new Player("Patrick Iyinbor", 57, "Védő"));
        players.add(new Player("Szabó Alex", 15, "Védő"));
        players.add(new Player("Szalai Gábor", 12, "Védő"));
        players.add(new Player("Szűcs Kornél", 26, "Védő"));
        players.add(new Player("Zeke Márió", 77, "Védő"));
        players.add(new Player("Romanchuk Oleksandr", 21, "Védő"));
        players.add(new Player("Horváth Krisztofer", 11, "Középpályás"));
        players.add(new Player( "Kiss Bence", 31, "Középpályás"));
        players.add(new Player("Nagy Krisztián", 28, "Középpályás"));
        players.add(new Player("Szuhodovszki Soma", 23, "Középpályás"));
        players.add(new Player("Vágó Levente", 16, "Középpályás"));
        players.add(new Player("Zsótér Donát", 27, "Középpályás"));
        players.add(new Player("Dávid Artner", 36, "Középpályás"));
        players.add(new Player("Kolos Kovács", 66, "Középpályás"));
        players.add(new Player("Ákos Horváth", 51, "Középpályás"));
        players.add(new Player("Varga József", 33, "Középpályás"));
        players.add(new Player("Májer Milán", 17, "Csatár"));
        players.add(new Player("Pálinkás Gergő", 8, "Csatár"));
        players.add(new Player("Szendrei Ákos", 99, "Csatár"));
        players.add(new Player("Tóth Barna", 22, "Csatár"));

    }
}