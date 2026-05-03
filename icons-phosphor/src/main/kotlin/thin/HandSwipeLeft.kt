package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandSwipeLeft: ImageVector
    get() {
        if (_handSwipeLeft != null) return _handSwipeLeft!!
        _handSwipeLeft = phosphorThinIcon(
            name = "HandSwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 140.000 L 212.000 176.000 C 212.000 200.660 203.920 217.100 203.580 217.790 C 202.591 219.767 200.187 220.569 198.210 219.580 C 196.233 218.591 195.431 216.187 196.420 214.210 C 196.490 214.060 204.000 198.660 204.000 176.000 L 204.000 140.000 C 204.000 131.163 196.837 124.000 188.000 124.000 C 179.163 124.000 172.000 131.163 172.000 140.000 L 172.000 144.000 C 172.000 146.209 170.209 148.000 168.000 148.000 C 165.791 148.000 164.000 146.209 164.000 144.000 L 164.000 124.000 C 164.000 115.163 156.837 108.000 148.000 108.000 C 139.163 108.000 132.000 115.163 132.000 124.000 L 132.000 136.000 C 132.000 138.209 130.209 140.000 128.000 140.000 C 125.791 140.000 124.000 138.209 124.000 136.000 L 124.000 68.000 C 124.000 59.163 116.837 52.000 108.000 52.000 C 99.163 52.000 92.000 59.163 92.000 68.000 L 92.000 176.000 C 91.994 177.781 90.811 179.344 89.098 179.833 C 87.385 180.322 85.555 179.620 84.610 178.110 L 65.930 148.110 C 65.903 148.072 65.880 148.032 65.860 147.990 C 61.442 140.335 51.655 137.712 44.000 142.130 C 36.345 146.548 33.722 156.335 38.140 163.990 L 67.450 213.990 C 68.353 215.873 67.656 218.133 65.850 219.180 C 64.043 220.228 61.735 219.709 60.550 217.990 L 31.220 168.000 C 24.568 156.535 28.470 141.847 39.935 135.195 C 51.400 128.543 66.088 132.445 72.740 143.910 L 84.000 162.000 L 84.000 68.000 C 84.000 54.745 94.745 44.000 108.000 44.000 C 121.255 44.000 132.000 54.745 132.000 68.000 L 132.000 106.130 C 138.807 100.035 148.485 98.334 156.963 101.743 C 165.440 105.152 171.247 113.079 171.940 122.190 C 178.981 115.850 189.092 114.245 197.750 118.094 C 206.407 121.943 211.990 130.525 212.000 140.000 ZM 248.000 52.000 L 185.650 52.000 L 210.830 26.830 C 212.393 25.267 212.393 22.733 210.830 21.170 C 209.267 19.607 206.733 19.607 205.170 21.170 L 173.170 53.170 C 172.419 53.920 171.997 54.938 171.997 56.000 C 171.997 57.062 172.419 58.080 173.170 58.830 L 205.170 90.830 C 206.733 92.393 209.267 92.393 210.830 90.830 C 212.393 89.267 212.393 86.733 210.830 85.170 L 185.650 60.000 L 248.000 60.000 C 250.209 60.000 252.000 58.209 252.000 56.000 C 252.000 53.791 250.209 52.000 248.000 52.000 Z"),
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
        return _handSwipeLeft!!
    }

private var _handSwipeLeft: ImageVector? = null
