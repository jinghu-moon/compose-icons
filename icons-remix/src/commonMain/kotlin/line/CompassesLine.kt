package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CompassesLine: ImageVector
    get() {
        if (_compassesLine != null) return _compassesLine!!
        _compassesLine = remixIcon(
            name = "CompassesLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 4.123 L 11.000 1.997 L 13.000 1.997 L 13.000 4.123 C 14.725 4.567 16.000 6.133 16.000 7.997 C 16.000 9.114 15.541 10.125 14.802 10.851 L 20.866 21.353 L 19.134 22.353 L 13.071 11.852 C 12.730 11.946 12.371 11.997 12.000 11.997 C 11.629 11.997 11.270 11.946 10.929 11.852 L 4.866 22.353 L 3.134 21.353 L 9.197 10.851 C 8.458 10.125 8.000 9.114 8.000 7.997 C 8.000 6.133 9.275 4.567 11.000 4.123 ZM 12.000 9.997 C 13.104 9.997 14.000 9.101 14.000 7.997 C 14.000 6.892 13.104 5.997 12.000 5.997 C 10.895 5.997 10.000 6.892 10.000 7.997 C 10.000 9.101 10.895 9.997 12.000 9.997 Z"),
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
        return _compassesLine!!
    }

private var _compassesLine: ImageVector? = null
