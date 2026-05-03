package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorBoldIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 256.000 216.000 C 256.000 222.627 250.627 228.000 244.000 228.000 L 104.000 228.000 C 97.373 228.000 92.000 222.627 92.000 216.000 C 92.000 209.373 97.373 204.000 104.000 204.000 L 244.000 204.000 C 250.627 204.000 256.000 209.373 256.000 216.000 ZM 228.760 191.550 L 52.140 142.090 C 33.164 136.733 20.045 119.438 20.000 99.720 L 20.000 48.000 C 19.992 41.568 23.078 35.524 28.294 31.759 C 33.509 27.994 40.217 26.967 46.320 29.000 L 51.800 30.830 C 55.282 31.990 58.041 34.679 59.290 38.130 L 69.200 65.590 L 92.000 72.090 L 92.000 48.000 C 91.992 41.568 95.078 35.524 100.294 31.759 C 105.509 27.994 112.217 26.967 118.320 29.000 L 123.800 30.830 C 127.081 31.924 129.731 34.381 131.070 37.570 L 152.820 89.420 L 211.820 105.910 C 230.828 111.253 243.972 128.575 244.000 148.320 L 244.000 180.000 C 243.999 183.754 242.240 187.292 239.248 189.559 C 236.256 191.827 232.375 192.564 228.760 191.550 ZM 220.000 148.320 C 219.982 139.341 213.997 131.468 205.350 129.050 L 140.770 111.000 C 137.238 110.015 134.350 107.470 132.930 104.090 L 116.000 63.710 L 116.000 88.000 C 116.000 91.764 114.234 95.310 111.229 97.578 C 108.224 99.846 104.330 100.572 100.710 99.540 L 56.710 87.000 C 52.999 85.944 50.022 83.168 48.710 79.540 L 44.000 66.480 L 44.000 99.720 C 44.015 108.689 49.979 116.560 58.610 119.000 L 220.000 164.180 Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
