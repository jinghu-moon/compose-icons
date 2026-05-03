package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorBoldIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.000 168.000 C 226.100 165.943 224.642 164.179 222.790 162.910 C 207.250 152.220 204.000 133.680 204.000 120.000 C 204.000 103.830 216.680 89.400 224.250 82.240 C 226.644 79.974 228.001 76.822 228.001 73.525 C 228.001 70.228 226.644 67.076 224.250 64.810 C 210.890 52.170 188.810 44.000 168.000 44.000 C 153.871 44.013 140.023 47.949 128.000 55.370 C 98.058 36.768 59.233 41.332 34.420 66.370 C 19.515 81.593 11.425 102.213 12.000 123.510 C 12.842 158.650 27.771 191.977 53.430 216.000 C 61.578 223.717 72.378 228.012 83.600 228.000 L 171.290 228.000 C 183.429 228.017 195.033 223.002 203.340 214.150 C 210.494 206.475 216.674 197.947 221.740 188.760 C 223.310 185.880 224.740 183.050 225.880 180.350 C 227.470 176.670 229.120 172.870 227.000 168.000 ZM 185.770 197.820 C 182.006 201.795 176.764 204.032 171.290 204.000 L 83.600 204.000 C 78.507 204.018 73.602 202.077 69.900 198.580 C 48.899 178.919 36.683 151.640 36.000 122.880 C 35.590 108.126 41.183 93.836 51.500 83.280 C 61.105 73.469 74.270 67.958 88.000 68.000 L 88.720 68.000 C 100.286 68.125 111.474 72.141 120.480 79.400 C 124.864 82.910 131.096 82.910 135.480 79.400 C 144.686 71.972 156.171 67.946 168.000 68.000 C 178.398 68.123 188.626 70.656 197.880 75.400 C 186.260 89.660 180.000 105.130 180.000 120.000 C 180.000 143.330 187.470 162.890 201.250 176.190 C 197.040 184.034 191.833 191.301 185.760 197.810 ZM 128.750 13.000 C 132.397 8.299 136.963 4.389 142.170 1.510 C 147.969 -1.704 155.276 0.391 158.490 6.190 C 161.704 11.989 159.609 19.296 153.810 22.510 C 151.437 23.821 149.357 25.604 147.700 27.750 C 143.627 32.983 136.083 33.923 130.850 29.850 C 125.617 25.777 124.677 18.233 128.750 13.000 Z"),
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
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
