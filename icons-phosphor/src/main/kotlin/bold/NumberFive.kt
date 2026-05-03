package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberFive: ImageVector
    get() {
        if (_numberFive != null) return _numberFive!!
        _numberFive = phosphorBoldIcon(
            name = "NumberFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 160.000 C 179.999 183.661 166.094 205.112 144.494 214.771 C 122.895 224.430 97.636 220.494 80.000 204.720 C 76.690 201.893 75.171 197.495 76.030 193.227 C 76.889 188.960 79.992 185.492 84.138 184.166 C 88.285 182.840 92.824 183.863 96.000 186.840 C 110.345 199.664 132.239 198.940 145.706 185.196 C 159.173 171.452 159.451 149.548 146.338 135.467 C 133.225 121.385 111.357 120.105 96.690 132.560 C 92.798 135.868 87.239 136.350 82.836 133.761 C 78.433 131.172 76.151 126.079 77.150 121.070 L 92.230 45.650 C 93.351 40.038 98.278 35.999 104.000 36.000 L 168.000 36.000 C 174.627 36.000 180.000 41.373 180.000 48.000 C 180.000 54.627 174.627 60.000 168.000 60.000 L 113.840 60.000 L 105.480 101.790 C 123.400 97.320 142.380 101.353 156.935 112.722 C 171.490 124.092 179.998 141.531 180.000 160.000 Z"),
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
        return _numberFive!!
    }

private var _numberFive: ImageVector? = null
