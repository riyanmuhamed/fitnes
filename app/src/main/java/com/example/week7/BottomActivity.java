package com.example.week7;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.cardview.widget.CardView;

public class BottomActivity extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_bottom, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Get CardViews directly using their IDs
        CardView logFoodCard = (CardView) view.findViewById(R.id.ic_food).getParent().getParent(); // Assuming the CardView is nested
        CardView trackSleepCard = (CardView) view.findViewById(R.id.ic_sleep).getParent().getParent();
        CardView trackWeightCard = (CardView) view.findViewById(R.id.ic_weight).getParent().getParent();
        Button closeButton = view.findViewById(R.id.close_button);

        // Set click listeners for each CardView
        logFoodCard.setOnClickListener(v -> {
            // Handle logging food action
            Toast.makeText(getContext(), "Log Food Clicked", Toast.LENGTH_SHORT).show();
            dismiss();  // Close the bottom sheet
        });

        trackSleepCard.setOnClickListener(v -> {
            // Handle tracking sleep action
            Toast.makeText(getContext(), "Track Sleep Clicked", Toast.LENGTH_SHORT).show();
            dismiss();  // Close the bottom sheet
        });

        trackWeightCard.setOnClickListener(v -> {
            // Handle tracking weight action
            Toast.makeText(getContext(), "Track Weight Clicked", Toast.LENGTH_SHORT).show();
            dismiss();  // Close the bottom sheet
        });

        // Set click listener for the close button
        closeButton.setOnClickListener(v -> dismiss());
    }

    public static void show(FragmentManager fragmentManager) {
        BottomActivity fragment = new  BottomActivity ();
        fragment.show(fragmentManager, fragment.getTag());
    }
}
