package com.sk.newlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ListAdapter
import android.widget.ListView
import com.sk.newlist.databinding.ActivityMainBinding
import com.sk.newlist.databinding.LayoutnewBinding

class MainActivity : AppCompatActivity(), ClickInterface {
    lateinit var adapterclass : adapterclass
    lateinit var Binding1:ActivityMainBinding
    var arrayList:ArrayList<listdata> =ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding1=ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding1.root)
        adapterclass = adapterclass(arrayList,this)
        arrayList.add(listdata(1,"qwerty"))
        arrayList.add(listdata(2,"qwerty2"))
        Binding1.list1.adapter = adapterclass

    }

    override fun OnNameClicked(name: String) {
        System.out.println("name $name")
    }
}