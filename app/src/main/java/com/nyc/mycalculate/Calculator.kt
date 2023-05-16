package com.nyc.mycalculate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nyc.mycalculate.ui.theme.Pink

@Composable
fun Calculator(
    state: State,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (UserActions) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)

        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 33.dp),
                fontWeight = FontWeight.Light, fontSize = 80.sp,
                color = Color.White,
                maxLines = 1
            )

            btn.forEach {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    it.forEach { calculatorButton ->
                        Button(
                            symbol = calculatorButton.text,
                            modifier = Modifier
                                .background(Pink)
                                .aspectRatio(calculatorButton.weight)
                                .weight(calculatorButton.weight),
                            onClick = { onAction(calculatorButton.actions) }
                        )
                    }
                }
            }


            ///previous impl
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
//            ) {
//                Button(
//                    symbol = " AC",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(2f)
//                        .weight(2f),
//                    onClick = {
//                        onAction(UserActions.Clean)
//                    }
//                )
//                Button(
//                    symbol = " Del",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Delete)
//                    }
//                )
//                Button(
//                    symbol = " / ",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Operation(AllOperation.Divide))
//                    }
//                )
//            }
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
//            ) {
//                Button(
//                    symbol = "7",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(7))
//                    }
//                )
//                Button(
//                    symbol = "8",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(8))
//                    }
//                )
//                Button(
//                    symbol = "9",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(9))
//                    }
//                )
//                Button(
//                    symbol = "x",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Operation(AllOperation.Multiply))
//                    }
//                )
//            }
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
//            ) {
//                Button(
//                    symbol = "4",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(4))
//                    }
//                )
//                Button(
//                    symbol = "5",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(5))
//                    }
//                )
//                Button(
//                    symbol = "6",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(6))
//                    }
//                )
//                Button(
//                    symbol = "-",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Operation(AllOperation.Subtract))
//                    }
//                )
//            }
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
//            ) {
//                Button(
//                    symbol = "1",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(1))
//                    }
//                )
//                Button(
//                    symbol = "2",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(2))
//                    }
//                )
//                Button(
//                    symbol = "3",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Number(3))
//                    }
//                )
//                Button(
//                    symbol = "+",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Operation(AllOperation.Add))
//                    }
//                )
//            }
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
//            ) {
//                Button(
//                    symbol = "0",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(2f)
//                        .weight(2f),
//                    onClick = {
//                        onAction(UserActions.Number(0))
//                    }
//                )
//                Button(
//                    symbol = ".",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Decimal)
//                    }
//                )
//                Button(
//                    symbol = "=",
//                    modifier = Modifier
//                        .background(Pink)
//                        .aspectRatio(1f)
//                        .weight(1f),
//                    onClick = {
//                        onAction(UserActions.Calculate)
//                    }
//                )
//
//            }
        }
    }
}

//    private val btnNumbers = listOf(
//    Button()
//)
//private val btnOperations = listOf(
//   Button()
//)
//private val btnAction = listOf(
//   Button()
//)
private val btn = listOf(
    listOf(
        Button("AC", 2f, actions = UserActions.Clean),
        Button("Del",actions = UserActions.Delete),
        Button("/", actions = UserActions.Operation(AllOperation.Divide))
    ),
    listOf(
        Button("7",actions = UserActions.Number(7)),
        Button("8",actions = UserActions.Number(8)),
        Button("9",actions = UserActions.Number(9)),
        Button("x",actions = UserActions.Operation(AllOperation.Multiply))),

    listOf(
        Button("4",actions = UserActions.Number(4)),
        Button("5",actions = UserActions.Number(5)),
        Button("6",actions = UserActions.Number(6)),
        Button("-",actions = UserActions.Operation(AllOperation.Subtract))),

    listOf(
        numericButton(1),
        numericButton(2),
        numericButton(3),
        Button("+", actions = UserActions.Operation(AllOperation.Add))
    ),


    listOf(
        Button("0", 2f, actions = UserActions.Number(0)),
        Button(".", actions = UserActions.Decimal),
        Button("=", actions = UserActions.Calculate)
    ),

    )


data class Button(
    val text: String,
    val weight: Float = 1f,
    val actions: UserActions = UserActions.Clean,
)

fun numericButton(number: Int): Button =
    Button(number.toString(), 1f, UserActions.Number(number))