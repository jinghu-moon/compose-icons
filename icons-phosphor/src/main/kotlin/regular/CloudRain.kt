package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorRegularIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 158.660 196.440 L 126.660 244.440 C 124.208 248.118 119.238 249.112 115.560 246.660 C 111.882 244.208 110.888 239.238 113.340 235.560 L 145.340 187.560 C 147.792 183.882 152.762 182.888 156.440 185.340 C 160.118 187.792 161.112 192.762 158.660 196.440 ZM 232.000 92.000 C 231.956 133.955 197.955 167.956 156.000 168.000 L 132.280 168.000 L 102.660 212.440 C 100.208 216.118 95.238 217.112 91.560 214.660 C 87.882 212.208 86.888 207.238 89.340 203.560 L 113.050 168.000 L 76.000 168.000 C 47.281 168.000 24.000 144.719 24.000 116.000 C 24.000 87.281 47.281 64.000 76.000 64.000 C 78.989 64.003 81.973 64.257 84.920 64.760 C 98.084 30.567 133.749 10.614 169.775 17.286 C 205.801 23.959 231.955 55.361 232.000 92.000 ZM 216.000 92.000 C 215.867 59.615 190.082 33.168 157.712 32.213 C 125.341 31.258 98.042 56.140 96.000 88.460 C 95.746 92.878 91.958 96.254 87.540 96.000 C 83.122 95.746 79.746 91.958 80.000 87.540 Q 80.210 83.880 80.770 80.310 C 79.188 80.107 77.595 80.003 76.000 80.000 C 56.118 80.000 40.000 96.118 40.000 116.000 C 40.000 135.882 56.118 152.000 76.000 152.000 L 156.000 152.000 C 189.121 151.961 215.961 125.121 216.000 92.000 Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
