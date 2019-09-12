package com.example.jocelynjoubert2017.lokacar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jocelynjoubert2017.lokacar.entities.Client;
import com.example.jocelynjoubert2017.lokacar.entities.Location;

import java.util.Date;
import java.util.List;

public class ListeLocationsAdapter extends RecyclerView.Adapter<LocationViewHolder> {

    // Liste d'objets métier :
    private List<Location> listeLocations = null;

    /**
     * Constructeur.
     */
    public ListeLocationsAdapter(List<Location> listeLocations)
    {
        this.listeLocations = listeLocations;
    }

    @Override
    public LocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View viewLocation = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location, parent, false);
        return new LocationViewHolder(viewLocation);
    }

    @Override
    public void onBindViewHolder(LocationViewHolder holder, int position)
    {

        holder.textViewDateDepart.setText(new Date(listeLocations.get(position).getDateDepart()).toLocaleString());
        holder.textViewDateRetourPrevu.setText(new Date(listeLocations.get(position).getDateRetourPrevu()).toLocaleString());
        holder.textViewImmat.setText(listeLocations.get(position).getVehiculeId());
        holder.textViewPrenomClient.setText(listeLocations.get(position).getClient().getPrenom());
        holder.textViewNomClient.setText(listeLocations.get(position).getClient().getNom());

    }

    @Override
    public int getItemCount()
    {
        return listeLocations.size();
    }

    /**
     * Ajout d'un client à la liste.
     */
   /* public void ajouterClient(Client client)
    {
        listeClients.add(0, client);
        notifyItemInserted(0);
    }*/



}
