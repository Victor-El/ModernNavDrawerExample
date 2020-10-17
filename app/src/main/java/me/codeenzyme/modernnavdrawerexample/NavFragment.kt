package me.codeenzyme.modernnavdrawerexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class NavFragment : Fragment() {

    companion object {
        private const val FRAGMENT_KEY = "frag-key"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nav, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString(FRAGMENT_KEY)

        view.findViewById<TextView>(R.id.frag_tv).text = text ?: "Default View"
    }
}