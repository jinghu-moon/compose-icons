package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Forward10Fill: ImageVector
    get() {
        if (_forward10Fill != null) return _forward10Fill!!
        _forward10Fill = remixIcon(
            name = "Forward10Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 L 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 14.464 4.000 16.668 5.114 18.135 6.865 L 16.138 8.862 C 15.700 8.481 15.127 8.250 14.500 8.250 C 13.119 8.250 12.000 9.369 12.000 10.750 L 12.000 13.250 C 12.000 14.631 13.119 15.750 14.500 15.750 C 15.881 15.750 17.000 14.631 17.000 13.250 L 17.000 10.750 C 17.000 10.069 16.727 9.451 16.285 9.000 L 22.000 9.000 L 22.000 3.000 L 19.553 5.446 C 17.720 3.335 15.016 2.000 12.000 2.000 ZM 15.500 10.750 L 15.500 13.250 C 15.500 13.802 15.052 14.250 14.500 14.250 C 13.948 14.250 13.500 13.802 13.500 13.250 L 13.500 10.750 C 13.500 10.198 13.948 9.750 14.500 9.750 C 15.052 9.750 15.500 10.198 15.500 10.750 ZM 10.000 8.500 L 8.500 8.500 L 8.500 15.500 L 10.000 15.500 L 10.000 8.500 Z"),
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
        return _forward10Fill!!
    }

private var _forward10Fill: ImageVector? = null
