package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorThinIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 36.000 L 152.000 36.000 C 150.758 36.000 149.587 36.576 148.830 37.560 L 82.050 124.380 L 69.190 111.520 C 66.938 109.261 63.880 107.991 60.690 107.991 C 57.500 107.991 54.442 109.261 52.190 111.520 L 39.520 124.210 C 37.261 126.462 35.991 129.520 35.991 132.710 C 35.991 135.900 37.261 138.958 39.520 141.210 L 62.340 164.000 L 31.520 194.830 C 29.261 197.082 27.991 200.140 27.991 203.330 C 27.991 206.520 29.261 209.578 31.520 211.830 L 44.200 224.490 C 46.452 226.749 49.510 228.019 52.700 228.019 C 55.890 228.019 58.948 226.749 61.200 224.490 L 92.000 193.670 L 114.810 216.490 C 117.062 218.749 120.120 220.019 123.310 220.019 C 126.500 220.019 129.558 218.749 131.810 216.490 L 144.500 203.790 C 146.759 201.538 148.029 198.480 148.029 195.290 C 148.029 192.100 146.759 189.042 144.500 186.790 L 131.620 174.000 L 218.440 107.210 C 219.435 106.444 220.013 105.256 220.000 104.000 L 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 ZM 55.520 218.830 C 54.770 219.581 53.752 220.003 52.690 220.003 C 51.628 220.003 50.610 219.581 49.860 218.830 L 37.170 206.150 C 36.419 205.400 35.997 204.382 35.997 203.320 C 35.997 202.258 36.419 201.240 37.170 200.490 L 68.000 169.670 L 86.340 188.000 ZM 138.830 192.470 C 139.584 193.221 140.008 194.241 140.008 195.305 C 140.008 196.369 139.584 197.389 138.830 198.140 L 126.130 210.830 C 125.380 211.581 124.362 212.003 123.300 212.003 C 122.238 212.003 121.220 211.581 120.470 210.830 L 45.170 135.530 C 44.419 134.780 43.997 133.762 43.997 132.700 C 43.997 131.638 44.419 130.620 45.170 129.870 L 57.870 117.180 C 58.620 116.429 59.638 116.007 60.700 116.007 C 61.762 116.007 62.780 116.429 63.530 117.180 ZM 212.000 102.000 L 125.920 168.220 L 109.660 152.000 L 162.830 98.830 C 164.393 97.267 164.393 94.733 162.830 93.170 C 161.267 91.607 158.733 91.607 157.170 93.170 L 104.000 146.340 L 87.750 130.080 L 154.000 44.000 L 212.000 44.000 Z"),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
