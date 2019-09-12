package com.example.jocelynjoubert2017.lokacar;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class LocationViewHolder extends RecyclerView.ViewHolder {

    // Vues locations :
    public TextView textViewTitreDateDepart = null;
    public TextView textViewDateDepart = null;
    public TextView textViewTitreDateRetourPrevu = null;
    public TextView textViewDateRetourPrevu = null;
    public TextView textViewTitreImmat = null;
    public TextView textViewImmat = null;
    public TextView textViewPrenomClient = null;
    public TextView textViewNomClient = null;



    /**
     * Constructeur.
     *
     */
    public LocationViewHolder(View itemView)
    {
        super(itemView);
        textViewTitreDateDepart = itemView.findViewById(R.id.location_titre_date_depart);
        textViewDateDepart = itemView.findViewById(R.id.location_date_depart);
        textViewTitreDateRetourPrevu = itemView.findViewById(R.id.location_titre_date_retour_prevu);
        textViewDateRetourPrevu = itemView.findViewById(R.id.location_date_retour_prevu);
        textViewTitreImmat = itemView.findViewById(R.id.location_titre_immat);
        textViewImmat = itemView.findViewById(R.id.location_immat);
        textViewPrenomClient = itemView.findViewById(R.id.client_prenom);
        textViewNomClient = itemView.findViewById(R.id.client_nom);

    }


}
