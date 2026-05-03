package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorLightIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.540 94.770 C 213.119 87.796 206.065 82.264 198.000 78.660 C 197.273 49.361 173.308 25.991 144.000 26.000 L 84.000 26.000 C 77.578 26.000 71.980 30.370 70.420 36.600 L 34.420 180.600 C 33.373 184.783 34.311 189.215 36.964 192.614 C 39.617 196.013 43.688 198.000 48.000 198.000 L 78.070 198.000 L 74.420 212.600 C 73.373 216.783 74.311 221.215 76.964 224.614 C 79.617 228.013 83.688 230.000 88.000 230.000 L 119.500 230.000 C 125.922 230.000 131.520 225.630 133.080 219.400 L 142.080 183.520 C 142.299 182.635 143.088 182.010 144.000 182.000 L 176.000 182.000 C 196.641 181.998 215.476 170.230 224.527 151.679 C 233.578 133.128 231.262 111.040 218.560 94.770 ZM 79.510 186.000 L 48.000 186.000 C 47.383 186.000 46.801 185.716 46.421 185.229 C 46.042 184.743 45.909 184.108 46.060 183.510 L 82.060 39.510 C 82.284 38.622 83.084 38.000 84.000 38.000 L 144.000 38.000 C 165.214 37.998 183.099 53.815 185.690 74.870 C 182.492 74.292 179.249 74.001 176.000 74.000 L 120.000 74.000 C 113.574 73.996 107.971 78.367 106.410 84.600 L 81.410 184.490 C 81.189 185.364 80.411 185.982 79.510 186.000 ZM 185.370 87.050 C 185.190 88.050 184.980 89.140 184.720 90.190 C 180.066 108.889 163.269 122.010 144.000 122.000 L 109.440 122.000 L 118.060 87.520 C 118.281 86.628 119.081 86.001 120.000 86.000 L 176.000 86.000 C 179.153 86.001 182.295 86.353 185.370 87.050 ZM 216.720 138.190 C 212.066 156.889 195.269 170.010 176.000 170.000 L 144.000 170.000 C 137.578 170.000 131.980 174.370 130.420 180.600 L 121.420 216.490 C 121.196 217.378 120.396 218.000 119.480 218.000 L 88.000 218.000 C 87.383 218.000 86.801 217.716 86.421 217.229 C 86.042 216.743 85.909 216.108 86.060 215.510 L 106.060 135.510 C 106.286 134.596 107.119 133.963 108.060 133.990 L 144.060 133.990 C 168.845 134.016 190.455 117.142 196.440 93.090 C 196.580 92.540 196.690 91.990 196.800 91.450 C 213.189 100.781 221.364 119.881 216.800 138.180 Z"),
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
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
