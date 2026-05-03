package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorLightIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 173.880 111.940 C 173.493 110.050 172.220 108.461 170.460 107.670 L 119.000 84.560 L 133.000 25.390 C 133.635 22.736 132.399 19.988 129.992 18.702 C 127.585 17.416 124.613 17.917 122.760 19.920 L 27.600 122.780 C 26.287 124.197 25.737 126.159 26.121 128.052 C 26.506 129.946 27.778 131.538 29.540 132.330 L 81.000 155.440 L 67.000 214.610 C 66.368 217.260 67.600 220.002 70.000 221.290 C 72.405 222.569 75.369 222.068 77.220 220.070 L 172.420 117.220 C 173.729 115.798 174.272 113.832 173.880 111.940 ZM 83.880 195.150 L 93.800 153.390 C 94.465 150.589 93.047 147.709 90.420 146.530 L 42.080 124.800 L 116.080 44.800 L 106.160 86.570 C 105.495 89.371 106.913 92.251 109.540 93.430 L 157.920 115.160 ZM 237.320 213.310 L 201.320 141.310 C 200.305 139.274 198.225 137.986 195.950 137.986 C 193.675 137.986 191.595 139.274 190.580 141.310 L 154.580 213.310 C 153.097 216.276 154.299 219.882 157.265 221.365 C 160.231 222.848 163.837 221.646 165.320 218.680 L 175.710 198.000 L 216.290 198.000 L 226.630 218.680 C 227.646 220.715 229.725 222.001 232.000 222.000 C 232.931 222.002 233.850 221.783 234.680 221.360 C 237.643 219.877 238.843 216.273 237.360 213.310 ZM 181.710 186.000 L 196.000 157.420 L 210.290 186.000 Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
