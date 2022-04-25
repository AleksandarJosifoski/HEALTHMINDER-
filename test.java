package com.waheed.healthminder.resetpassword.view;
import com.waheed.healthminder.R;
import com.waheed.healthminder.UIHelper;
import android.app.MediaRouteButton;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.navigation.Navigation;
import junit.framework.TestCase;

public class ForgotPasswordFragmentTest extends TestCase {
    public View testOnCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forgot_password, container, false);
    }
    public void testOnViewCreated() {
        View view = null;
        Toast.makeText(view.getContext(), R.string.reset_link_sent, Toast.LENGTH_LONG).show();
    }
    public void testLinkSentSuccessfully() {
        View view = null;
        Toast.makeText(view.getContext(), R.string.reset_link_sent, Toast.LENGTH_LONG).show();
    }
    public void testNavigateToLoginScreen() {
        View view = null;
        Navigation.findNavController(view).navigate(R.id.action_forgotPasswordFragment_to_loginFragment);
    }
    public void testOnError() {
        View view = null;
        UIHelper.showAlert(view.getContext(), R.string.error, String.valueOf((Object) null), R.drawable.error_icon);
    }
    public void testHideProgressbar() {
        MediaRouteButton progressBar = null;
        progressBar.setVisibility(View.GONE);
    }
}