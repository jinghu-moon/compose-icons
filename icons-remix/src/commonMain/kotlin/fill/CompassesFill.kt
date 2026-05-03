package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CompassesFill: ImageVector
    get() {
        if (_compassesFill != null) return _compassesFill!!
        _compassesFill = remixIcon(
            name = "CompassesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 4.123 L 11.000 1.997 L 13.000 1.997 L 13.000 4.123 C 14.725 4.567 16.000 6.133 16.000 7.997 C 16.000 9.114 15.541 10.125 14.802 10.851 L 20.866 21.353 L 19.134 22.353 L 13.071 11.852 C 12.730 11.946 12.371 11.997 12.000 11.997 C 11.629 11.997 11.270 11.946 10.929 11.852 L 4.866 22.353 L 3.134 21.353 L 9.197 10.851 C 8.458 10.125 8.000 9.114 8.000 7.997 C 8.000 6.133 9.275 4.567 11.000 4.123 ZM 12.000 8.997 C 12.552 8.997 13.000 8.549 13.000 7.997 C 13.000 7.444 12.552 6.997 12.000 6.997 C 11.448 6.997 11.000 7.444 11.000 7.997 C 11.000 8.549 11.448 8.997 12.000 8.997 Z"),
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
        return _compassesFill!!
    }

private var _compassesFill: ImageVector? = null
