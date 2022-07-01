package com.example.api;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.api.client.RetrofitClient;
import com.example.api.databinding.ActivityMainBinding;
import com.example.api.entity.Message;
import com.example.api.service.RetrofitApiService;

import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button mButton;
    private ActivityMainBinding binding;
    private RetrofitApiService apiService;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initView();
        initValues();
        //getMessage(44);
        //getMessages(2);
        //getUser(9);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randoms = new Random();
                getMessages(randoms.nextInt(100));
            }
        });
    }
    private void initView(){
        mTextView = binding.messageTextView;
    }
    private void initValues(){
        apiService = RetrofitClient.getApiService();
        mButton=findViewById(R.id.messageButtonView);
    }
    private void getMessage(int id){
        apiService.getMessageId(id).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                Message message = response.body();
                mTextView.setText(message.toString());
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                mTextView.setText(t.getMessage());

            }
        });
    }

    private void getMessages(int id){
        apiService.getMessagesUserId(id).enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                List<Message> messages = response.body();
                mTextView.setText("ojetos recuperados:"+messages.size() + "\n\n" +  messages.get(messages.size()-1).toString());
            }

            @Override
            public void onFailure(Call<List<Message>> call, Throwable t) {
                mTextView.setText(t.toString());
            }
        });
    }
}