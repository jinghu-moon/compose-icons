package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HeartStraight: ImageVector
    get() {
        if (_heartStraight != null) return _heartStraight!!
        _heartStraight = phosphorRegularIcon(
            name = "HeartStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 223.000 57.000 C 200.373 34.430 163.762 34.385 141.080 56.900 L 128.000 69.050 L 114.910 56.860 C 92.228 34.241 55.504 34.293 32.885 56.975 C 10.266 79.657 10.318 116.381 33.000 139.000 L 122.350 229.660 C 123.854 231.187 125.907 232.047 128.050 232.047 C 130.193 232.047 132.246 231.187 133.750 229.660 L 223.000 139.000 C 245.634 116.352 245.634 79.648 223.000 57.000 ZM 211.650 127.760 L 128.000 212.600 L 44.300 127.680 C 27.897 111.277 27.897 84.683 44.300 68.280 C 60.703 51.877 87.297 51.877 103.700 68.280 L 103.900 68.480 L 122.550 85.830 C 125.621 88.688 130.379 88.688 133.450 85.830 L 152.100 68.480 L 152.300 68.280 C 168.714 51.888 195.308 51.906 211.700 68.320 C 228.092 84.734 228.074 111.328 211.660 127.720 Z"),
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
        return _heartStraight!!
    }

private var _heartStraight: ImageVector? = null
