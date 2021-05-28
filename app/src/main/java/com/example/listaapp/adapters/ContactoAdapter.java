package com.example.listaapp.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listaapp.DetailContactoActivity;
import com.example.listaapp.R;
import com.example.listaapp.entities.Contacto;

import java.util.List;

public class ContactoAdapter extends RecyclerView.Adapter<ContactoAdapter.ContactoViewHolder> {

    //funcionalidad que recorra la lista

    List<Contacto> contactos ;

    public ContactoAdapter(List<Contacto> contactos) {
        this.contactos = contactos;
    }


    @Override
    public ContactoViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

         //creamos una mini vista con el item_contacto_adapter

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacto_adapter, parent, false);


        return new ContactoViewHolder(view);

    }




    //setear lo que se tiene en lista activity
    @Override
    public void onBindViewHolder( ContactoAdapter.ContactoViewHolder holder, int position) {

        View view = holder.itemView;

        Contacto contacto = contactos.get(position); //obtiene los elementos de la lista

        TextView textViewNombre = view.findViewById(R.id.tvNombre);// id declaro en item_contacto _adapter android:id="@+id/tvNombre"
        TextView textViewNumero = view.findViewById(R.id.tvNumero);
        ImageView imageViewImagen = view.findViewById(R.id.imgKira);//imgen Kira


        textViewNombre.setText(contacto.Nombre);//seteas valores
        textViewNumero.setText(contacto.Numero);

        imageViewImagen.setImageResource(R.drawable.kira_death);// setea iumagenes


        //
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( view.getContext(), DetailContactoActivity.class);// pasa datos de una actividad otra

                //seteamos los atributos de cada clase
                intent.putExtra("nombre", contacto.Nombre);
                intent.putExtra("numero", contacto.Numero);
                intent.putExtra("direccion", contacto.Direccion);
                intent.putExtra("email", contacto.Email);

                view.getContext().startActivity(intent);//empieza la actividad con el intent

            }
        });




    }

    @Override
    public int getItemCount() {
        return contactos.size(); //cantidad cuenta
    }

    public class ContactoViewHolder extends RecyclerView.ViewHolder{

        public ContactoViewHolder( View itemView ) {
            super(itemView);
        }
    }

}
