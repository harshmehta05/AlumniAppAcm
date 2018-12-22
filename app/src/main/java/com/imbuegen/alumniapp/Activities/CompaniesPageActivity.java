package com.imbuegen.alumniapp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.imbuegen.alumniapp.R;

import java.util.List;

public class CompaniesPageActivity extends AppCompatActivity{
    List<String> companies;
    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.companies);

        init();
        instantiateCompaniesList();
    }
    @Override
    protected void onResume() {
        super.onResume();

        loadData();
        setListeners();
    }

    private void init(){
        //initialisation of views
    }
    private void setListeners() {
        //listeners if any!
    }
    private void loadData() {
        //load using firebase in the "companies" list above
    }
    private void instantiateCompaniesList() {
        //Adapter stting and all...
    }
}
