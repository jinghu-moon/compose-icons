package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorThinIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 217.000 96.000 C 211.503 88.939 204.267 83.426 196.000 80.000 C 196.000 51.281 172.719 28.000 144.000 28.000 L 84.000 28.000 C 78.490 27.996 73.686 31.745 72.350 37.090 L 36.350 181.090 C 35.454 184.676 36.260 188.475 38.536 191.388 C 40.812 194.301 44.303 196.003 48.000 196.000 L 79.500 196.000 C 79.881 196.000 80.261 195.980 80.640 195.940 L 76.350 213.090 C 75.454 216.676 76.260 220.475 78.536 223.388 C 80.812 226.301 84.303 228.003 88.000 228.000 L 119.500 228.000 C 125.006 227.999 129.805 224.252 131.140 218.910 L 140.140 183.030 C 140.597 181.261 142.193 180.027 144.020 180.030 L 176.020 180.030 C 195.900 180.035 214.043 168.704 222.763 150.839 C 231.483 132.974 229.254 111.700 217.020 96.030 ZM 48.000 188.000 C 46.760 188.005 45.587 187.435 44.826 186.456 C 44.064 185.477 43.800 184.201 44.110 183.000 L 80.110 39.000 C 80.568 37.228 82.170 35.992 84.000 36.000 L 144.000 36.000 C 167.282 35.995 186.538 54.129 187.930 77.370 C 184.019 76.459 180.016 75.999 176.000 76.000 L 120.000 76.000 C 114.490 75.996 109.686 79.745 108.350 85.090 L 83.390 185.000 C 82.933 186.769 81.337 188.003 79.510 188.000 ZM 187.630 85.560 C 187.400 87.282 187.066 88.988 186.630 90.670 C 181.758 110.250 164.177 123.996 144.000 124.000 L 108.000 124.000 C 107.619 124.000 107.239 124.020 106.860 124.060 L 116.110 87.060 C 116.544 85.264 118.152 83.999 120.000 84.000 L 176.000 84.000 C 179.929 84.002 183.840 84.527 187.630 85.560 ZM 218.630 138.670 C 213.758 158.250 196.177 171.995 176.000 172.000 L 144.000 172.000 C 138.494 172.001 133.695 175.748 132.360 181.090 L 123.360 216.970 C 122.903 218.739 121.307 219.973 119.480 219.970 L 88.000 219.970 C 86.760 219.975 85.587 219.405 84.826 218.426 C 84.064 217.447 83.800 216.171 84.110 214.970 L 104.110 134.970 C 104.568 133.198 106.170 131.962 108.000 131.970 L 144.000 131.970 C 167.869 131.995 188.680 115.743 194.440 92.580 C 194.790 91.190 195.060 89.790 195.290 88.390 C 213.960 97.530 223.707 118.470 218.680 138.640 Z"),
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
