package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorThinIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 186.830 162.830 C 186.080 163.581 185.062 164.003 184.000 164.003 C 182.938 164.003 181.920 163.581 181.170 162.830 L 156.000 137.660 L 156.000 208.000 C 156.000 210.209 154.209 212.000 152.000 212.000 C 149.791 212.000 148.000 210.209 148.000 208.000 L 148.000 137.660 L 122.830 162.830 C 121.267 164.393 118.733 164.393 117.170 162.830 C 115.607 161.267 115.607 158.733 117.170 157.170 L 149.170 125.170 C 149.920 124.419 150.938 123.997 152.000 123.997 C 153.062 123.997 154.080 124.419 154.830 125.170 L 186.830 157.170 C 187.581 157.920 188.003 158.938 188.003 160.000 C 188.003 161.062 187.581 162.080 186.830 162.830 ZM 160.000 44.000 C 127.122 44.035 97.279 63.228 83.610 93.130 C 61.211 88.720 38.251 97.404 24.375 115.531 C 10.500 133.659 8.114 158.090 18.219 178.560 C 28.325 199.030 49.171 211.992 72.000 212.000 L 112.000 212.000 C 114.209 212.000 116.000 210.209 116.000 208.000 C 116.000 205.791 114.209 204.000 112.000 204.000 L 72.000 204.000 C 52.366 204.042 34.382 193.022 25.506 175.509 C 16.629 157.996 18.374 136.977 30.016 121.167 C 41.657 105.357 61.212 97.452 80.570 100.730 C 77.541 109.503 75.996 118.719 76.000 128.000 C 76.000 130.209 77.791 132.000 80.000 132.000 C 82.209 132.000 84.000 130.209 84.000 128.000 C 84.012 90.045 112.025 57.918 149.624 52.736 C 187.223 47.555 222.882 70.907 233.160 107.443 C 243.439 143.980 225.186 182.498 190.400 197.680 C 188.672 198.442 187.712 200.309 188.098 202.158 C 188.484 204.007 190.111 205.333 192.000 205.340 C 192.551 205.344 193.096 205.231 193.600 205.010 C 230.086 189.116 250.411 149.799 242.281 110.840 C 234.151 71.882 199.798 43.975 160.000 44.000 Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
