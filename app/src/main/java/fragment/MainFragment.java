package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ansen.drawerlayoutdemo.R;

/**
 * 首页
 * @author ansen
 * @create time 2016/05/07
 */
public class MainFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_main,null);
        return rootView;
    }
}
