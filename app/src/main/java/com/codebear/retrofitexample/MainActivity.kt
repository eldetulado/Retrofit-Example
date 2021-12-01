package com.codebear.retrofitexample

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val service = ApiClient.service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnLoadData).setOnClickListener {
            val call = service.getData()

            call.enqueue(object : Callback<ResponseModel> {
                override fun onResponse(
                    call: Call<ResponseModel>,
                    response: Response<ResponseModel>
                ) {
                    Log.e("TAG", "onResponse: ${response.body()}")
                    Log.e("TAG", "onResponse: ${response.body()?.Fecha}")
                }

                override fun onFailure(call: Call<ResponseModel>, t: Throwable) {
                    Log.e("TAG", "onFailure: $t")
                }

            })
        }
    }
}