package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorThinIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 28.000 L 123.310 28.000 C 120.130 28.000 117.080 29.263 114.830 31.510 L 101.660 44.690 L 88.490 31.510 C 86.238 29.251 83.180 27.981 79.990 27.981 C 76.800 27.981 73.742 29.251 71.490 31.510 L 47.490 55.510 C 45.231 57.762 43.961 60.820 43.961 64.010 C 43.961 67.200 45.231 70.258 47.490 72.510 L 60.690 85.660 L 47.520 98.830 C 45.260 101.072 43.992 104.126 44.000 107.310 L 44.000 216.000 C 44.000 222.627 49.373 228.000 56.000 228.000 L 200.000 228.000 C 206.627 228.000 212.000 222.627 212.000 216.000 L 212.000 40.000 C 212.000 33.373 206.627 28.000 200.000 28.000 ZM 53.170 66.830 C 52.419 66.080 51.997 65.062 51.997 64.000 C 51.997 62.938 52.419 61.920 53.170 61.170 L 77.170 37.170 C 77.920 36.419 78.938 35.997 80.000 35.997 C 81.062 35.997 82.080 36.419 82.830 37.170 L 96.000 50.340 L 66.340 80.000 ZM 204.000 216.000 C 204.000 218.209 202.209 220.000 200.000 220.000 L 56.000 220.000 C 53.791 220.000 52.000 218.209 52.000 216.000 L 52.000 107.310 C 52.002 106.252 52.422 105.238 53.170 104.490 L 69.170 88.490 L 69.170 88.490 L 104.480 53.180 L 104.480 53.180 L 120.480 37.180 C 121.229 36.426 122.247 36.002 123.310 36.000 L 200.000 36.000 C 202.209 36.000 204.000 37.791 204.000 40.000 ZM 180.000 64.000 C 180.000 66.209 178.209 68.000 176.000 68.000 L 136.000 68.000 C 133.791 68.000 132.000 66.209 132.000 64.000 C 132.000 61.791 133.791 60.000 136.000 60.000 L 176.000 60.000 C 178.209 60.000 180.000 61.791 180.000 64.000 ZM 178.400 123.200 L 134.670 156.000 L 178.400 188.800 C 180.167 190.125 180.525 192.633 179.200 194.400 C 177.875 196.167 175.367 196.525 173.600 195.200 L 128.000 161.000 L 82.400 195.200 C 80.633 196.525 78.125 196.167 76.800 194.400 C 75.475 192.633 75.833 190.125 77.600 188.800 L 121.330 156.000 L 77.600 123.200 C 75.833 121.875 75.475 119.367 76.800 117.600 C 78.125 115.833 80.633 115.475 82.400 116.800 L 128.000 151.000 L 173.600 116.800 C 175.367 115.475 177.875 115.833 179.200 117.600 C 180.525 119.367 180.167 121.875 178.400 123.200 Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
