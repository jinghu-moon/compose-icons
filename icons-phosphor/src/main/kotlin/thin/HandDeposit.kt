package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorThinIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 124.000 25.660 L 124.000 128.000 C 124.000 130.209 122.209 132.000 120.000 132.000 C 117.791 132.000 116.000 130.209 116.000 128.000 L 116.000 25.660 L 90.830 50.830 C 89.267 52.393 86.733 52.393 85.170 50.830 C 83.607 49.267 83.607 46.733 85.170 45.170 L 117.170 13.170 C 117.920 12.419 118.938 11.997 120.000 11.997 C 121.062 11.997 122.080 12.419 122.830 13.170 L 154.830 45.170 C 156.393 46.733 156.393 49.267 154.830 50.830 C 153.267 52.393 150.733 52.393 149.170 50.830 ZM 188.000 125.780 L 188.000 96.000 C 188.000 89.373 182.627 84.000 176.000 84.000 L 160.000 84.000 C 157.791 84.000 156.000 85.791 156.000 88.000 C 156.000 90.209 157.791 92.000 160.000 92.000 L 176.000 92.000 C 178.209 92.000 180.000 93.791 180.000 96.000 L 180.000 188.900 L 176.730 183.900 C 170.029 172.539 155.415 168.715 144.008 175.338 C 132.601 181.961 128.676 196.548 135.220 208.000 C 135.254 208.067 135.294 208.130 135.340 208.190 L 157.600 242.190 C 158.361 243.434 159.739 244.165 161.195 244.098 C 162.652 244.031 163.957 243.177 164.601 241.868 C 165.245 240.560 165.126 239.005 164.290 237.810 L 142.090 203.910 C 137.697 196.242 140.352 186.463 148.020 182.070 C 155.688 177.677 165.467 180.332 169.860 188.000 L 169.980 188.190 L 180.650 204.500 C 181.618 205.983 183.445 206.653 185.142 206.148 C 186.839 205.642 188.002 204.081 188.000 202.310 L 188.000 135.470 C 208.059 150.283 219.926 173.714 220.000 198.650 L 220.000 240.000 C 220.000 242.209 221.791 244.000 224.000 244.000 C 226.209 244.000 228.000 242.209 228.000 240.000 L 228.000 198.650 C 227.913 169.142 212.848 141.696 188.000 125.780 ZM 80.000 84.000 L 64.000 84.000 C 57.373 84.000 52.000 89.373 52.000 96.000 L 52.000 200.000 C 52.000 202.209 53.791 204.000 56.000 204.000 C 58.209 204.000 60.000 202.209 60.000 200.000 L 60.000 96.000 C 60.000 93.791 61.791 92.000 64.000 92.000 L 80.000 92.000 C 82.209 92.000 84.000 90.209 84.000 88.000 C 84.000 85.791 82.209 84.000 80.000 84.000 Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
