package com.rajkumar.spoton.screens

import android.content.Intent
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rajkumar.spoton.DatailsActivity
import com.rajkumar.spoton.ProfileActivity

import com.rajkumar.spoton.R
import com.rajkumar.spoton.components.AppToolbar
import com.rajkumar.spoton.components.NavigationDrawerBody
import com.rajkumar.spoton.components.NavigationDrawerHeader

import com.rajkumar.spoton.data.home.HomeViewModel
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    homeViewModel.getUserData()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppToolbar(toolbarTitle = stringResource(id = R.string.home),
                logoutButtonClicked = {
                    homeViewModel.logout()
                },
                navigationIconClicked = {
                    coroutineScope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
            NavigationDrawerHeader(homeViewModel.emailId.value)
            NavigationDrawerBody(navigationDrawerItems = homeViewModel.navigationItemsList,
                onNavigationItemClicked = {
                    Log.d("ComingHere","inside_NavigationItemClicked")
                    Log.d("ComingHere","${it.itemId} ${it.title}")
                })
        }

    ) { paddingValues ->
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(paddingValues)
        ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                       .fillMaxHeight()
                        .background(color = Color.White)
                ) {
                    Column(modifier = Modifier.fillMaxSize()
                        ) {

                        val localContext = LocalContext.current
                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, DatailsActivity::class.java)
                                    )
                                }
                                .background(color = Color(R.color.colorWhite)),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {

                            Text(
                                text = " Profile Section ",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        localContext.startActivity(Intent(localContext,ProfileActivity::class.java))
                                    }
                                    .heightIn(),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Normal
                                ), color = colorResource(id = R.color.black),
                                textAlign = TextAlign.Center)


                            picImage()
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Royal Pendant Light",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Normal
                                ), color = colorResource(id = R.color.black),
                                   textAlign = TextAlign.Center)

                            Spacer(modifier = Modifier.height(8.dp))
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, DatailsActivity::class.java)
                                    )
                                }
                                .background(color = Color(R.color.colorWhite)),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            picImage1()
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Pendant set Lamp",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Normal
                                ), color = colorResource(id = R.color.black),
                                textAlign = TextAlign.Center)

                            Spacer(modifier = Modifier.height(8.dp))
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Column(
                            modifier = Modifier
                                .padding(10.dp)
                                .clickable {
                                    localContext.startActivity(
                                        Intent(localContext, DatailsActivity::class.java)
                                    )
                                }
                                .background(color = Color(R.color.colorWhite))
                                .clickable {

                                },
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center) {
                            picImage2()
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = " Top set Lamp Light",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(),
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    fontStyle = FontStyle.Normal
                                ), color = colorResource(id = R.color.black),
                                textAlign = TextAlign.Center)

                            Spacer(modifier = Modifier.height(8.dp))

                        }

                }
                    }
        }
    }
}


@Composable
private fun picImage() {
    val localContext = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.spoton_splash),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .padding(5.dp)
            .height(120.dp)
            .fillMaxWidth()
            .clickable {
                localContext.startActivity(
                    Intent(localContext, DatailsActivity::class.java)
                )
            }
            .clip( RoundedCornerShape(10.dp))
    )
}

@Composable
private fun picImage1() {
    val localContext = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.bitmap1),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .padding(5.dp)
            .height(120.dp)
            .fillMaxWidth()
            .clickable {
                localContext.startActivity(
                    Intent(localContext, DatailsActivity::class.java)
                )
            }
            .clip( RoundedCornerShape(10.dp))
    )
}

@Composable
private fun picImage2() {
    val localContext = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.bitmap),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .padding(5.dp)
            .height(120.dp)
            .fillMaxWidth()
            .clickable {
                localContext.startActivity(
                    Intent(localContext, DatailsActivity::class.java)
                )
            }
            .clip( RoundedCornerShape(10.dp))
    )
}


@Composable
private fun picImage3() {
    val localContext = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.spoton_splash),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .padding(5.dp)
            .height(120.dp)
            .fillMaxWidth()
            .clickable {
                localContext.startActivity(
                    Intent(localContext, DatailsActivity::class.java)
                )
            }
            .clip( RoundedCornerShape(10.dp))
    )
}
@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}