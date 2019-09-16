package com.admin.apptitude;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CandidateAdapter extends RecyclerView.Adapter<CandidateAdapter.ViewHolder> {
    List<Model> models;
    Context context;

    public CandidateAdapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View v=layoutInflater.inflate(R.layout.candidate_recycle,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CandidateAdapter.ViewHolder holder, int i) {
        holder.name.setText(models.get(i).name);
        holder.id.setText(models.get(i).id);
        holder.mobile.setText(models.get(i).mobile);
        holder.email.setText(models.get(i).email);
        holder.pass.setText(models.get(i).password);
       /* holder.close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert=new AlertDialog.Builder(context);
                alert.setTitle("Confirmation");
                alert.setMessage("Are you sure you want");
                alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "It will delete Data ", Toast.LENGTH_SHORT).show();
                    }
                });

                alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog dialog=alert.create();
                dialog.show();

            }
        });*/

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name,id,email,mobile,pass;
        ImageView close;
        Context context;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.name=itemView.findViewById(R.id.cl_name);
            this.id=itemView.findViewById(R.id.clId);
            this.email=itemView.findViewById(R.id.clmail);
            this.mobile=itemView.findViewById(R.id.clmobile);
            this.pass=itemView.findViewById(R.id.clpassword);
            this.close=itemView.findViewById(R.id.cl_delete);
        }
    }
}
