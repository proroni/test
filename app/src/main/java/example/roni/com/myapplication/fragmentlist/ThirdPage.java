package example.roni.com.myapplication.fragmentlist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import example.roni.com.myapplication.MainActivity;
import example.roni.com.myapplication.R;

public class ThirdPage extends Fragment {
    TextView tx_setName;
    String name ="talhasoft";
MainActivity mainActivity=new MainActivity();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();


        //name = bundle.getString("name", "talhasoft");
    }

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_third_page, container, false);

        tx_setName=view.findViewById(R.id.setName);
        tx_setName.setText(name);
        mainActivity.nexttask(new FourthPage());
        return view;
    }
}
