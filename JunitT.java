package com.ss.healthminder.register.view;
import android.app.Activity;
import android.app.MediaRouteButton;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.healthminder.R;
import com.ss.healthminder.UIHelper;
import junit.framework.TestCase;
import java.security.AccessController;
public class RegisterFragmentTest extends TestCase {

    public View testOnCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    public void testSetProfileImageURI() {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    }

    public void testOnImgUploadError() {
        AccessController view = null;
        UIHelper.showAlert(AccessController.getContext(), R.string.error, null, R.drawable.error_icon);
    }

    public void testHideImgProgressbar() {
        MediaRouteButton progressBarImg = null;
        progressBarImg.setVisibility(View.GONE);
    }

    public void testOnError() {
        AccessController view = null;
        UIHelper.showAlert(view.getContext(), R.string.error, null, R.drawable.error_icon);
    }

    public void testHideProgressbar() {
        MediaRouteButton progressBar = null;
        progressBar.setVisibility(View.GONE);
    }

    public void testTestOnImgUploadError() {
        AccessController jax = null;
        UIHelper.showAlert(AccessController.getContext(), R.string.error, null, R.drawable.error_icon);
    }

    public void testTestHideImgProgressbar() {
        MediaRouteButton progressBar = null;
        progressBar.setVisibility(View.INVISIBLE);
    }

}