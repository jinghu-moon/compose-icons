package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorFillIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 167.840 108.350 C 169.374 125.125 160.235 141.063 144.983 148.213 C 129.730 155.362 111.633 152.189 99.722 140.278 C 87.811 128.367 84.638 110.270 91.787 95.017 C 98.937 79.765 114.875 70.626 131.650 72.160 C 150.862 73.917 166.083 89.138 167.840 108.350 ZM 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 ZM 184.000 112.000 C 184.003 82.111 160.533 57.488 130.679 56.058 C 100.824 54.629 75.109 76.897 72.256 106.649 C 69.403 136.401 90.418 163.150 120.000 167.420 L 120.000 199.730 C 119.947 204.011 123.205 207.609 127.470 207.980 C 129.682 208.127 131.856 207.349 133.473 205.833 C 135.090 204.316 136.005 202.197 136.000 199.980 L 136.000 167.420 C 163.530 163.407 183.959 139.821 184.000 112.000 Z"),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
