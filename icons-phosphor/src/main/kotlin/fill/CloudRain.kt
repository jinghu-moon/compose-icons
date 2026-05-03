package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorFillIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 158.660 196.440 L 126.660 244.440 C 124.208 248.118 119.238 249.112 115.560 246.660 C 111.882 244.208 110.888 239.238 113.340 235.560 L 145.340 187.560 C 147.792 183.882 152.762 182.888 156.440 185.340 C 160.118 187.792 161.112 192.762 158.660 196.440 ZM 231.870 87.550 C 229.512 47.227 196.025 15.793 155.634 15.987 C 115.243 16.181 82.060 47.936 80.090 88.280 C 79.848 92.583 76.309 95.959 72.000 96.000 L 71.400 96.000 C 67.009 95.608 63.728 91.790 64.000 87.390 C 64.278 81.828 65.058 76.302 66.330 70.880 C 66.664 69.495 66.236 68.036 65.206 67.051 C 64.175 66.066 62.699 65.704 61.330 66.100 C 39.084 72.673 23.864 93.164 24.000 116.360 C 24.200 145.070 48.120 168.000 76.840 168.000 L 113.050 168.000 L 89.340 203.560 C 86.888 207.238 87.882 212.208 91.560 214.660 C 95.238 217.112 100.208 216.118 102.660 212.440 L 132.280 168.000 L 156.000 168.000 C 176.922 167.977 196.910 159.339 211.265 144.118 C 225.619 128.897 233.072 108.437 231.870 87.550 Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
