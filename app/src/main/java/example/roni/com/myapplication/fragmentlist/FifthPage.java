package example.roni.com.myapplication.fragmentlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import example.roni.com.myapplication.BlankActivity;
import example.roni.com.myapplication.R;

public class FifthPage extends Fragment {
    ListView listView;
    String[] values = new String[] { "Android List View",
            "Adapter implementation",
            "Simple List View In Android",
            "Create List View Android",
            "Android Example",
            "List View Source Code",
            "List View Array Adapter",
            "Android Example List View"
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_5th_page, container, false);
        listView = view.findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                R.layout.list_row, R.id.textrow, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(getActivity(), BlankActivity.class);

                getContext().startActivity(myIntent);
            }
        });

        return view;
    }
}
