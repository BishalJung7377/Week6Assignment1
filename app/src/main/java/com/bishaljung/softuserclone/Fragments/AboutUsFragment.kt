package com.bishaljung.softuserclone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.bishaljung.softuserclone.R

class AboutUsFragment: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_fragment_aboutus,container, false)
//        wvAboutUs=view.findViewById(R.id.wvAboutUs)
//        wvAboutUs.settings.javaScriptEnabled=true
//        val webViewClient = WebViewClient()
//        wvAboutUs.webViewClient=webViewClient
//        wvAboutUs.loadUrl("https://softwarica.edu.np");
        return view
    }
}