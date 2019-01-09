package example.roni.com.myapplication.fragmentlist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import example.roni.com.myapplication.MainActivity;
import example.roni.com.myapplication.R;

public class SecondPage extends Fragment {
    MainActivity mainActivity=new MainActivity();
    EditText editText;
    Button btnGo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_second_page, container, false);

        final String getName;

        editText=view.findViewById(R.id.ed_getName);
        btnGo=view.findViewById(R.id.btn_setName);

     getName= editText.getText().toString();
     btnGo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               SecondPage fragment = new SecondPage(); //  object of next fragment
               Bundle bundle = new Bundle();

              // mainActivity.setFragment(new ThirdPage());
               bundle.putString("name", getName);
               fragment.setArguments(bundle);

               FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.fragment_container,new ThirdPage());
               fragmentTransaction.commit();

           }
       });

        return view;
    }
}
