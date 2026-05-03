package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Forward30Fill: ImageVector
    get() {
        if (_forward30Fill != null) return _forward30Fill!!
        _forward30Fill = remixIcon(
            name = "Forward30Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 15.016 2.000 17.720 3.335 19.553 5.446 L 22.000 3.000 L 22.000 9.000 L 16.785 9.000 C 17.227 9.451 17.500 10.069 17.500 10.750 L 17.500 13.250 C 17.500 14.631 16.381 15.750 15.000 15.750 C 13.619 15.750 12.500 14.631 12.500 13.250 L 12.500 10.750 C 12.500 9.369 13.619 8.250 15.000 8.250 C 15.498 8.250 15.963 8.396 16.353 8.647 L 18.135 6.865 C 16.668 5.114 14.464 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 L 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 ZM 15.000 9.750 C 14.448 9.750 14.000 10.198 14.000 10.750 L 14.000 13.250 C 14.000 13.802 14.448 14.250 15.000 14.250 C 15.552 14.250 16.000 13.802 16.000 13.250 L 16.000 10.750 C 16.000 10.198 15.552 9.750 15.000 9.750 ZM 10.000 13.375 C 10.000 13.030 9.720 12.750 9.375 12.750 L 7.500 12.750 L 7.500 11.250 L 9.375 11.250 C 9.720 11.250 10.000 10.970 10.000 10.625 C 10.000 10.280 9.720 10.000 9.375 10.000 L 6.750 10.000 L 6.750 8.500 L 9.375 8.500 C 10.548 8.500 11.500 9.451 11.500 10.625 C 11.500 11.149 11.310 11.629 10.995 12.000 C 11.310 12.371 11.500 12.851 11.500 13.375 C 11.500 14.549 10.548 15.500 9.375 15.500 L 6.750 15.500 L 6.750 14.000 L 9.375 14.000 C 9.720 14.000 10.000 13.720 10.000 13.375 Z"),
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
        return _forward30Fill!!
    }

private var _forward30Fill: ImageVector? = null
