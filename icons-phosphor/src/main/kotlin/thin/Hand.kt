package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorThinIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 52.000 C 182.092 51.996 176.392 54.179 172.000 58.130 L 172.000 44.000 C 171.983 31.108 161.784 20.532 148.901 20.048 C 136.018 19.565 125.054 29.345 124.070 42.200 C 117.031 35.854 106.917 34.245 98.257 38.092 C 89.596 41.940 84.010 50.523 84.000 60.000 L 84.000 138.000 L 72.750 119.940 C 66.145 108.447 51.473 104.485 39.980 111.090 C 28.487 117.695 24.525 132.367 31.130 143.860 C 64.440 214.120 82.170 236.000 128.000 236.000 C 174.371 235.950 211.950 198.371 212.000 152.000 L 212.000 76.000 C 212.000 62.745 201.255 52.000 188.000 52.000 ZM 204.000 152.000 C 203.950 193.953 169.953 227.950 128.000 228.000 C 90.710 228.000 74.410 216.490 38.290 140.290 L 38.140 140.000 C 33.854 132.361 36.507 122.695 44.093 118.315 C 51.679 113.935 61.377 116.469 65.850 124.000 C 65.877 124.038 65.900 124.078 65.920 124.120 L 84.600 154.120 C 85.543 155.641 87.381 156.351 89.102 155.858 C 90.822 155.365 92.006 153.790 92.000 152.000 L 92.000 60.000 C 92.000 51.163 99.163 44.000 108.000 44.000 C 116.837 44.000 124.000 51.163 124.000 60.000 L 124.000 120.000 C 124.000 122.209 125.791 124.000 128.000 124.000 C 130.209 124.000 132.000 122.209 132.000 120.000 L 132.000 44.000 C 132.000 35.163 139.163 28.000 148.000 28.000 C 156.837 28.000 164.000 35.163 164.000 44.000 L 164.000 120.000 C 164.000 122.209 165.791 124.000 168.000 124.000 C 170.209 124.000 172.000 122.209 172.000 120.000 L 172.000 76.000 C 172.000 67.163 179.163 60.000 188.000 60.000 C 196.837 60.000 204.000 67.163 204.000 76.000 Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
