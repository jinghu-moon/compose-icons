package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberThree: ImageVector
    get() {
        if (_numberThree != null) return _numberThree!!
        _numberThree = phosphorBoldIcon(
            name = "NumberThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 160.000 C 179.999 183.661 166.094 205.112 144.494 214.771 C 122.895 224.430 97.636 220.494 80.000 204.720 C 76.690 201.893 75.171 197.495 76.030 193.227 C 76.889 188.960 79.992 185.492 84.138 184.166 C 88.285 182.840 92.824 183.863 96.000 186.840 C 107.961 197.532 125.554 199.019 139.140 190.485 C 152.726 181.952 159.025 165.458 154.587 150.041 C 150.148 134.623 136.044 124.004 120.000 124.000 C 115.455 124.000 111.300 121.432 109.267 117.367 C 107.234 113.301 107.673 108.436 110.400 104.800 L 144.000 60.000 L 88.000 60.000 C 81.373 60.000 76.000 54.627 76.000 48.000 C 76.000 41.373 81.373 36.000 88.000 36.000 L 168.000 36.000 C 172.545 36.000 176.700 38.568 178.733 42.633 C 180.766 46.699 180.327 51.564 177.600 55.200 L 141.120 103.840 C 164.490 112.663 179.968 135.020 180.000 160.000 Z"),
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
        return _numberThree!!
    }

private var _numberThree: ImageVector? = null
