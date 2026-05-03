package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Swatches: ImageVector
    get() {
        if (_swatches != null) return _swatches!!
        _swatches = phosphorFillIcon(
            name = "Swatches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 155.910 C 239.960 154.126 239.622 152.362 239.000 150.690 L 219.940 98.480 C 216.884 90.240 207.753 86.007 199.490 89.000 L 131.680 113.570 L 143.760 44.570 C 145.318 35.875 139.535 27.562 130.840 26.000 L 76.170 16.250 C 71.996 15.516 67.701 16.475 64.235 18.914 C 60.769 21.354 58.418 25.073 57.700 29.250 L 32.700 172.370 C 30.386 185.144 33.856 198.286 42.173 208.254 C 50.490 218.222 62.798 223.989 75.780 224.000 L 224.000 224.000 C 232.837 224.000 240.000 216.837 240.000 208.000 ZM 76.000 196.000 C 67.163 196.000 60.000 188.837 60.000 180.000 C 60.000 171.163 67.163 164.000 76.000 164.000 C 84.837 164.000 92.000 171.163 92.000 180.000 C 92.000 188.837 84.837 196.000 76.000 196.000 ZM 118.720 187.620 L 128.500 131.700 L 204.920 104.000 L 224.000 156.110 L 116.780 195.000 C 117.635 192.600 118.284 190.131 118.720 187.620 ZM 224.000 208.000 L 127.740 208.000 L 224.000 173.110 Z"),
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
        return _swatches!!
    }

private var _swatches: ImageVector? = null
