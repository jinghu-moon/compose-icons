package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ad: ImageVector
    get() {
        if (_ad != null) return _ad!!
        _ad = tablerFilledIcon(
            name = "Ad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 4.000 L 5.000 4.000 C 3.343 4.000 2.000 5.343 2.000 7.000 L 2.000 17.000 C 2.000 18.657 3.343 20.000 5.000 20.000 L 19.000 20.000 C 20.657 20.000 22.000 18.657 22.000 17.000 L 22.000 7.000 C 22.000 5.343 20.657 4.000 19.000 4.000 ZM 9.000 8.000 C 10.589 8.000 11.902 9.238 11.995 10.824 L 12.000 11.000 L 12.000 15.000 C 11.999 15.529 11.587 15.966 11.059 15.997 C 10.530 16.028 10.069 15.642 10.007 15.117 L 10.000 15.000 L 10.000 14.000 L 8.000 14.000 L 8.000 15.000 C 7.999 15.529 7.587 15.966 7.059 15.997 C 6.530 16.028 6.069 15.642 6.007 15.117 L 6.000 15.000 L 6.000 11.000 C 6.000 9.343 7.343 8.000 9.000 8.000 ZM 9.000 10.000 C 8.493 10.000 8.066 10.380 8.007 10.883 L 8.000 11.000 L 8.000 12.000 L 10.000 12.000 L 10.000 11.000 C 10.000 10.448 9.552 10.000 9.000 10.000 ZM 17.000 8.000 C 17.507 8.000 17.934 8.380 17.993 8.883 L 18.000 9.000 L 18.000 15.000 C 18.000 15.507 17.620 15.934 17.117 15.993 L 17.000 16.000 L 15.500 16.000 C 14.568 15.999 13.715 15.480 13.285 14.654 C 12.855 13.827 12.920 12.830 13.454 12.067 C 13.988 11.304 14.902 10.901 15.826 11.021 L 16.000 11.050 L 16.000 9.000 C 16.000 8.493 16.380 8.066 16.883 8.007 L 17.000 8.000 ZM 15.590 13.008 L 15.500 13.000 C 15.241 13.000 15.025 13.197 15.001 13.455 C 14.978 13.713 15.155 13.946 15.410 13.992 L 15.500 14.000 L 16.000 14.000 L 16.000 13.500 L 15.992 13.410 C 15.960 13.236 15.839 13.092 15.674 13.031 L 15.590 13.008 Z"),
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
        return _ad!!
    }

private var _ad: ImageVector? = null
