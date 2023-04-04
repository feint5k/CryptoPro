package com.example.crypto.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.crypto.CoinViewModel
import com.example.crypto.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.item_coin_info.*
import kotlinx.android.synthetic.main.item_coin_info.tvPrice
import kotlinx.android.synthetic.main.fragment_detail.ivLogoCoin

class DetailFragment : Fragment() {
    private var viewModel: CoinViewModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceSta