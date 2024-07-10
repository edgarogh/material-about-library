package com.danielstone.materialaboutlibrarydemo;

import android.content.Context;
import androidx.annotation.NonNull;
import android.view.MenuItem;

import com.danielstone.materialaboutlibrary.model.MaterialAboutList;

public class ExampleMaterialAboutLicenseActivity extends ExampleMaterialAboutActivity {

    @NonNull @Override
    protected MaterialAboutList getMaterialAboutList(@NonNull final Context c) {
        return Demo.createMaterialAboutLicenseList(c);
    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString(com.danielstone.materialaboutlibrary.R.string.mal_title_licenses);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return false;
        }
    }
}
