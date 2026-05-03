package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorLightIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 203.410 104.230 L 181.640 30.300 C 180.887 27.751 178.547 26.002 175.890 26.000 L 80.110 26.000 C 77.453 26.002 75.113 27.751 74.360 30.300 L 52.590 104.230 C 45.839 126.622 52.378 150.905 69.460 166.880 C 83.812 180.338 102.372 188.424 122.000 189.770 L 122.000 234.000 L 88.000 234.000 C 84.686 234.000 82.000 236.686 82.000 240.000 C 82.000 243.314 84.686 246.000 88.000 246.000 L 168.000 246.000 C 171.314 246.000 174.000 243.314 174.000 240.000 C 174.000 236.686 171.314 234.000 168.000 234.000 L 134.000 234.000 L 134.000 189.770 C 153.628 188.421 172.187 180.335 186.540 166.880 C 203.622 150.905 210.161 126.622 203.410 104.230 ZM 84.600 38.000 L 171.400 38.000 L 191.910 107.630 C 192.170 108.530 192.410 109.430 192.620 110.330 C 170.080 119.400 144.450 109.600 130.710 102.650 C 104.100 89.170 83.480 88.340 68.830 91.520 ZM 178.350 158.110 C 150.022 184.632 105.978 184.632 77.650 158.110 C 63.897 145.232 58.641 125.666 64.090 107.630 L 64.830 105.120 C 77.170 100.660 97.090 99.070 125.290 113.350 C 136.290 118.900 153.940 125.990 172.810 125.990 C 180.010 126.038 187.170 124.899 194.000 122.620 C 193.861 136.093 188.205 148.921 178.350 158.110 Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
