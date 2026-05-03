package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorBoldIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.690 48.720 C 164.003 35.356 149.723 23.602 134.170 13.720 C 130.372 11.443 125.628 11.443 121.830 13.720 C 106.277 23.602 91.997 35.356 79.310 48.720 C 51.000 78.470 36.000 111.420 36.000 144.000 C 36.000 194.810 77.190 236.000 128.000 236.000 C 178.810 236.000 220.000 194.810 220.000 144.000 C 220.000 111.420 205.000 78.470 176.690 48.720 ZM 100.000 184.000 C 100.000 170.670 105.530 157.740 116.450 145.550 C 119.985 141.618 123.849 137.995 128.000 134.720 C 132.151 137.995 136.015 141.618 139.550 145.550 C 150.470 157.740 156.000 170.670 156.000 184.000 C 156.000 199.464 143.464 212.000 128.000 212.000 C 112.536 212.000 100.000 199.464 100.000 184.000 ZM 179.840 187.940 C 179.930 186.640 180.000 185.330 180.000 184.000 C 180.000 137.740 136.000 110.830 134.170 109.710 C 130.372 107.433 125.628 107.433 121.830 109.710 C 120.000 110.830 76.000 137.740 76.000 184.000 C 76.000 185.330 76.070 186.640 76.160 187.940 C 65.718 175.682 59.988 160.103 60.000 144.000 C 60.000 117.480 72.210 91.140 96.280 65.700 C 105.931 55.578 116.556 46.430 128.000 38.390 C 145.820 50.860 196.000 90.710 196.000 144.000 C 196.012 160.103 190.282 175.682 179.840 187.940 Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
