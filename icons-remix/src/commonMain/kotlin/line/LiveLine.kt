package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LiveLine: ImageVector
    get() {
        if (_liveLine != null) return _liveLine!!
        _liveLine = remixIcon(
            name = "LiveLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 4.000 C 16.552 4.000 17.000 4.448 17.000 5.000 L 17.000 9.200 L 22.213 5.551 C 22.440 5.392 22.751 5.447 22.910 5.674 C 22.968 5.758 23.000 5.858 23.000 5.960 L 23.000 18.040 C 23.000 18.316 22.776 18.540 22.500 18.540 C 22.397 18.540 22.297 18.508 22.213 18.449 L 17.000 14.800 L 17.000 19.000 C 17.000 19.552 16.552 20.000 16.000 20.000 L 2.000 20.000 C 1.448 20.000 1.000 19.552 1.000 19.000 L 1.000 5.000 C 1.000 4.448 1.448 4.000 2.000 4.000 L 16.000 4.000 ZM 15.000 6.000 L 3.000 6.000 L 3.000 18.000 L 15.000 18.000 L 15.000 6.000 ZM 7.400 8.829 C 7.476 8.829 7.551 8.850 7.615 8.891 L 11.970 11.663 C 12.156 11.781 12.211 12.028 12.092 12.215 C 12.061 12.264 12.019 12.306 11.970 12.337 L 7.615 15.109 C 7.428 15.227 7.181 15.172 7.063 14.986 C 7.022 14.922 7.000 14.847 7.000 14.771 L 7.000 9.229 C 7.000 9.008 7.179 8.829 7.400 8.829 ZM 21.000 8.841 L 17.000 11.641 L 17.000 12.359 L 21.000 15.159 L 21.000 8.841 Z"),
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
        return _liveLine!!
    }

private var _liveLine: ImageVector? = null
