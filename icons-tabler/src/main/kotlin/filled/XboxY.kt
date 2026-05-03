package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.XboxY: ImageVector
    get() {
        if (_xboxY != null) return _xboxY!!
        _xboxY = tablerFilledIcon(
            name = "XboxY",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 15.600 7.200 C 15.158 6.869 14.531 6.958 14.200 7.400 L 12.000 10.333 L 9.800 7.400 C 9.469 6.958 8.842 6.869 8.400 7.200 C 7.958 7.531 7.869 8.158 8.200 8.600 L 11.010 12.348 L 11.000 15.997 C 10.999 16.262 11.104 16.517 11.291 16.705 C 11.478 16.893 11.732 16.999 11.997 17.000 L 12.114 16.994 C 12.618 16.936 12.999 16.510 13.000 16.003 L 13.010 12.320 L 15.800 8.600 C 16.131 8.158 16.042 7.531 15.600 7.200"),
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
        return _xboxY!!
    }

private var _xboxY: ImageVector? = null
