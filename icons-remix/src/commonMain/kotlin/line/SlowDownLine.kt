package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SlowDownLine: ImageVector
    get() {
        if (_slowDownLine != null) return _slowDownLine!!
        _slowDownLine = remixIcon(
            name = "SlowDownLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 13.000 C 4.000 15.209 4.895 17.209 6.343 18.657 L 4.929 20.071 C 3.119 18.261 2.000 15.761 2.000 13.000 C 2.000 7.477 6.477 3.000 12.000 3.000 C 17.523 3.000 22.000 7.477 22.000 13.000 C 22.000 15.761 20.881 18.261 19.071 20.071 L 17.657 18.657 C 19.105 17.209 20.000 15.209 20.000 13.000 C 20.000 8.582 16.418 5.000 12.000 5.000 C 7.582 5.000 4.000 8.582 4.000 13.000 ZM 8.707 8.293 L 13.207 12.793 L 11.793 14.207 L 7.293 9.707 L 8.707 8.293 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _slowDownLine!!
    }

private var _slowDownLine: ImageVector? = null
