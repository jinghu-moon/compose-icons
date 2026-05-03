package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorBoldIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.880 28.290 C 169.410 20.290 146.290 18.000 123.770 21.750 C 99.490 25.750 78.440 36.280 62.890 52.090 C 25.470 90.150 33.050 167.560 50.000 207.880 C 56.870 224.360 69.000 244.000 87.510 244.000 C 112.890 244.000 124.230 221.860 134.240 202.320 C 140.970 189.180 147.930 175.580 158.470 168.430 L 158.470 168.430 C 163.960 164.710 171.690 161.730 179.880 158.570 C 203.570 149.440 236.000 136.930 236.000 93.170 C 236.000 64.190 218.820 40.540 188.880 28.290 ZM 171.240 136.180 C 162.160 139.680 152.760 143.310 145.000 148.570 C 129.370 159.170 120.610 176.280 112.870 191.380 C 103.790 209.130 97.700 220.000 87.510 220.000 C 86.230 220.000 79.510 216.190 72.100 198.600 C 57.480 163.750 51.890 97.510 80.000 68.910 C 91.790 56.910 108.730 48.570 127.690 45.420 C 133.309 44.494 138.995 44.029 144.690 44.030 C 156.689 43.928 168.597 46.124 179.770 50.500 C 191.770 55.420 211.980 67.500 211.980 93.170 C 212.000 119.140 196.510 126.430 171.240 136.180 Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
