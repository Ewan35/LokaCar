package com.example.Valewan.lokacar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ClientViewHolder extends RecyclerView.ViewHolder {

    // Vues client:
    public TextView textViewPrenom = null;
    public TextView textViewNom = null;
    public TextView textViewEmail = null;
    public TextView textViewTel = null;



    /**
     * Constructeur.
     *
     */
    public ClientViewHolder(View itemView)
    {
        super(itemView);
        textViewPrenom = itemView.findViewById(R.id.client_prenom);
        textViewNom = itemView.findViewById(R.id.client_nom);
        textViewEmail = itemView.findViewById(R.id.client_email);
        textViewTel = itemView.findViewById(R.id.client_tel);
    }


}
