package com.f55121046_hajriansah.fragmentlayoutex;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public interface ViewAdapter {
    @Nullable
    CharSequence getPageTitle(int position);

    void AddFragment(Fragment fragment, String Titles);
}
