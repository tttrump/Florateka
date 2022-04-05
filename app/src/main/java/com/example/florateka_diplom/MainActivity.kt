package com.example.florateka_diplom

import android.app.Activity
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeMessage: TextView = findViewById(R.id.textId)
        val buttonId1: TextView = findViewById(R.id.buttonId1)
        val buttonId2: TextView = findViewById(R.id.buttonId2)

        val imgExample: ImageView = findViewById(R.id.imageView)
        imgExample.setImageResource(R.drawable.ic_launcher_foreground);

        buttonId2.setOnClickListener {
             val intent = Intent(this, MainPaig::class.java)
             startActivity(intent)
         }

        buttonId1.setOnClickListener {
            val myDialogFragment = MyDialogFragment()
            val manager = supportFragmentManager
            myDialogFragment.show(manager, "myDialog")
        }
    }
}

class MyDialogFragment : DialogFragment() {

    private val variantsOfRegistration = arrayOf("Пользователь", "Компания")
    private val checkedItems = booleanArrayOf(true, false)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val selectedItems = ArrayList<Int>()
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Выберите тип регистрации")

                .setSingleChoiceItems(
                    variantsOfRegistration, -1
                ) { dialog, item ->
                    Toast.makeText(
                        activity, "Вы выбрали:  ${variantsOfRegistration[item]}",
                        Toast.LENGTH_SHORT
                    ).show()
                    if(variantsOfRegistration[item] == "Пользователь"){
                        val intent = Intent(activity, MainActivity3::class.java)
                        startActivity(intent)
                    }
                    else
                    {
                        val intent = Intent(activity, Activity2::class.java)
                        startActivity(intent)
                    }

                }

                /*.setPositiveButton("Продолжить") { dialog, id ->
                    dialog.cancel()
                }

                .setNegativeButton("Отмена") { dialog, _ ->
                    dialog.cancel()
                }
*/

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}