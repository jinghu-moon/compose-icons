package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = phosphorLightIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 114.000 C 102.595 114.000 82.000 134.595 82.000 160.000 C 82.000 185.405 102.595 206.000 128.000 206.000 C 153.405 206.000 174.000 185.405 174.000 160.000 C 173.967 134.609 153.391 114.033 128.000 114.000 ZM 128.000 194.000 C 109.222 194.000 94.000 178.778 94.000 160.000 C 94.000 141.222 109.222 126.000 128.000 126.000 C 146.778 126.000 162.000 141.222 162.000 160.000 C 162.000 178.778 146.778 194.000 128.000 194.000 ZM 209.100 131.320 L 179.300 47.110 C 172.083 25.156 151.696 10.228 128.587 9.977 C 105.479 9.726 84.772 24.208 77.080 46.000 L 77.080 46.000 L 47.560 129.520 C 34.111 165.086 45.615 205.263 75.850 228.321 C 106.085 251.379 147.874 251.845 178.615 229.466 C 209.357 207.087 221.753 167.177 209.100 131.320 ZM 128.000 234.000 C 103.678 233.984 80.915 222.026 67.102 202.008 C 53.288 181.990 50.185 156.465 58.800 133.720 C 58.800 133.670 58.800 133.630 58.850 133.590 L 88.390 50.000 L 88.390 50.000 C 94.373 33.035 110.497 21.764 128.485 21.972 C 146.473 22.180 162.331 33.821 167.920 50.920 C 167.920 50.920 167.920 51.000 167.970 51.050 L 197.790 135.330 C 205.771 157.982 202.272 183.099 188.403 202.707 C 174.534 222.315 152.017 233.980 128.000 234.000 Z"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
