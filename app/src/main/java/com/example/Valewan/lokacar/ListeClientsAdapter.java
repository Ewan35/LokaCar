package com.example.jocelynjoubert2017.lokacar;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jocelynjoubert2017.lokacar.entities.Client;

import java.util.List;

public class ListeClientsAdapter extends RecyclerView.Adapter<ClientViewHolder> {

    // Liste d'objets métier :
    private List<Client> listeClients = null;

    /**
     * Constructeur.
     */
    public ListeClientsAdapter(List<Client> listeClients)
    {
        this.listeClients = listeClients;
    }

    @Override
    public ClientViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View viewClient = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_client, parent, false);
        return new ClientViewHolder(viewClient);
    }

    @Override
    public void onBindViewHolder(ClientViewHolder holder, int position)
    {
        holder.textViewPrenom.setText(listeClients.get(position).getPrenom());
        holder.textViewNom.setText(listeClients.get(position).getNom());
        holder.textViewEmail.setText(listeClients.get(position).getEmail());
        holder.textViewTel.setText(listeClients.get(position).getTelephone());
    }

    @Override
    public int getItemCount()
    {
        return listeClients.size();
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
