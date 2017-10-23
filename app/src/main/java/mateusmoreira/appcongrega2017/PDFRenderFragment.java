package mateusmoreira.appcongrega2017;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFRenderFragment extends Fragment {




    public PDFRenderFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_programacao, container, false);

        PDFView pdfView = (PDFView) v.findViewById(R.id.pdfView);

        pdfView.fromAsset("ResumodaProgramacaoCongrega2017modificadaprogeral.pdf").load();

    return v;

    }


}
