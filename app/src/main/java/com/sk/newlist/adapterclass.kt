package com.sk.newlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class adapterclass(var arrayList:ArrayList<listdata>,var clickInterface: ClickInterface): BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
        return 2
    }

    override fun getItemId(p0: Int): Long {
        return 3
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var initView = LayoutInflater.from(p2?.context).inflate(R.layout.layoutnew,p2,false)
        var tv1=initView.findViewById<TextView>(R.id.tv1)
        var tv2=initView.findViewById<TextView>(R.id.tv2)
        tv1.setText(arrayList[p0].id.toString())
        tv2.setText(arrayList[p0].Name)
        tv2.setOnClickListener{
            clickInterface.OnNameClicked(arrayList[p0].Name?:"")
        }
        return initView
    }

}