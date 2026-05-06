package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalCellularOffLine: ImageVector
    get() {
        if (_signalCellularOffLine != null) return _signalCellularOffLine!!
        _signalCellularOffLine = remixIcon(
            name = "SignalCellularOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.207 20.793l-1.414 1.414L19.586 21h-3.586v-3.586l-1-1v4.586h-6v-10.586L1.793 3.207 3.207 1.793 22.207 20.793ZM8 21h-6v-8h6v8ZM4 19h2v-4h-2v4ZM11 19h2v-4.586l-2-2v6.586ZM22 17.758 20 15.758v-10.758h-2v8.758l-2-2v-8.758h6v14.758ZM15 10.758 12.242 8h2.758v2.758Z"),
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
        return _signalCellularOffLine!!
    }

private var _signalCellularOffLine: ImageVector? = null
