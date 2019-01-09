package example.roni.com.myapplication.fragmentlist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import example.roni.com.myapplication.MainActivity;
import example.roni.com.myapplication.R;

public class FourthPage extends Fragment {
    Button btn;
    MainActivity mainActivity=new MainActivity();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_fourth_page, container, false);
        btn=view.findViewById(R.id.nextPage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.nexttask(new FifthPage());
            }
        });

        return view;
    }
}
