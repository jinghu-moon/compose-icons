package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorThinIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 208.000 C 172.000 210.209 170.209 212.000 168.000 212.000 L 88.000 212.000 C 86.485 212.000 85.100 211.144 84.422 209.789 C 83.745 208.434 83.891 206.812 84.800 205.600 L 156.740 109.680 C 164.641 99.420 166.423 85.707 161.406 73.769 C 156.389 61.831 145.347 53.507 132.489 51.970 C 119.632 50.433 106.939 55.920 99.250 66.340 C 97.558 68.592 96.132 71.031 95.000 73.610 C 94.114 75.634 91.754 76.556 89.730 75.670 C 87.706 74.784 86.784 72.424 87.670 70.400 C 89.054 67.252 90.799 64.275 92.870 61.530 C 107.506 42.123 135.103 38.254 154.510 52.890 C 173.917 67.526 177.786 95.123 163.150 114.530 L 96.000 204.000 L 168.000 204.000 C 170.209 204.000 172.000 205.791 172.000 208.000 Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
