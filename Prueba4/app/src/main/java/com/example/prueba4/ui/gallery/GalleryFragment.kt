package com.example.prueba4.ui.gallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.prueba4.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class GalleryFragment : Fragment(), OnMapReadyCallback {


    private lateinit var mMap: GoogleMap


    override fun onCreateView(

        inflater: LayoutInflater,

        container: ViewGroup?,

        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_gallery, container, false)


        val mapFragment = childFragmentManager.findFragmentById(R.id.google_map) as SupportMapFragment

        mapFragment.getMapAsync(this)


        return view

    }


    override fun onMapReady(googleMap: GoogleMap) {

        mMap = googleMap


        val sydney = LatLng(-34.0, 151.0)

        mMap.addMarker(MarkerOptions().position(sydney).title("Marker in Sydney"))

        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))

    }

}