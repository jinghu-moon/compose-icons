package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignalCellularOffFill: ImageVector
    get() {
        if (_signalCellularOffFill != null) return _signalCellularOffFill!!
        _signalCellularOffFill = remixIcon(
            name = "SignalCellularOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.207 20.793l-1.414 1.414L19.586 21h-3.586v-3.586l-1-1v4.586h-6v-10.586L1.793 3.207 3.207 1.793 22.207 20.793ZM8 21h-6v-8h6v8ZM22 17.758 16 11.758v-8.758h6v14.758ZM15 10.758 12.242 8h2.758v2.758Z"),
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
        return _signalCellularOffFill!!
    }

private var _signalCellularOffFill: ImageVector? = null
