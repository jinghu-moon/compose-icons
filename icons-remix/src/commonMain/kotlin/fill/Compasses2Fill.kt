package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Compasses2Fill: ImageVector
    get() {
        if (_compasses2Fill != null) return _compasses2Fill!!
        _compasses2Fill = remixIcon(
            name = "Compasses2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.330 13.497 C 17.956 12.215 19.000 10.228 19.000 7.997 L 21.000 7.997 C 21.000 10.969 19.559 13.604 17.338 15.243 L 19.866 19.621 C 20.418 20.578 20.091 21.801 19.134 22.353 L 15.607 16.245 C 14.503 16.728 13.283 16.997 12.000 16.997 C 10.717 16.997 9.497 16.728 8.393 16.245 L 4.866 22.353 C 3.909 21.801 3.582 20.578 4.134 19.621 L 9.198 10.851 C 8.458 10.125 8.000 9.114 8.000 7.997 C 8.000 6.133 9.275 4.567 11.000 4.123 L 11.000 1.997 L 13.000 1.997 L 13.000 4.123 C 14.725 4.567 16.000 6.133 16.000 7.997 C 16.000 9.114 15.542 10.125 14.802 10.851 L 16.330 13.497 ZM 14.599 14.498 L 13.071 11.852 C 12.730 11.946 12.371 11.997 12.000 11.997 C 11.629 11.997 11.270 11.946 10.929 11.852 L 9.401 14.498 C 10.205 14.820 11.082 14.997 12.000 14.997 C 12.918 14.997 13.795 14.820 14.599 14.498 ZM 12.000 8.997 C 12.552 8.997 13.000 8.549 13.000 7.997 C 13.000 7.444 12.552 6.997 12.000 6.997 C 11.448 6.997 11.000 7.444 11.000 7.997 C 11.000 8.549 11.448 8.997 12.000 8.997 Z"),
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
        return _compasses2Fill!!
    }

private var _compasses2Fill: ImageVector? = null
