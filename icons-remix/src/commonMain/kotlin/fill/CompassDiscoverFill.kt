package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CompassDiscoverFill: ImageVector
    get() {
        if (_compassDiscoverFill != null) return _compassDiscoverFill!!
        _compassDiscoverFill = remixIcon(
            name = "CompassDiscoverFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 22.000 C 7.477 22.000 3.000 17.523 3.000 12.000 C 3.000 6.477 7.477 2.000 13.000 2.000 C 18.523 2.000 23.000 6.477 23.000 12.000 C 23.000 17.523 18.523 22.000 13.000 22.000 ZM 8.000 11.500 L 12.000 13.000 L 13.500 17.002 L 17.000 8.000 L 8.000 11.500 Z"),
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
        return _compassDiscoverFill!!
    }

private var _compassDiscoverFill: ImageVector? = null
