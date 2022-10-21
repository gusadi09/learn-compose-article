package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DetailArticleScreen()
                }
            }
        }
    }
}

@Composable
fun DetailArticleScreen() {
    Column {
        HeaderImage()

        ArticleText()
    }
}

@Composable
fun HeaderImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = image,
            contentDescription = "Header Image"
        )
    }
}

@Composable
fun ArticleText() {
    Column {
        Text(
            text = stringResource(R.string.article_title),
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        
        Text(
            text = stringResource(R.string.first_paragraph_article),
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify

        )
        
        Text(
            text = stringResource(R.string.second_paragraph_article),
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DefaultPreview() {
    ComposeArticleTheme {
        DetailArticleScreen()
    }
}