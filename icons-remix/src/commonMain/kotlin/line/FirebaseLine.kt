package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FirebaseLine: ImageVector
    get() {
        if (_firebaseLine != null) return _firebaseLine!!
        _firebaseLine = remixIcon(
            name = "FirebaseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.223 8.707 L 6.911 13.041 L 8.000 6.326 L 9.223 8.707 ZM 10.368 6.559 L 7.695 1.353 C 7.474 0.924 6.834 1.025 6.757 1.501 L 4.000 18.500 L 5.748 19.593 L 10.940 22.837 C 11.589 23.243 12.411 23.243 13.060 22.837 L 20.000 18.500 L 18.142 5.961 C 18.083 5.559 17.593 5.392 17.301 5.674 L 14.566 8.311 L 12.441 4.327 C 12.253 3.974 11.747 3.974 11.559 4.327 L 10.368 6.559 ZM 13.069 9.755 L 8.667 14.000 L 12.000 7.750 L 13.069 9.755 ZM 7.232 18.162 L 16.591 9.137 L 17.830 17.498 L 12.000 21.142 L 7.232 18.162 Z"),
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
        return _firebaseLine!!
    }

private var _firebaseLine: ImageVector? = null
