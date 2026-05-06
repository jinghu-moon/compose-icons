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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 13c0 2.209 .895 4.209 2.343 5.657L4.929 20.071C3.119 18.261 2 15.761 2 13 2 7.477 6.477 3 12 3c5.523 0 10 4.477 10 10 0 2.761-1.119 5.261-2.929 7.071L17.657 18.657C19.105 17.209 20 15.209 20 13 20 8.582 16.418 5 12 5 7.582 5 4 8.582 4 13ZM8.707 8.293l4.5 4.5-1.414 1.414L7.293 9.707 8.707 8.293Z"),
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
        return _slowDownLine!!
    }

private var _slowDownLine: ImageVector? = null
