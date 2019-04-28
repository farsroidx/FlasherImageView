# FlasherImageView

[![](https://jitpack.io/v/farsroidx/FlasherImageView.svg)](https://jitpack.io/#farsroidx/FlasherImageView)

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

    allprojects {
	     repositories {
		     ...
		     maven { url 'https://jitpack.io' }
	     }
    }

# Step 2. Add the dependency

    dependencies {
        implementation 'com.github.farsroidx:FlasherImageView:1.1.0'
    }


# How to use:

in xml:

    <ir.farsroidx.FlasherImageView
        android:id="@+id/fiv"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_margin="10dp"
        android:src="@drawable/icon_alarm_black"
        app:fimDefaultColor="#222222"
        app:fimFirstColor="#F44336"
        app:fimSecondColor="#4CAF50"
        app:fimStartAutoChange="false"
        app:fimTimeChangeColor="400" />

in java:

        FlasherImageView flasherImageView = findViewById(R.id.fiv);
        flasherImageView.autoChange(true);
        flasherImageView.setDefaultColor(R.color.colorAccent);
        flasherImageView.setFirstColor(R.color.colorPrimary);
        flasherImageView.setSecondColor(R.color.colorPrimaryDark);
        flasherImageView.start();
        flasherImageView.stop();
