package com.chibei.kuan.iconpack.cg.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dm.material.dashboard.candybar.activities.CandyBarMainActivity;
import com.dm.material.dashboard.candybar.helpers.InAppBillingHelper;
import com.chibei.kuan.iconpack.cg.licenses.License;

public class MainActivity extends CandyBarMainActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        initMainActivity(savedInstanceState,
                new InAppBillingHelper.Property(
                        License.isLicenseCheckerEnabled(),
                        License.getRandomString(),
                        License.getLicenseKey(),
                        License.getDonationProductsId(),
                        License.getPremiumRequestProductsId(),
                        License.getPremiumRequestProductsCount()));
    }
}
