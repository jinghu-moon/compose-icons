package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Stars: ImageVector
    get() {
        if (_stars != null) return _stars!!
        _stars = tablerFilledIcon(
            name = "Stars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.657 12.007 C 17.182 12.056 16.766 12.345 16.554 12.772 L 15.699 14.495 L 13.792 14.772 C 13.272 14.844 12.832 15.212 12.668 15.716 L 12.630 15.856 C 12.530 16.321 12.676 16.810 13.023 17.146 L 14.400 18.483 L 14.074 20.375 C 13.987 20.896 14.202 21.422 14.630 21.732 C 15.057 22.043 15.624 22.084 16.092 21.840 L 17.800 20.945 L 19.508 21.841 C 19.976 22.087 20.542 22.046 20.970 21.736 L 21.082 21.646 C 21.439 21.326 21.606 20.846 21.524 20.374 L 21.199 18.483 L 22.579 17.144 C 22.959 16.773 23.095 16.220 22.931 15.717 L 22.880 15.583 C 22.685 15.146 22.280 14.841 21.807 14.773 L 19.900 14.495 L 19.047 12.773 C 18.812 12.300 18.329 12.000 17.800 12.000 L 17.657 12.007 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 6.057 12.007 C 5.582 12.056 5.166 12.345 4.954 12.772 L 4.099 14.495 L 2.192 14.772 C 1.672 14.844 1.232 15.212 1.068 15.716 L 1.030 15.856 C 0.930 16.321 1.076 16.810 1.423 17.146 L 2.800 18.483 L 2.474 20.375 C 2.387 20.896 2.602 21.422 3.030 21.732 C 3.457 22.043 4.024 22.084 4.492 21.840 L 6.200 20.945 L 7.908 21.841 C 8.376 22.087 8.942 22.046 9.370 21.736 L 9.482 21.646 C 9.839 21.326 10.006 20.846 9.924 20.374 L 9.600 18.483 L 10.980 17.144 C 11.360 16.773 11.496 16.220 11.332 15.717 L 11.281 15.583 C 11.086 15.146 10.681 14.841 10.208 14.773 L 8.300 14.494 L 7.447 12.772 C 7.211 12.299 6.728 12.000 6.200 12.000 L 6.057 12.007 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 11.857 2.007 C 11.382 2.056 10.966 2.345 10.754 2.772 L 9.899 4.495 L 7.992 4.772 C 7.472 4.844 7.032 5.212 6.868 5.716 L 6.830 5.856 C 6.730 6.321 6.876 6.810 7.223 7.146 L 8.600 8.483 L 8.274 10.375 C 8.187 10.896 8.402 11.422 8.830 11.732 C 9.257 12.043 9.824 12.084 10.292 11.840 L 12.000 10.946 L 13.709 11.842 C 14.177 12.088 14.743 12.047 15.171 11.737 L 15.283 11.647 C 15.640 11.327 15.807 10.847 15.725 10.375 L 15.400 8.483 L 16.780 7.144 C 17.160 6.773 17.296 6.220 17.132 5.717 L 17.081 5.583 C 16.886 5.146 16.481 4.841 16.008 4.773 L 14.100 4.494 L 13.247 2.772 C 13.011 2.299 12.528 2.000 12.000 2.000 L 11.857 2.007 Z"),
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
        return _stars!!
    }

private var _stars: ImageVector? = null
