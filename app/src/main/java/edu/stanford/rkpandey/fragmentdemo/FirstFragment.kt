package edu.stanford.rkpandey.fragmentdemo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
private const val TAG = "FirstFragment"
class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate FirstFragment")
    }

}
