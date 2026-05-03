package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorLightIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 172.000 138.000 C 177.523 138.000 182.000 142.477 182.000 148.000 C 182.000 153.523 177.523 158.000 172.000 158.000 C 166.477 158.000 162.000 153.523 162.000 148.000 C 162.000 142.477 166.477 138.000 172.000 138.000 ZM 185.460 101.440 L 119.240 70.530 C 82.027 74.966 54.005 106.523 54.000 144.000 C 54.000 144.220 54.000 144.440 54.000 144.660 L 125.160 106.710 C 127.020 105.710 129.269 105.762 131.081 106.847 C 132.893 107.931 134.002 109.888 134.000 112.000 L 134.000 217.760 C 164.062 215.424 189.662 194.995 198.610 166.200 C 199.604 163.038 202.973 161.281 206.135 162.275 C 209.297 163.269 211.054 166.638 210.060 169.800 C 200.068 201.465 172.739 224.550 139.849 229.107 C 106.959 233.664 74.383 218.879 56.158 191.123 C 37.933 163.367 37.315 127.599 54.570 99.230 C 39.754 92.853 31.458 76.943 34.710 61.144 C 37.963 45.345 51.870 34.006 68.000 34.000 C 68.877 33.999 69.744 34.190 70.540 34.560 L 189.260 90.000 C 201.410 89.652 210.978 79.520 210.630 67.370 C 210.282 55.220 200.150 45.652 188.000 46.000 C 184.686 46.000 182.000 43.314 182.000 40.000 C 182.000 36.686 184.686 34.000 188.000 34.000 C 206.778 34.000 222.000 49.222 222.000 68.000 C 222.000 86.778 206.778 102.000 188.000 102.000 C 187.123 102.001 186.256 101.810 185.460 101.440 ZM 102.000 213.270 C 108.425 215.687 115.157 217.192 122.000 217.740 L 122.000 122.000 L 102.000 132.670 ZM 55.270 157.590 C 59.196 178.412 71.834 196.563 90.000 207.470 L 90.000 139.070 ZM 101.410 62.210 L 66.740 46.000 C 56.083 46.646 47.428 54.850 46.214 65.457 C 44.999 76.064 51.575 86.012 61.810 89.050 C 62.670 88.050 63.560 86.990 64.480 85.980 C 74.525 74.994 87.250 66.804 101.410 62.210 Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
