package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Aperture: ImageVector
    get() {
        if (_aperture != null) return _aperture!!
        _aperture = phosphorThinIcon(
            name = "Aperture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.710 57.290 C 173.485 31.843 136.573 21.837 101.949 31.060 C 67.326 40.283 40.283 67.326 31.060 101.949 C 21.837 136.573 31.843 173.485 57.290 198.710 C 82.515 224.157 119.427 234.163 154.051 224.940 C 188.674 215.717 215.717 188.674 224.940 154.051 C 234.163 119.427 224.157 82.515 198.710 57.290 ZM 209.080 171.560 L 148.080 160.420 L 210.400 87.000 C 223.651 113.730 223.160 145.217 209.080 171.520 ZM 95.870 122.130 L 117.000 97.240 L 149.140 103.100 L 160.140 133.870 L 139.000 158.760 L 106.860 152.900 ZM 206.240 79.580 L 166.110 126.830 L 133.750 36.200 C 163.512 38.070 190.526 54.236 206.240 79.580 ZM 63.000 63.000 C 79.533 46.380 101.826 36.755 125.260 36.120 L 146.000 94.410 L 51.320 77.110 C 54.739 72.034 58.652 67.307 63.000 63.000 ZM 47.000 84.490 L 108.000 95.630 L 45.600 169.000 C 32.349 142.270 32.840 110.783 46.920 84.480 ZM 49.840 176.490 L 89.970 129.240 L 122.330 219.870 C 92.568 218.000 65.554 201.834 49.840 176.490 ZM 193.130 193.120 C 176.597 209.740 154.304 219.365 130.870 220.000 L 110.000 161.590 L 204.720 178.890 C 201.307 183.983 197.398 188.727 193.050 193.050 Z"),
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
        return _aperture!!
    }

private var _aperture: ImageVector? = null
