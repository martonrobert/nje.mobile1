package hu.gamf.njezh;

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

public class DebFragment extends Fragment {

    private List<Player> players = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_deb, container, false);


        loadPlayers();


        RecyclerView recyclerView = view.findViewById(R.id.debRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        recyclerView.setAdapter(new FradiAdapter(players));

        return view;
    }

    private void loadPlayers() {
        players.add(new Player("Megyeri Balázs", 16, "Kapus"));
        players.add(new Player("Milosevic Marko", 22, "Kapus"));
        players.add(new Player("Baranyai Nimród", 25, "Védő"));
        players.add(new Player("Bévárdi Zsombor", 31, "Védő"));
        players.add(new Player("Dreskovic Meldin", 5, "Védő"));
        players.add(new Player("Ferenczi János", 11, "Védő"));
        players.add(new Player("Kusnyír Erik", 29, "Védő"));
        players.add(new Player("Lagator Dusan", 94, "Védő"));
        players.add(new Player("Manrique Christian", 15, "Védő"));
        players.add(new Player("Mojzis Alexander", 2, "Védő"));
        players.add(new Player("Romanchuk Oleksandr", 21, "Védő"));
        players.add(new Player("Bódi Ádám", 27, "Középpályás"));
        players.add(new Player("Domingues Brandon", 99, "Középpályás"));
        players.add(new Player("Dzsudzsák Balázs", 10, "Középpályás"));
        players.add(new Player("Loncar Stefan", 20, "Középpályás"));
        players.add(new Player("Ojediran Hamzat", 18, "Középpályás"));
        players.add(new Player("Tamás Batai", 56, "Középpályás"));
        players.add(new Player("Nimród Baranyai", 42, "Középpályás"));
        players.add(new Player("Tuboly Máté", 8, "Középpályás"));
        players.add(new Player("Vajda Botond", 22, "Középpályás"));
        players.add(new Player("Varga József", 33, "Középpályás"));
        players.add(new Player("Bárány Donát", 17, "Csatár"));
        players.add(new Player("Kyziridis Alexandros", 89, "Csatár"));
        players.add(new Player("Majdevac Andrija", 55, "Csatár"));
        players.add(new Player("Oliveira Joao", 67, "Csatár"));
        players.add(new Player("Szécsi Márk", 77, "Csatár"));

    }
}