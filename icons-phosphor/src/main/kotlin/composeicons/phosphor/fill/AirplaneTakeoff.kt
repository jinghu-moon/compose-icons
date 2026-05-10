package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTakeoff: ImageVector
    get() {
        if (_airplaneTakeoff != null) return _airplaneTakeoff!!
        _airplaneTakeoff = phosphorFillIcon(
            name = "AirplaneTakeoff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 216c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8ZM246.31 86.76 227.67 62.87l-.12-.15C215.09 47.373 193.257 43.49 176.27 53.6L124.7 84.38 70.76 64.54c-1.803-.672-3.787-.672-5.59 0L58 67.27l-.32 .13c-4.984 2.139-8.545 6.658-9.46 12.004-.915 5.346 .941 10.791 4.93 14.466L75 115.06 54.83 127.26 26.57 117.72c-2-.674-4.185-.53-6.08 .4l-3 1.47c-4.874 2.178-8.341 6.644-9.243 11.906-.901 5.262 .881 10.627 4.753 14.304l36 35.27 .12 .12c7.374 6.97 17.133 10.858 27.28 10.87 7.123-.012 14.115-1.917 20.26-5.52L244.07 98.54c1.968-1.176 3.336-3.139 3.759-5.392 .423-2.253-.141-4.579-1.549-6.388Z"),
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
        return _airplaneTakeoff!!
    }

private var _airplaneTakeoff: ImageVector? = null
