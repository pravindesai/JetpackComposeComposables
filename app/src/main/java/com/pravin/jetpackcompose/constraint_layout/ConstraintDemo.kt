package com.pravin.jetpackcompose.constraint_layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension

@Preview
@Composable
fun ConstraintDemo() {
        val greenBoxId = "GREEN_BOX_ID"
        val redBoxId = "RED_BOX_ID"
        val guidelineBoxId = "GUIDELINE_BOX_ID"

    val constraints = ConstraintSet {
        val greenBox = createRefFor(greenBoxId)
        val redBox = createRefFor(redBoxId)

        val guideline = createGuidelineFromTop(0.5f)
        val guildLineBox = createRefFor(guidelineBoxId)


        constrain(greenBox){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            bottom.linkTo(parent.bottom)
            width = Dimension.percent(0.5f)
            height = Dimension.value(100.dp)
        }

        constrain(redBox){
            top.linkTo(parent.top)
            start.linkTo(greenBox.end)
            bottom.linkTo(parent.bottom)
            end.linkTo(parent.end)
            width = Dimension.percent(0.5f)
            height = Dimension.value(100.dp)
        }

        constrain(guildLineBox){
            top.linkTo(guideline)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.percent(0.5f)
            height = Dimension.value(100.dp)
        }

//        createHorizontalChain(redBox, greenBox, chainStyle = ChainStyle.Spread)
    }
    
    ConstraintLayout(constraints, modifier = Modifier.fillMaxSize(), animateChanges = true ) {
            Box(modifier = Modifier.background(Color.Green).layoutId(greenBoxId))
            Box(modifier = Modifier.background(Color.Red).layoutId(redBoxId))
            Box(modifier = Modifier.background(Color.Black).layoutId(guidelineBoxId))
    }
}