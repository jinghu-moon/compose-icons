package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Forward15Fill: ImageVector
    get() {
        if (_forward15Fill != null) return _forward15Fill!!
        _forward15Fill = remixIcon(
            name = "Forward15Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 L 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 14.464 4.000 16.668 5.114 18.135 6.865 L 16.500 8.500 L 12.000 8.500 L 12.000 12.750 L 14.875 12.750 C 15.220 12.750 15.500 13.030 15.500 13.375 C 15.500 13.720 15.220 14.000 14.875 14.000 L 12.000 14.000 L 12.000 15.500 L 14.875 15.500 C 16.049 15.500 17.000 14.549 17.000 13.375 C 17.000 12.201 16.049 11.250 14.875 11.250 L 13.500 11.250 L 13.500 10.000 L 16.750 10.000 L 16.750 9.000 L 22.000 9.000 L 22.000 3.000 L 19.553 5.446 C 17.720 3.335 15.016 2.000 12.000 2.000 ZM 8.500 8.500 L 10.000 8.500 L 10.000 15.500 L 8.500 15.500 L 8.500 8.500 Z"),
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
        return _forward15Fill!!
    }

private var _forward15Fill: ImageVector? = null
