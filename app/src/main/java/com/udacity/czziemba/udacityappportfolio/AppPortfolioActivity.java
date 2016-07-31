package com.udacity.czziemba.udacityappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AppPortfolioActivity extends AppCompatActivity {

    @BindView(R.id.popular_movies_btn) Button popularMoviesBtn;
    @BindView(R.id.stock_hawk_btn) Button stockHawkBtn;
    @BindView(R.id.build_it_bigger_btn) Button buildItBiggerBtn;
    @BindView(R.id.make_your_app_material_btn) Button makeYourAppMaterialBtn;
    @BindView(R.id.go_ubiquitous_btn) Button goUbiquitousBtn;
    @BindView(R.id.capstone_btn) Button capstoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.popular_movies_btn)
    protected void popularMoviesOnClick() {
        toastPlaceholder();
    }

    @OnClick(R.id.stock_hawk_btn)
    protected void stockHawkOnClick() {
        toastPlaceholder();
    }

    @OnClick(R.id.build_it_bigger_btn)
    protected void buildItBiggerOnClick() {
        toastPlaceholder();
    }

    @OnClick(R.id.make_your_app_material_btn)
    protected void makeYourAppMaterialOnClick() {
        toastPlaceholder();
    }

    @OnClick(R.id.go_ubiquitous_btn)
    protected void goUbiquitousOnClick() {
        toastPlaceholder();
    }

    @OnClick(R.id.capstone_btn)
    protected void capstoneOnClick() {
        toastPlaceholder();
    }

    private void toastPlaceholder() {
        Toast.makeText(this, R.string.placeholder_toast, Toast.LENGTH_SHORT).show();
    }

}
