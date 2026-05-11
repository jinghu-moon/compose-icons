package composeicons.demo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HsvColorPicker(
    currentColor: Color,
    onColorChanged: (Color) -> Unit,
    modifier: Modifier = Modifier,
) {
    // Decompose current color to HSV
    val initHsv = remember(currentColor) {
        val hsv = FloatArray(3)
        android.graphics.Color.colorToHSV(
            android.graphics.Color.argb(
                (currentColor.alpha * 255).toInt(),
                (currentColor.red * 255).toInt(),
                (currentColor.green * 255).toInt(),
                (currentColor.blue * 255).toInt(),
            ), hsv
        )
        hsv
    }

    var hue by remember { mutableFloatStateOf(initHsv[0]) }
    var saturation by remember { mutableFloatStateOf(initHsv[1]) }
    var value by remember { mutableFloatStateOf(initHsv[2]) }
    var hexInput by remember(currentColor) {
        mutableStateOf(colorToHex(currentColor))
    }

    fun emitColor() {
        val c = Color.hsv(hue, saturation, value)
        hexInput = colorToHex(c)
        onColorChanged(c)
    }

    Column(modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        // SV panel
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .clip(RoundedCornerShape(8.dp))
                .pointerInput(hue) {
                    detectTapGestures { offset ->
                        saturation = (offset.x / size.width).coerceIn(0f, 1f)
                        value = 1f - (offset.y / size.height).coerceIn(0f, 1f)
                        emitColor()
                    }
                }
                .pointerInput(hue) {
                    detectDragGestures { change, _ ->
                        change.consume()
                        saturation = (change.position.x / size.width).coerceIn(0f, 1f)
                        value = 1f - (change.position.y / size.height).coerceIn(0f, 1f)
                        emitColor()
                    }
                },
        ) {
            Canvas(modifier = Modifier.matchParentSize()) {
                // White to hue-color horizontal gradient
                val hueColor = Color.hsv(hue, 1f, 1f)
                drawRect(Brush.horizontalGradient(listOf(Color.White, hueColor)))
                // Transparent to black vertical gradient
                drawRect(Brush.verticalGradient(listOf(Color.Transparent, Color.Black)))
                // Selector circle
                val cx = saturation * size.width
                val cy = (1f - value) * size.height
                drawCircle(Color.White, radius = 8.dp.toPx(), center = Offset(cx, cy), style = Stroke(2.dp.toPx()))
                drawCircle(Color.Black, radius = 7.dp.toPx(), center = Offset(cx, cy), style = Stroke(1.dp.toPx()))
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Hue slider
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(24.dp)
                .clip(RoundedCornerShape(12.dp))
                .pointerInput(Unit) {
                    detectTapGestures { offset ->
                        hue = (offset.x / size.width).coerceIn(0f, 1f) * 360f
                        emitColor()
                    }
                }
                .pointerInput(Unit) {
                    detectDragGestures { change, _ ->
                        change.consume()
                        hue = (change.position.x / size.width).coerceIn(0f, 1f) * 360f
                        emitColor()
                    }
                },
        ) {
            Canvas(modifier = Modifier.matchParentSize()) {
                val hueColors = (0..360 step 30).map { Color.hsv(it.toFloat(), 1f, 1f) }
                drawRect(Brush.horizontalGradient(hueColors))
                // Hue indicator
                val hx = (hue / 360f) * size.width
                drawCircle(Color.White, radius = 10.dp.toPx(), center = Offset(hx, size.height / 2), style = Stroke(2.5.dp.toPx()))
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Preview + Hex input
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            // Color preview
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(Color.hsv(hue, saturation, value))
                    .border(1.dp, Color.Gray, CircleShape),
            )

            // Hex input
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(36.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0x1A808080))
                    .padding(horizontal = 12.dp),
                contentAlignment = Alignment.CenterStart,
            ) {
                BasicTextField(
                    value = hexInput,
                    onValueChange = { input ->
                        hexInput = input
                        parseHex(input)?.let { c ->
                            val hsv = FloatArray(3)
                            android.graphics.Color.colorToHSV(
                                android.graphics.Color.argb(255, (c.red * 255).toInt(), (c.green * 255).toInt(), (c.blue * 255).toInt()), hsv
                            )
                            hue = hsv[0]; saturation = hsv[1]; value = hsv[2]
                            onColorChanged(c)
                        }
                    },
                    singleLine = true,
                    textStyle = TextStyle(fontSize = 14.sp, color = Color(0xFFBDBDBD), textAlign = TextAlign.Start),
                    cursorBrush = SolidColor(Color(0xFFBDBDBD)),
                )
            }
        }
    }
}

private fun colorToHex(color: Color): String {
    val r = (color.red * 255).toInt()
    val g = (color.green * 255).toInt()
    val b = (color.blue * 255).toInt()
    return "#%02X%02X%02X".format(r, g, b)
}

private fun parseHex(hex: String): Color? {
    val clean = hex.removePrefix("#")
    if (clean.length != 6) return null
    return try {
        val value = clean.toLong(16)
        Color(0xFF000000 or value)
    } catch (_: NumberFormatException) {
        null
    }
}
