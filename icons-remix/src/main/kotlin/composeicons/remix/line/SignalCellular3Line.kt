package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalCellular3Line: ImageVector
    get() {
        if (_signalCellular3Line != null) return _signalCellular3Line!!
        _signalCellular3Line = remixIcon(
            name = "SignalCellular3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 13h6v8h-6v-8ZM16 3h6v18h-6v-18ZM9 8h6v13h-6v-13ZM4 15v4h2v-4h-2ZM11 10v9h2v-9h-2ZM18 5v14h2v-14h-2Z"),
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
        return _signalCellular3Line!!
    }

private var _signalCellular3Line: ImageVector? = null
