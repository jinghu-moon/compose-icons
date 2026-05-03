package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings3Fill: ImageVector
    get() {
        if (_settings3Fill != null) return _settings3Fill!!
        _settings3Fill = remixIcon(
            name = "Settings3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.954 2.211 C 11.288 1.931 12.681 1.923 14.045 2.208 C 14.222 3.367 14.905 4.439 16.000 5.071 C 17.094 5.703 18.364 5.759 19.457 5.332 C 20.386 6.371 21.075 7.582 21.500 8.877 C 20.585 9.610 20.000 10.736 20.000 11.999 C 20.000 13.263 20.586 14.390 21.501 15.123 C 21.290 15.764 21.010 16.392 20.660 16.999 C 20.309 17.606 19.905 18.163 19.456 18.666 C 18.363 18.240 17.094 18.295 16.000 18.927 C 14.906 19.559 14.223 20.629 14.045 21.788 C 12.712 22.067 11.319 22.076 9.954 21.791 C 9.777 20.631 9.095 19.559 8.000 18.927 C 6.905 18.295 5.635 18.240 4.543 18.666 C 3.614 17.627 2.925 16.416 2.500 15.122 C 3.414 14.389 4.000 13.262 4.000 11.999 C 4.000 10.735 3.413 9.608 2.498 8.875 C 2.709 8.235 2.989 7.606 3.339 6.999 C 3.690 6.392 4.094 5.836 4.543 5.333 C 5.636 5.759 6.905 5.703 8.000 5.071 C 9.094 4.439 9.776 3.369 9.954 2.211 ZM 12.000 14.999 C 13.656 14.999 15.000 13.656 15.000 11.999 C 15.000 10.342 13.656 8.999 12.000 8.999 C 10.343 8.999 9.000 10.342 9.000 11.999 C 9.000 13.656 10.343 14.999 12.000 14.999 Z"),
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
        return _settings3Fill!!
    }

private var _settings3Fill: ImageVector? = null
