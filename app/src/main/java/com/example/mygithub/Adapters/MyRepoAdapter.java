package com.example.mygithub.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mygithub.Activities.RepoWebViewActivity;
import com.example.mygithub.Model.MyOwnRepo;
import com.example.mygithub.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyRepoAdapter extends RecyclerView.Adapter<MyRepoAdapter.ViewHolder> {

    List<MyOwnRepo> myOwnRepoList = new ArrayList<>();
    Context context;
    LayoutInflater inflater;

    public MyRepoAdapter(Context context , List<MyOwnRepo> myOwnRepoList) {

        this.context = context;
        this.myOwnRepoList = myOwnRepoList;
        this.inflater = LayoutInflater.from(context);


    }
    @NonNull
    @Override
    public MyRepoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.single_item_repo , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRepoAdapter.ViewHolder holder, int position) {

        final MyOwnRepo myOwnRepo = myOwnRepoList.get(position);



        holder.repoName.setText(myOwnRepo.getName());

        holder.desc.setText(myOwnRepo.getDescription());

        //Log.d(MyRepoAdapter.class.getName(), "onBindViewHolder: " + myOwnRepo.getLicense().getKey());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(context , RepoWebViewActivity.class);
                intent1.putExtra("url" , myOwnRepo.getHtmlUrl());
                context.startActivity(intent1);
            }
        });

        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(context, v);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.show();

                MenuItem menuItem = popupMenu.getMenu().getItem(0);

                menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(@NonNull MenuItem item) {

                        Intent intent1 = new Intent(Intent.ACTION_SEND);
                        intent1.putExtra(Intent.EXTRA_TITLE, myOwnRepo.getName());
                        intent1.putExtra(Intent.EXTRA_TEXT, myOwnRepo.getHtmlUrl());
                        intent1.setType("text/plain");

                        context.startActivity(Intent.createChooser(intent1, "Share"));

                        return true;


                    }
                });
            }
        });
    }

    @Override
    public int getItemCount() {
        return myOwnRepoList.size();
    }

    public void setData(List<MyOwnRepo> myOwnRepoList) {

        this.myOwnRepoList.clear();
        this.myOwnRepoList.addAll(myOwnRepoList);
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return myOwnRepoList.get(position).getId();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView repoName;

        ImageView icon;

        TextView desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            repoName = (TextView) itemView.findViewById(R.id.repo_name);
            desc = (TextView) itemView.findViewById(R.id.repo_desc);
            icon = (ImageView) itemView.findViewById(R.id.icon);
        }
    }
}
