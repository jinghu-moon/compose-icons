package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorBoldIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.480 136.490 L 130.420 218.490 C 106.981 241.921 68.986 241.914 45.555 218.475 C 22.124 195.036 22.131 157.041 45.570 133.610 L 143.730 35.720 C 159.357 20.101 184.686 20.108 200.305 35.735 C 215.924 51.362 215.917 76.691 200.290 92.310 L 200.120 92.470 L 104.320 184.690 C 99.543 189.285 91.945 189.137 87.350 184.360 C 82.755 179.583 82.903 171.985 87.680 167.390 L 183.390 75.270 C 189.620 69.002 189.588 58.870 183.320 52.640 C 177.052 46.410 166.920 46.442 160.690 52.710 L 62.530 150.570 C 48.472 164.634 48.476 187.432 62.540 201.490 C 76.604 215.548 99.402 215.544 113.460 201.480 L 195.520 119.480 C 200.214 114.786 207.826 114.786 212.520 119.480 C 217.214 124.174 217.214 131.786 212.520 136.480 Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
