package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Exit: ImageVector
    get() {
        if (_exit != null) return _exit!!
        _exit = radixIcon(
            name = "Exit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.5 1c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-7.5v11h7.5c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-7.5c-.552 0-1-.448-1-1v-11c0-.552 .448-1 1-1h7.5ZM11.896 4.896c.171-.171 .435-.193 .629-.064l.078 .064 2.25 2.25 .064 .078c.128 .194 .106 .458-.064 .629l-2.25 2.25c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L13.293 8h-6.793c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h6.793L11.896 5.603l-.064-.078c-.128-.194-.106-.458 .064-.629Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _exit!!
    }

private var _exit: ImageVector? = null
