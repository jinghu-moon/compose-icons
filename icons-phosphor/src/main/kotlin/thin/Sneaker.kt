package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sneaker: ImageVector
    get() {
        if (_sneaker != null) return _sneaker!!
        _sneaker = phosphorThinIcon(
            name = "Sneaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.380 132.910 L 166.660 112.670 C 159.233 110.176 153.191 104.685 150.000 97.530 L 126.690 43.120 C 124.128 37.359 117.545 34.563 111.620 36.720 L 35.900 64.250 C 31.157 65.974 27.999 70.483 28.000 75.530 L 28.000 192.000 C 28.000 198.627 33.373 204.000 40.000 204.000 L 240.000 204.000 C 246.627 204.000 252.000 198.627 252.000 192.000 L 252.000 167.060 C 251.998 151.564 242.081 137.808 227.380 132.910 ZM 38.630 71.770 L 114.350 44.240 C 114.788 44.077 115.253 43.996 115.720 44.000 C 117.279 44.000 118.695 44.905 119.350 46.320 L 128.170 67.000 L 102.630 76.290 C 100.873 76.996 99.851 78.837 100.182 80.702 C 100.514 82.566 102.107 83.943 104.000 84.000 C 104.467 83.998 104.930 83.917 105.370 83.760 L 131.320 74.320 L 139.210 92.760 L 118.630 100.240 C 116.804 100.903 115.718 102.782 116.056 104.695 C 116.393 106.609 118.057 108.003 120.000 108.000 C 120.467 107.998 120.930 107.917 121.370 107.760 L 142.370 100.120 L 142.620 100.720 C 145.496 107.162 150.196 112.620 156.140 116.420 L 134.640 124.240 C 132.815 124.902 131.730 126.779 132.065 128.691 C 132.400 130.602 134.059 131.998 136.000 132.000 C 136.467 131.998 136.930 131.917 137.370 131.760 L 166.670 121.100 L 224.850 140.500 C 235.230 143.950 242.650 153.128 243.850 164.000 L 36.000 164.000 L 36.000 75.530 C 35.999 73.848 37.050 72.346 38.630 71.770 ZM 240.000 196.000 L 40.000 196.000 C 37.791 196.000 36.000 194.209 36.000 192.000 L 36.000 172.000 L 244.000 172.000 L 244.000 192.000 C 244.000 194.209 242.209 196.000 240.000 196.000 Z"),
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
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null
