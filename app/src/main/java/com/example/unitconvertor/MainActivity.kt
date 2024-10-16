package com.example.unitconvertor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unitconvertor.ui.theme.UnitConvertorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConvertorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                 unitConvertorApp()
                }
            }
        }
    }
}
@Composable
 fun unitConvertorApp(){

     var inputValue by remember{ mutableStateOf("") }
     var outputValue by remember{ mutableStateOf(0) }
     var iExpanded by remember{ mutableStateOf(false) }
     var oExpanded by remember{ mutableStateOf(false) }
     var inputUnit by remember{ mutableStateOf("") }
     var outputUnit by remember{ mutableStateOf("") }
    val conversionFactor = remember { mutableStateOf("Meter to Centimeter")
    }
    fun convertInputs(){
     val inputValueDouble = inputValue.toDoubleOrNull() ?: "Invalid Details"


    }

     Column (modifier = Modifier.fillMaxSize(),
         verticalArrangement = Arrangement.Center,
         horizontalAlignment = Alignment.CenterHorizontally
         ) {
         Text(text = "Unit Convertor" , fontSize = 30.sp,
             fontWeight = FontWeight.Bold)
         Spacer(modifier = Modifier.padding(10.dp))
         OutlinedTextField(value = inputValue , onValueChange = {},
             label = { Text(text = "Enter a Value")})
         Spacer(modifier = Modifier.padding(10.dp))
         
         
         Row {
             Box {
                 Button(onClick = { iExpanded = true } , colors = buttonColors(containerColor = Color.Black ,
                     contentColor = Color.White )) {
                     Text(text = "Select Me")
                     Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "" )
                     DropdownMenu(expanded = iExpanded, onDismissRequest = { iExpanded = false }) {
                         DropdownMenuItem(text = { Text(text = "Centimeter")},
                             onClick = { /*TODO*/ })
                         DropdownMenuItem(text = { Text(text = "Meter")},

                             onClick = { /*TODO*/ })
                         DropdownMenuItem(text = { Text(text = "Millimeter")},

                             onClick = { /*TODO*/ })
                         DropdownMenuItem(text = { Text(text = "Feet")},

                             onClick = { /*TODO*/ })
                     }
                 }
             }
             Spacer(modifier = Modifier.padding(20.dp))
             Box {
                 Button(onClick = { oExpanded = true } , colors = buttonColors(containerColor = Color.Black ,
                     contentColor = Color.White )) {
                     Text(text = "Select Me")
                     Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "" )
                     DropdownMenu(expanded = oExpanded, onDismissRequest = {oExpanded = false }) {
                         DropdownMenuItem(text = { Text(text = "Centimeter")},
                             onClick = { oExpanded = false
                                         inputUnit = "Centimeter"

                             })
                         DropdownMenuItem(text = { Text(text = "Meter")},

                             onClick = { /*TODO*/ })
                         DropdownMenuItem(text = { Text(text = "Millimeter")},

                             onClick = { /*TODO*/ })
                         DropdownMenuItem(text = { Text(text = "Feet")},

                             onClick = { /*TODO*/ })
                     }
                 }
             }
         }
     }
 }











