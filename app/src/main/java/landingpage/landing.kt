package landingpage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import org.w3c.dom.Text

@Composable
fun LandingPage(navController: NavController){
   Column(modifier = Modifier
       .fillMaxSize()
       .padding(20.dp),
       verticalArrangement = Arrangement.Center) {

       Button(
           onClick = {
               navController.navigate("loginPage")
           },
           modifier = Modifier
               .padding(8.dp)
               .fillMaxWidth()
       ) {
           Text(text = "Login")
       }
       Button(
           onClick = {
               navController.navigate("signupPage")
           },
           modifier = Modifier
               .padding(8.dp)
               .fillMaxWidth()
       ) {
           Text(text = "Sign Up")
       }
   }
}


