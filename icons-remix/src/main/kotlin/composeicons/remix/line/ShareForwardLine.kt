package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShareForwardLine: ImageVector
    get() {
        if (_shareForwardLine != null) return _shareForwardLine!!
        _shareForwardLine = remixIcon(
            name = "ShareForwardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13 14h-2C7.542 14 4.54 15.95 3.032 18.811 3.011 18.543 3 18.273 3 18 3 12.477 7.477 8 13 8v-5.5L23.5 11 13 19.5v-5.5ZM11 12h4v3.308L20.321 11 15 6.692v3.308h-2c-2.42 0-4.59 1.075-6.057 2.774C8.209 12.271 9.58 12 11 12Z"),
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
        return _shareForwardLine!!
    }

private var _shareForwardLine: ImageVector? = null
