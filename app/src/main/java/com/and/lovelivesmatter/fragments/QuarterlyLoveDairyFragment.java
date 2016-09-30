package com.and.lovelivesmatter.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.and.lovelivesmatter.R;

public class QuarterlyLoveDairyFragment extends Fragment {

    private TextView fromMeAgreedNoTxtView;
    private TextView fromMeDisagreedNoTxtView;
    private TextView pendingNoTxtView;
    private TextView fromPartnerAgreedNoTxtView;
    private TextView fromPartnerDisagreedNoTxtView;

    public QuarterlyLoveDairyFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_love_diary_child,container,false);
        init(view);
        return view;
    }

    private void init(View v) {
        fromMeAgreedNoTxtView = (TextView) v.findViewById(R.id.fromMeAgreedNoTxtView);
        fromMeDisagreedNoTxtView = (TextView) v.findViewById(R.id.fromMeDisagreedNoTxtView);
        pendingNoTxtView = (TextView) v.findViewById(R.id.pendingNoTxtView);
        fromPartnerAgreedNoTxtView = (TextView) v.findViewById(R.id.fromPartnerAgreedNoTxtView);
        fromPartnerDisagreedNoTxtView = (TextView) v.findViewById(R.id.fromPartnerDisagreedNoTxtView);
    }
}
