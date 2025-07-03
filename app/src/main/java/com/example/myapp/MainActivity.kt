package com.example.myapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyAppTheme
import kotlin.random.Random
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()

        val fontFamily = FontFamily(
            Font(R.font.bitcountgriddoublevariablefont)
        )

        setContent {

//            Column(
//                modifier = Modifier.background(Color.Green)
//                    .width(300.dp)
//                    .height(300.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceAround) {
//
//                Text("Hello there")
//                Text("Hello there")
//                Text("Hello there")
//            }


            //---------------------------------------------


//            Column (
//                modifier = Modifier.background(Color.Green)
//                    .fillMaxHeight(0.5f)
//                    .fillMaxWidth()
//                    .padding(top = 50.dp, start = 20.dp)
//                    .border(5.dp, Color.Magenta)
//                    .padding(10.dp)
//            ) {
//                Text("Hello", modifier = Modifier.clickable {
//                })
//
//                Spacer(modifier = Modifier.height(50.dp))
//
//                Text("World")
//            }


            //---------------------------------------------


//            val painter = painterResource(id = R.drawable.img)
//            val desc = "Kotlin Programming Language"
//            val title = "Android Programming"
//
//            Box (modifier = Modifier
//                .fillMaxWidth(0.5f)
//                .padding(16.dp)
//            ) {
//                ImageCard (painter = painter,
//                    contentDescription = desc,
//                    title = title
//                )
//            }


            //---------------------------------------------


//            Box (
//                modifier = Modifier
//                    .fillMaxSize()
//                    .background(Color.Black)
//                    .padding(top = 200.dp)
//            ) {
//                Text (
//                    text = buildAnnotatedString {
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Green,
//                                fontSize = 70.sp
//                            )
//                        ) {
//                            append("J")
//                        }
//
//                        append("etpack ")
//
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Green,
//                                fontSize = 70.sp
//                            )
//                        ) {
//                            append("C")
//                        }
//
//                        append("ompose")
//                    },
//
//                    color = Color.White,
//                    fontSize = 50.sp,
//                    fontFamily = fontFamily,
//                    textAlign = TextAlign.Center
//                )
//            }


            //---------------------------------------------


//            Column (Modifier.fillMaxSize()) {
//
//                val color = remember {
//                    mutableStateOf(Color.Yellow)
//                }
//
//                ColorBox(
//                    Modifier.weight(1f).fillMaxSize()
//                ) {
//                    color.value = it
//                }
//
//                Box (modifier = Modifier
//                    .background(color.value)
//                    .weight(1f)
//                    .fillMaxSize()
//                )
//            }


            //---------------------------------------------


//            MyScaffold()


            //---------------------------------------------

            // Lists

//            LazyColumn {
//
//                itemsIndexed(
//                    listOf("This", "is", "Jetpack", "Compose")
//                ) {
//                    index, string ->
//
//                    Text (
//                        text = string,
//                        fontSize = 24.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier.fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//            }


            //---------------------------------------------


//            val constraints = ConstraintSet {
//
//                val greenBox = createRefFor("greenbox")
//                val redBox = createRefFor("redbox")
//                val guideline = createGuidelineFromTop(0.5f)
//
//                constrain(greenBox) {
//                    top.linkTo(guideline)
//                    start.linkTo(parent.start)
//                    width = Dimension.value(100.dp)
//                    height = Dimension.value(100.dp)
//                }
//
//                constrain(redBox) {
//                    top.linkTo(parent.top)
//                    start.linkTo(greenBox.end)
//                    end.linkTo(parent.end)
//                    width = Dimension.value(100.dp)
//                    height = Dimension.value(100.dp)
//                }
//
//                createHorizontalChain(greenBox, redBox, chainStyle = ChainStyle.Packed)
//            }
//
//            ConstraintLayout (constraints, modifier = Modifier.fillMaxSize()) {
//
//                Box (modifier = Modifier
//                    .background(Color.Green)
//                    .layoutId("greenbox")
//                )
//
//                Box (modifier = Modifier
//                    .background(Color.Red)
//                    .layoutId("redbox")
//                )
//            }
        }
    }
}


@Composable
fun ImageCard (
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
    ) {
        Box (modifier = Modifier.height(180.dp)) {

            Image (
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Fit
            )

            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .background(Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    ))
            )

            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),

                contentAlignment = Alignment.BottomStart
            ) {

                Text (
                    title,
                    style = TextStyle(color = Color.White, fontSize = 16.sp)
                )
            }
        }
    }
}


@Composable
fun ColorBox (
    modifier: Modifier = Modifier,
    updateColor: (Color) -> Unit
) {

    Box (modifier = modifier
        .background(Color.Red)
        .clickable {
            updateColor (
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }
    )
}


@Composable
fun MyScaffold () {

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    var textFieldState by remember { mutableStateOf("") }

    ModalNavigationDrawer(

        drawerState = drawerState,

        drawerContent = {
            ModalDrawerSheet {
                Text("Drawer Item 1", modifier = Modifier.padding(16.dp))
                Text("Drawer Item 2", modifier = Modifier.padding(16.dp))
            }
        }
    ) {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            snackbarHost = { SnackbarHost(snackbarHostState) }
        ) {
            paddingValues ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(horizontal = 30.dp)
            ) {
                TextField(
                    value = textFieldState,
                    label = { Text("Enter your name") },
                    onValueChange = { textFieldState = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer (modifier = Modifier.height(16.dp))

                Button (onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar("Hello $textFieldState")
                    }
                }) {
                    Text ("Please greet me")
                }
            }
        }
    }
}



















