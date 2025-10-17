package com.example.mylayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakRowColum2(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        Column {
            Text(text = "KomponenKolom2")
            Text(text = "KomponenKolom2s2")
            Text(text = "KomponenKolom2s3")
        }
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Box 2")
        Text(text = "Column 1")
        Text(text = "Column 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        // Baris1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1")
            Text(text = "Komponen2")
            Text(text = "Komponen3")
            Text(text = "Komponen4")
        }
    }
}

@Composable
fun TataletakColumRow(modifier: Modifier) {
    Column() {
        //Baris1
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "KomponenBaris1")
            Text(text = "KomponenBaris2")
            Text(text = "KomponenBaris3")
        }

        //Baris2
        Row(modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "KomponenBaris1s2")
            Text(text = "KomponenBaris2s2")
            Text(text = "KomponenBaris3s2")
        }
    }
}

@Composable
fun TataletakRowColum(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        //Kolom1
        Column() {
            Text(text = "KomponenKolom1")
            Text(text = "KomponenKolom1s2")
            Text(text = "KomponenKolom1s3")
        }

        //Kolom2
        Column() {
            Text(text = "KomponenKolom2")
            Text(text = "KomponenKolom2s2")
        }
    }
}

fun TataletakRowColum2(modifier: Modifier) {
    Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
        //Kolom2
        Column() {
            Text(text = "KomponenKolom2")
            Text(text = "KomponenKolom2s2")
            Text(text = "KomponenKolom2s3")
        }
    }
}

//usage
@Composable
fun TataletakBoxColumRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.noteshelok)
    Column {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(height = 110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        )

        Column() {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = "Col1.Rowl.Komponen1")
                Text(text = "Col1.Rowl.Komponen2")
                Text(text = "Col1.Rowl.Komponen3")
            }

            Row()
        }
    }
}