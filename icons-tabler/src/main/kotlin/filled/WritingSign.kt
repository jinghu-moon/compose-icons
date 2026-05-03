package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.WritingSign: ImageVector
    get() {
        if (_writingSign != null) return _writingSign!!
        _writingSign = tablerFilledIcon(
            name = "WritingSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 11.000 C 5.517 11.000 4.979 11.725 5.000 12.983 C 5.013 13.766 5.290 14.283 6.035 15.053 L 6.142 15.160 L 6.243 15.026 C 6.709 14.383 6.957 13.760 6.995 13.162 L 7.000 13.000 L 6.997 12.437 C 6.980 11.153 6.867 11.015 6.190 11.001 ZM 18.000 2.000 C 19.673 2.000 21.000 3.327 21.000 5.000 L 21.000 6.000 L 15.000 6.000 L 15.000 5.000 C 15.000 3.327 16.327 2.000 18.000 2.000M 20.707 17.707 L 18.707 19.707 L 18.627 19.778 L 18.584 19.812 L 18.500 19.866 L 18.397 19.918 L 18.313 19.950 L 18.233 19.973 L 18.090 19.996 L 18.019 20.000 L 15.500 20.000 C 13.884 20.000 12.546 19.170 11.496 17.607 L 11.470 17.567 L 11.197 17.998 L 10.832 18.555 C 9.476 20.589 7.890 20.246 6.132 18.145 L 6.068 18.069 L 5.892 18.216 Q 4.995 18.943 3.847 19.654 L 3.515 19.857 C 3.208 20.049 2.822 20.060 2.505 19.887 C 2.188 19.713 1.989 19.382 1.985 19.021 C 1.980 18.659 2.172 18.324 2.485 18.143 C 3.242 17.695 3.967 17.194 4.655 16.645 L 4.733 16.580 L 4.586 16.430 C 3.588 15.397 3.088 14.526 3.010 13.273 L 3.000 13.017 C 2.962 10.744 4.257 9.000 6.000 9.000 C 8.052 9.000 9.000 9.948 9.000 13.000 C 9.000 14.218 8.530 15.392 7.608 16.532 L 7.498 16.662 L 7.778 17.022 C 8.562 18.007 8.772 18.014 9.121 17.514 L 9.168 17.445 Q 10.138 15.989 10.605 15.053 C 10.779 14.704 11.140 14.489 11.529 14.500 C 11.918 14.511 12.266 14.748 12.419 15.106 C 13.277 17.108 14.297 18.000 15.500 18.000 L 15.585 17.999 L 15.293 17.707 C 15.105 17.520 15.000 17.265 15.000 17.000 L 15.000 8.000 L 21.000 8.000 L 21.000 17.000 C 21.000 17.265 20.895 17.520 20.707 17.707"),
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
        return _writingSign!!
    }

private var _writingSign: ImageVector? = null
