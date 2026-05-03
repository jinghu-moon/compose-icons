package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorFillIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.890 80.910 C 247.384 76.619 245.158 72.717 241.720 70.100 C 209.036 45.237 169.066 31.846 128.000 32.000 C 86.934 31.846 46.964 45.237 14.280 70.100 C 10.842 72.717 8.616 76.619 8.110 80.910 C 7.602 85.192 8.882 89.494 11.650 92.800 L 115.650 218.230 C 118.694 221.906 123.227 224.024 128.000 224.000 L 128.000 224.000 C 132.759 224.012 137.275 221.896 140.310 218.230 L 140.310 218.230 L 244.310 92.800 C 247.092 89.500 248.387 85.197 247.890 80.910 ZM 201.120 119.850 C 157.561 88.046 98.439 88.046 54.880 119.850 L 24.090 82.740 C 53.971 60.061 90.488 47.852 128.000 48.000 C 165.512 47.852 202.029 60.061 231.910 82.740 Z"),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
