package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WifiHigh: ImageVector
    get() {
        if (_wifiHigh != null) return _wifiHigh!!
        _wifiHigh = phosphorFillIcon(
            name = "WifiHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.350 92.800 L 140.350 218.230 C 137.306 221.906 132.773 224.024 128.000 224.000 L 128.000 224.000 C 123.241 224.012 118.725 221.896 115.690 218.230 L 11.650 92.800 C 8.882 89.494 7.602 85.192 8.110 80.910 C 8.616 76.619 10.842 72.717 14.280 70.100 C 46.964 45.237 86.934 31.846 128.000 32.000 C 169.066 31.846 209.036 45.237 241.720 70.100 C 245.158 72.717 247.384 76.619 247.890 80.910 C 248.398 85.192 247.118 89.494 244.350 92.800 Z"),
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
        return _wifiHigh!!
    }

private var _wifiHigh: ImageVector? = null
