package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorBoldIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 177.620 159.600 C 172.522 175.807 159.827 188.502 143.620 193.600 C 142.454 193.962 141.241 194.148 140.020 194.150 C 134.092 194.154 129.050 189.830 128.150 183.971 C 127.251 178.112 130.764 172.474 136.420 170.700 C 145.155 167.956 151.996 161.115 154.740 152.380 C 156.728 146.056 163.466 142.542 169.790 144.530 C 176.114 146.518 179.628 153.256 177.640 159.580 ZM 220.000 144.000 C 220.000 194.810 178.810 236.000 128.000 236.000 C 77.190 236.000 36.000 194.810 36.000 144.000 C 36.000 115.190 47.270 85.820 69.480 56.720 C 71.561 53.993 74.710 52.286 78.131 52.032 C 81.552 51.778 84.919 53.000 87.380 55.390 L 107.070 74.500 L 127.000 19.890 C 128.337 16.223 131.374 13.436 135.142 12.418 C 138.910 11.399 142.937 12.277 145.940 14.770 C 168.200 33.250 220.000 82.850 220.000 144.000 ZM 196.000 144.000 C 196.000 102.290 165.390 65.610 143.480 44.710 L 123.270 100.110 C 121.876 103.931 118.642 106.786 114.678 107.695 C 110.714 108.603 106.559 107.442 103.640 104.610 L 80.710 82.360 C 67.000 103.380 60.000 124.060 60.000 144.000 C 60.000 181.555 90.445 212.000 128.000 212.000 C 165.555 212.000 196.000 181.555 196.000 144.000 Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
