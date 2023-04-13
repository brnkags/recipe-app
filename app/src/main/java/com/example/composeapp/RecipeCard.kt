package com.example.composeapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.composeapp.model.Recipe
import androidx.compose.material.Text
import androidx.compose.material.Image
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier){
    Surface(
        shape = RoundedCornerShape(8.dp),
        elevation = 12.dp,
        modifier = modifier
    ) {
        val image = painterResource(id = recipe.imageResource)
        // Class to call image and text
        Column(modifier= Modifier.fillMaxWidth()) {
            // Image and text
            Image(
                painter = image,
                contentDescription = "a delicious cake",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp),
                contentScale = ContentScale.Crop
            )
            Text(recipe.title, modifier = Modifier.padding(5.dp))
            // Tag for ingredients
            Text(text = "INGREDIENTS....", modifier = Modifier.padding(5.dp))
            // Looping ingredients to show ingredients
            for (ingredient in recipe.ingredients){
                Text("-$ingredient", modifier = Modifier.padding(5.dp))
            }
        }
    }
}

// Dummy
@Composable
@Preview
fun DefaultRecipeCard(){
    RecipeCard(defaultrecipes[3], modifier = Modifier.padding(16.dp))
}
