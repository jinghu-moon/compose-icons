package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarFour: ImageVector
    get() {
        if (_starFour != null) return _starFour!!
        _starFour = phosphorThinIcon(
            name = "StarFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.130 116.770 L 162.940 93.060 L 139.230 27.870 C 137.512 23.148 133.024 20.005 128.000 20.005 C 122.976 20.005 118.488 23.148 116.770 27.870 L 93.060 93.060 L 27.870 116.770 C 23.148 118.488 20.005 122.976 20.005 128.000 C 20.005 133.024 23.148 137.512 27.870 139.230 L 93.060 162.940 L 116.770 228.130 C 118.488 232.852 122.976 235.995 128.000 235.995 C 133.024 235.995 137.512 232.852 139.230 228.130 L 162.940 162.940 L 228.130 139.230 C 232.852 137.512 235.995 133.024 235.995 128.000 C 235.995 122.976 232.852 118.488 228.130 116.770 ZM 225.400 131.770 L 158.400 156.110 C 157.289 156.514 156.414 157.389 156.010 158.500 L 131.670 225.500 C 131.067 227.027 129.592 228.030 127.950 228.030 C 126.308 228.030 124.833 227.027 124.230 225.500 L 99.890 158.500 C 99.486 157.389 98.611 156.514 97.500 156.110 L 30.600 131.720 C 29.073 131.117 28.070 129.642 28.070 128.000 C 28.070 126.358 29.073 124.883 30.600 124.280 L 97.550 99.940 C 98.661 99.536 99.536 98.661 99.940 97.550 L 124.280 30.600 C 124.883 29.073 126.358 28.070 128.000 28.070 C 129.642 28.070 131.117 29.073 131.720 30.600 L 156.060 97.550 C 156.464 98.661 157.339 99.536 158.450 99.940 L 225.450 124.280 C 226.977 124.883 227.980 126.358 227.980 128.000 C 227.980 129.642 226.977 131.117 225.450 131.720 Z"),
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
        return _starFour!!
    }

private var _starFour: ImageVector? = null
