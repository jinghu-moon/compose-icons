package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorLightIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 106.000 L 213.770 106.000 C 210.477 61.063 173.058 26.285 128.000 26.285 C 82.942 26.285 45.523 61.063 42.230 106.000 L 32.000 106.000 C 28.686 106.000 26.000 108.686 26.000 112.000 C 26.073 150.465 47.705 185.641 82.000 203.060 L 82.000 208.000 C 82.000 215.732 88.268 222.000 96.000 222.000 L 160.000 222.000 C 167.732 222.000 174.000 215.732 174.000 208.000 L 174.000 203.060 C 208.295 185.641 229.927 150.465 230.000 112.000 C 230.000 108.686 227.314 106.000 224.000 106.000 ZM 174.240 54.290 C 177.143 56.615 179.868 59.156 182.390 61.890 C 159.881 68.896 141.242 84.845 130.840 106.000 L 97.340 106.000 C 107.037 75.115 135.629 54.074 168.000 54.000 C 170.080 54.000 172.170 54.110 174.240 54.290 ZM 190.300 72.140 C 196.842 82.313 200.771 93.944 201.740 106.000 L 144.480 106.000 C 154.613 89.042 171.114 76.848 190.300 72.140 ZM 128.000 38.000 C 137.167 37.985 146.255 39.681 154.800 43.000 C 121.080 48.323 93.665 73.018 84.860 106.000 L 54.260 106.000 C 57.426 67.611 89.481 38.052 128.000 38.000 ZM 165.500 193.840 C 163.365 194.818 161.998 196.952 162.000 199.300 L 162.000 208.000 C 162.000 209.105 161.105 210.000 160.000 210.000 L 96.000 210.000 C 94.895 210.000 94.000 209.105 94.000 208.000 L 94.000 199.300 C 94.002 196.952 92.635 194.818 90.500 193.840 C 60.520 180.014 40.468 150.937 38.200 118.000 L 217.800 118.000 C 215.532 150.937 195.480 180.014 165.500 193.840 Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
