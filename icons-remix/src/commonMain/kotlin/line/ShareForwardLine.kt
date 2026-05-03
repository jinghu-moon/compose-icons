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
                pathData = parseSvgPathData("M 13.000 14.000 L 11.000 14.000 C 7.542 14.000 4.540 15.950 3.032 18.811 C 3.011 18.543 3.000 18.273 3.000 18.000 C 3.000 12.477 7.477 8.000 13.000 8.000 L 13.000 2.500 L 23.500 11.000 L 13.000 19.500 L 13.000 14.000 ZM 11.000 12.000 L 15.000 12.000 L 15.000 15.308 L 20.321 11.000 L 15.000 6.692 L 15.000 10.000 L 13.000 10.000 C 10.580 10.000 8.410 11.075 6.943 12.774 C 8.209 12.271 9.580 12.000 11.000 12.000 Z"),
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
