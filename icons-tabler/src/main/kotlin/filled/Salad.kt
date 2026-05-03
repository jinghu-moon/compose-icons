package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = tablerFilledIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.530 3.152 L 13.272 5.491 Q 14.764 5.000 16.744 5.000 L 19.000 5.000 C 19.552 5.000 20.000 5.448 20.000 6.000 L 19.999 7.336 L 19.949 8.231 L 19.907 8.816 C 19.870 9.273 19.827 9.656 19.773 10.001 L 20.000 10.000 C 21.105 10.000 22.000 10.895 22.000 12.000 L 22.000 12.500 C 22.000 14.194 19.753 17.990 18.017 19.483 L 18.000 19.496 L 18.000 20.000 C 18.000 21.047 17.194 21.917 16.150 21.995 L 16.000 22.000 L 8.000 22.000 C 6.895 22.000 6.000 21.105 6.000 20.000 L 6.000 19.504 L 5.935 19.451 C 4.175 17.955 2.141 14.486 2.007 12.681 L 2.000 12.500 L 2.000 12.000 C 2.000 10.895 2.895 10.000 4.000 10.000 L 4.078 10.000 C 4.040 9.668 4.014 9.334 4.000 9.000 L 4.000 8.000 C 4.000 7.448 4.448 7.000 5.000 7.000 L 6.755 7.000 C 6.893 7.000 7.042 7.034 7.195 7.092 L 8.030 3.757 C 8.108 3.447 8.329 3.192 8.626 3.073 C 8.923 2.953 9.259 2.982 9.530 3.152M 7.337 8.999 L 6.002 9.000 L 6.029 9.420 Q 6.054 9.712 6.093 10.000 L 7.035 10.000 Q 7.113 9.467 7.337 8.999M 18.000 7.000 L 16.744 7.000 C 15.032 7.000 13.741 7.310 12.822 7.880 C 13.442 8.429 13.847 9.180 13.965 10.000 L 17.739 10.000 C 17.866 9.385 17.933 8.600 18.000 7.286 ZM 10.500 9.000 C 9.864 9.000 9.298 9.401 9.086 10.000 L 11.914 10.000 C 11.772 9.597 11.464 9.274 11.069 9.112 L 10.903 9.056 C 10.772 9.019 10.636 9.000 10.500 9.000M 9.636 5.576 L 9.221 7.241 C 9.698 7.054 10.211 6.974 10.723 7.007 C 10.880 6.851 11.046 6.703 11.220 6.565 Z"),
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
        return _salad!!
    }

private var _salad: ImageVector? = null
