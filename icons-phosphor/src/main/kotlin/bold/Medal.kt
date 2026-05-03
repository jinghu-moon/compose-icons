package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorBoldIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 96.000 C 220.024 53.498 190.930 16.511 149.618 6.524 C 108.306 -3.464 65.529 16.149 46.136 53.969 C 26.742 91.789 35.780 137.971 68.000 165.690 L 68.000 240.000 C 68.000 244.159 70.155 248.022 73.693 250.208 C 77.232 252.394 81.650 252.591 85.370 250.730 L 128.000 229.420 L 170.640 250.730 C 174.359 252.587 178.774 252.386 182.309 250.201 C 185.845 248.016 187.998 244.156 188.000 240.000 L 188.000 165.690 C 208.317 148.236 220.003 122.784 220.000 96.000 ZM 60.000 96.000 C 60.000 58.445 90.445 28.000 128.000 28.000 C 165.555 28.000 196.000 58.445 196.000 96.000 C 196.000 133.555 165.555 164.000 128.000 164.000 C 90.461 163.961 60.039 133.539 60.000 96.000 ZM 164.000 220.590 L 133.360 205.270 C 129.980 203.579 126.000 203.579 122.620 205.270 L 92.000 220.580 L 92.000 180.660 C 115.003 190.441 140.997 190.441 164.000 180.660 ZM 128.000 148.000 C 156.719 148.000 180.000 124.719 180.000 96.000 C 180.000 67.281 156.719 44.000 128.000 44.000 C 99.281 44.000 76.000 67.281 76.000 96.000 C 76.033 124.705 99.295 147.967 128.000 148.000 ZM 128.000 68.000 C 143.464 68.000 156.000 80.536 156.000 96.000 C 156.000 111.464 143.464 124.000 128.000 124.000 C 112.536 124.000 100.000 111.464 100.000 96.000 C 100.000 80.536 112.536 68.000 128.000 68.000 Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
