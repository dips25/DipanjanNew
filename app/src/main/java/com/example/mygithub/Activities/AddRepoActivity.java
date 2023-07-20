package com.example.mygithub.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mygithub.Api.Api;
import com.example.mygithub.Model.MyOwnRepo;
import com.example.mygithub.Model.Repository;
import com.example.mygithub.R;
import com.example.mygithub.RetroFitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddRepoActivity extends AppCompatActivity {

    TextView name;
    EditText reponame;
    EditText repodesc;

    Button add;

    Intent intent;

    String ownername;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_repo);

        intent = getIntent();

        ownername = intent.getStringExtra("ownername");

        name = (TextView) findViewById(R.id.edtusername);
        reponame = (EditText) findViewById(R.id.edtreponame);
        repodesc = (EditText) findViewById(R.id.edtrepodesc);
        back = (ImageView) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        name.setText(ownername);


        add = (Button) findViewById(R.id.addrepo);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fname = "";
                String fdesc = "";

                fname = reponame.getText().toString().trim();
                fdesc = repodesc.getText().toString().trim();


                if (fname.isBlank()) {

                    Toast.makeText(AddRepoActivity.this, "Enter Repository name", Toast.LENGTH_SHORT).show();
                    return;


                } else {




                    RetroFitClient retroFitClient = RetroFitClient.getInstance();

                    Api api = retroFitClient.getApi();

//                Map<String , String> stringMap = new HashMap<>();
//                stringMap.put("Accept" , "*/*");
//                stringMap.put("Authorization" , " Bearer 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");
//                stringMap.put("X-GitHub-Api-Version", "2022-11-28");

                    api.createRepo("Bearer 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"  ,  new Repository(fname, fdesc)).enqueue(new Callback<MyOwnRepo>() {
                        @Override
                        public void onResponse(Call<MyOwnRepo> call, Response<MyOwnRepo> response) {

                            if (response.isSuccessful()) {

                                Toast.makeText(AddRepoActivity.this, "Repository Created.", Toast.LENGTH_SHORT).show();
                            } else {

                                Toast.makeText(AddRepoActivity.this , "Error:" + response.message() , Toast.LENGTH_SHORT).show();
                            }

                        }

                        @Override
                        public void onFailure(Call<MyOwnRepo> call, Throwable t) {

                            Toast.makeText(AddRepoActivity.this, "Error:" + t.getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    });


                }

            }
        });


    }
}