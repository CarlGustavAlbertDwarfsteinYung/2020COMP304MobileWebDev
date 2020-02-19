package com.example.assignment3async;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

public class AsyncT extends AsyncTask<Void, Void, Void> {
    private Context context;
    private String json;

    public AsyncT(Context context, String json){
        this.context=context;
        this.json=json;
    }

    @Override
    protected Void doInBackground(Void... urls) {
        long count = 1000;
        int i;

        for (i = 0; i < count; i++) {
        }

        Log.d("json.GET", json);
        return null;
    }

    @Override
    protected void onPreExecute() {
        // write show progress Dialog code here
        super.onPreExecute();
    }


    @Override
    protected void onPostExecute(Void aVoid) {
        // created an intent object
        Intent i = new Intent(context, ResultActivity.class);

        i.putExtra("GET", json);

        // start AsyncTask
        context.startActivity(i);
    }
}