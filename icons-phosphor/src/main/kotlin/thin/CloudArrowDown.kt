package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorThinIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 128.000 C 244.052 146.184 238.152 163.885 227.200 178.400 C 225.875 180.167 223.367 180.525 221.600 179.200 C 219.833 177.875 219.475 175.367 220.800 173.600 C 240.640 147.146 241.099 110.900 221.934 83.953 C 202.770 57.006 168.381 45.543 136.881 55.602 C 105.381 65.661 84.000 94.933 84.000 128.000 C 84.000 130.209 82.209 132.000 80.000 132.000 C 77.791 132.000 76.000 130.209 76.000 128.000 C 75.996 118.719 77.541 109.503 80.570 100.730 C 61.212 97.452 41.657 105.357 30.016 121.167 C 18.374 136.977 16.629 157.996 25.506 175.509 C 34.382 193.022 52.366 204.042 72.000 204.000 L 96.000 204.000 C 98.209 204.000 100.000 205.791 100.000 208.000 C 100.000 210.209 98.209 212.000 96.000 212.000 L 72.000 212.000 C 49.171 211.992 28.325 199.030 18.219 178.560 C 8.114 158.090 10.500 133.659 24.375 115.531 C 38.251 97.404 61.211 88.720 83.610 93.130 C 100.034 57.217 139.257 37.595 177.845 45.984 C 216.434 54.374 243.969 88.510 244.000 128.000 ZM 181.170 173.170 L 156.000 198.340 L 156.000 128.000 C 156.000 125.791 154.209 124.000 152.000 124.000 C 149.791 124.000 148.000 125.791 148.000 128.000 L 148.000 198.340 L 122.830 173.170 C 121.267 171.607 118.733 171.607 117.170 173.170 C 115.607 174.733 115.607 177.267 117.170 178.830 L 149.170 210.830 C 149.920 211.581 150.938 212.003 152.000 212.003 C 153.062 212.003 154.080 211.581 154.830 210.830 L 186.830 178.830 C 188.393 177.267 188.393 174.733 186.830 173.170 C 185.267 171.607 182.733 171.607 181.170 173.170 Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
