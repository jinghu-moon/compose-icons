package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpeedUpLine: ImageVector
    get() {
        if (_speedUpLine != null) return _speedUpLine!!
        _speedUpLine = remixIcon(
            name = "SpeedUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 13c0 2.209-.895 4.209-2.343 5.657l1.414 1.414C20.881 18.261 22 15.761 22 13 22 7.477 17.523 3 12 3 6.477 3 2 7.477 2 13c0 2.761 1.119 5.261 2.929 7.071L6.343 18.657C4.895 17.209 4 15.209 4 13 4 8.582 7.582 5 12 5c4.418 0 8 3.582 8 8ZM15.293 8.293l-4.5 4.5 1.414 1.414L16.707 9.707 15.293 8.293Z"),
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
        return _speedUpLine!!
    }

private var _speedUpLine: ImageVector? = null
