package com.zodiaku.views;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.zodiaku.R;
import com.zodiaku.models.Zodiak;
import com.zodiaku.rest.ApiClient;
import com.zodiaku.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailZodiakFragment extends DialogFragment {
    private String[] tglZodiak = {"21-03-2016", "20-04-2016","21-05-2016","21-06-2016","23-07-2016","23-08-2016", "23-09-2016", "23-10-2016", "22-11-2016", "22-12-2016", "20-01-2016", "19-02-2016"};
    private TextView txtUmum;
    private TextView txtCinta;
    private TextView txtUang;
    private TextView txtUmumMingguan;
    private TextView txtCintaMingguan;
    private TextView txtUangMingguan;
    private Button btnShare;
    private String umum,cinta1,cinta2,uang;
    private ProgressDialog pDialog;
    public DetailZodiakFragment() {
        // Required empty public constructor
    }

    public static DetailZodiakFragment newInstance(int id_zodiak) {
        DetailZodiakFragment fragment = new DetailZodiakFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("id_zodiak", id_zodiak);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail_zodiak, container, false);
        txtUmum = (TextView)view.findViewById(R.id.txtZodiakUmum);
        txtCinta = (TextView)view.findViewById(R.id.txtZodiakLove);
        txtUang = (TextView)view.findViewById(R.id.txtZodiakKeuangan);
        txtUmumMingguan = (TextView)view.findViewById(R.id.txtZodiakUmumMingguan);
        txtCintaMingguan = (TextView)view.findViewById(R.id.txtZodiakLoveMingguan);
        txtUangMingguan = (TextView)view.findViewById(R.id.txtZodiakKeuanganMingguan);
        btnShare = (Button) view.findViewById(R.id.button);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,
                        "ZodiaKu Hari Ini:\nUmum   : "+umum + " \nUang    : " + uang + " \nPercintaan  :\n " +cinta1 + " \n " );
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent,""));
            }
        });
        getData();
        return view;
    }

    private void getData(){
        ApiClient.getClient().create(ApiInterface.class).getZodiak("App", tglZodiak[this.getArguments().getInt("id_zodiak")]).enqueue(new Callback<Zodiak>() {
            @Override
            public void onResponse(Call<Zodiak> call, Response<Zodiak> response) {
                try {
                    txtUmum.setText(response.body().getRamalan().getHarian().getUmum());
                    txtUang.setText(response.body().getRamalan().getHarian().getKarirKeuangan());
                    txtCinta.setText("Single : " + response.body().getRamalan().getHarian().getPercintaan().getSingle() + "\n\n" + "Couple : " + response.body().getRamalan().getHarian().getPercintaan().getCouple());
                    txtUmumMingguan.setText(response.body().getRamalan().getMingguan().getUmum());
                    txtUangMingguan.setText(response.body().getRamalan().getMingguan().getKarirKeuangan());
                    txtCintaMingguan.setText("Single : " + response.body().getRamalan().getMingguan().getPercintaan().getSingle() + "\n\n" + "Couple : " + response.body().getRamalan().getHarian().getPercintaan().getCouple());

                    umum=txtUmum.getText().toString();
                    uang=txtUang.getText().toString();
                    cinta1=txtCinta.getText().toString();

                }
                catch (Exception e ) {
                    Log.e("",e.toString());
                }
            }

            @Override
            public void onFailure(Call<Zodiak> call, Throwable t) {

            }
        });
    }

}
