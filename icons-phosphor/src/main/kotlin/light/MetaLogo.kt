package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorLightIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 149.310 C 238.000 165.060 234.930 178.480 229.120 188.120 C 222.070 199.820 211.120 206.000 197.440 206.000 C 170.700 206.000 151.140 169.490 130.440 130.830 C 113.140 98.570 93.550 62.000 74.000 62.000 C 50.720 62.000 30.000 110.830 30.000 149.310 C 30.000 162.880 32.480 174.150 37.160 181.930 C 42.060 190.050 49.060 194.000 58.560 194.000 C 74.720 194.000 90.870 168.940 104.560 144.430 C 106.299 141.828 109.746 141.000 112.478 142.528 C 115.209 144.056 116.307 147.426 115.000 150.270 C 100.000 177.230 82.000 206.000 58.560 206.000 C 44.890 206.000 33.930 199.820 26.880 188.120 C 21.070 178.480 18.000 165.060 18.000 149.310 C 18.000 108.820 39.810 50.000 74.000 50.000 C 100.740 50.000 120.300 86.510 141.000 125.170 C 158.290 157.430 177.880 194.000 197.440 194.000 C 206.940 194.000 213.940 190.050 218.840 181.930 C 223.520 174.150 226.000 162.880 226.000 149.310 C 226.000 110.830 205.290 62.000 182.000 62.000 C 173.000 62.000 163.090 69.760 151.860 85.730 C 149.952 88.442 146.207 89.093 143.495 87.185 C 140.783 85.277 140.132 81.532 142.040 78.820 C 150.750 66.450 164.370 50.000 182.000 50.000 C 216.190 50.000 238.000 108.820 238.000 149.310 Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
