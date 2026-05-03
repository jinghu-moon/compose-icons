package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) return _starAndCrescent!!
        _starAndCrescent = phosphorFillIcon(
            name = "StarAndCrescent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 206.400 C 160.002 209.407 158.318 212.162 155.640 213.530 C 142.139 220.458 127.174 224.048 112.000 224.000 C 58.981 224.000 16.000 181.019 16.000 128.000 C 16.000 74.981 58.981 32.000 112.000 32.000 C 127.174 31.952 142.139 35.542 155.640 42.470 C 158.317 43.837 160.002 46.589 160.002 49.595 C 160.002 52.601 158.317 55.353 155.640 56.720 C 128.836 70.378 111.960 97.917 111.960 128.000 C 111.960 158.083 128.836 185.622 155.640 199.280 C 158.315 200.647 159.999 203.396 160.000 206.400 ZM 251.170 120.650 L 224.670 109.220 L 222.360 79.380 C 222.104 76.131 219.903 73.363 216.796 72.381 C 213.689 71.398 210.297 72.399 208.220 74.910 L 189.630 97.420 L 161.920 90.570 C 158.796 89.801 155.516 90.978 153.594 93.557 C 151.671 96.136 151.481 99.616 153.110 102.390 L 168.180 128.000 L 153.110 153.610 C 151.481 156.384 151.671 159.864 153.594 162.443 C 155.516 165.022 158.796 166.199 161.920 165.430 L 189.630 158.580 L 208.220 181.090 C 210.297 183.601 213.689 184.602 216.796 183.619 C 219.903 182.637 222.104 179.869 222.360 176.620 L 224.670 146.780 L 251.170 135.350 C 254.108 134.088 256.011 131.197 256.011 128.000 C 256.011 124.803 254.108 121.912 251.170 120.650 Z"),
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
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
