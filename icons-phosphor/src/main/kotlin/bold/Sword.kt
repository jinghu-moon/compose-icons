package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorBoldIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 28.000 L 152.000 28.000 C 148.378 27.999 144.949 29.635 142.670 32.450 L 79.500 110.510 L 74.840 105.860 C 71.089 102.108 66.001 99.999 60.695 99.999 C 55.389 99.999 50.301 102.108 46.550 105.860 L 29.860 122.550 C 26.108 126.301 23.999 131.389 23.999 136.695 C 23.999 142.001 26.108 147.089 29.860 150.840 L 29.860 150.840 L 45.000 166.000 L 23.860 187.170 C 16.052 194.980 16.052 207.640 23.860 215.450 L 40.550 232.140 C 48.360 239.948 61.020 239.948 68.830 232.140 L 90.000 211.000 L 105.170 226.160 C 108.921 229.912 114.009 232.021 119.315 232.021 C 124.621 232.021 129.709 229.912 133.460 226.160 L 150.150 209.470 C 153.906 205.719 156.016 200.628 156.016 195.320 C 156.016 190.012 153.906 184.921 150.150 181.170 L 145.500 176.520 L 223.560 113.350 C 226.377 111.065 228.009 107.628 228.000 104.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 ZM 54.690 212.340 L 43.690 201.340 L 62.000 183.000 L 73.000 194.000 ZM 119.300 206.340 L 49.650 136.700 L 60.700 125.700 L 130.350 195.350 ZM 204.000 98.270 L 128.420 159.440 L 121.000 152.000 L 168.510 104.500 C 173.204 99.806 173.204 92.194 168.510 87.500 C 163.816 82.806 156.204 82.806 151.510 87.500 L 104.000 135.000 L 96.550 127.560 L 157.730 52.000 L 204.000 52.000 Z"),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
