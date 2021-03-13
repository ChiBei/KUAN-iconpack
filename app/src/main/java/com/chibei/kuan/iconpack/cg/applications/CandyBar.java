package com.chibei.kuan.iconpack.cg.applications;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {
    @Override
    public void onCreate() {
        //Sample configuration
        Configuration configuration = new Configuration();

        configuration.setAutomaticIconsCountEnabled(true);
        configuration.setShowTabIconsCount(true);
        configuration.setShowTabAllIcons(false);
//        configuration.setTabAllIconsTitle("All Icons");

        configuration.setShadowEnabled(true);
        configuration.setDashboardThemingEnabled(true);

//        configuration.setWallpaperGridPreviewQuality(4);

        configuration.setCrashReportEnabled(true);
        configuration.setColoredApplyCard(true);

        initApplication(configuration);
    }
}
