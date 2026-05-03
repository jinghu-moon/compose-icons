package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorThinIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 171.000 50.370 C 158.861 36.349 145.200 23.722 130.270 12.720 C 128.894 11.759 127.066 11.759 125.690 12.720 C 110.774 23.724 97.127 36.351 85.000 50.370 C 58.170 81.210 44.000 113.580 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 C 174.392 228.000 212.000 190.392 212.000 144.000 C 212.000 113.580 197.830 81.210 171.000 50.370 ZM 204.000 144.000 C 203.987 148.020 203.653 152.033 203.000 156.000 L 132.000 156.000 L 132.000 132.000 L 203.210 132.000 C 203.731 135.979 203.995 139.987 204.000 144.000 ZM 190.140 92.000 L 132.000 92.000 L 132.000 68.000 L 175.000 68.000 C 180.682 75.581 185.745 83.607 190.140 92.000 ZM 132.000 164.000 L 201.310 164.000 C 198.956 172.610 195.096 180.735 189.910 188.000 L 132.000 188.000 ZM 132.000 124.000 L 132.000 100.000 L 194.000 100.000 C 197.463 107.701 200.105 115.745 201.880 124.000 ZM 165.100 55.770 Q 166.870 57.770 168.690 60.000 L 132.000 60.000 L 132.000 24.070 C 143.957 33.628 155.035 44.237 165.100 55.770 ZM 52.000 144.000 C 52.000 108.100 73.150 76.200 90.900 55.770 C 100.965 44.237 112.043 33.628 124.000 24.070 L 124.000 219.890 C 83.659 217.718 52.048 184.399 52.000 144.000 ZM 132.000 219.890 L 132.000 196.000 L 183.350 196.000 C 169.964 210.300 151.561 218.862 132.000 219.890 Z"),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
