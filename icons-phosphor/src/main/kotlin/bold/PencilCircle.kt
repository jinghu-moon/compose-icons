package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) return _pencilCircle!!
        _pencilCircle = phosphorBoldIcon(
            name = "PencilCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.370 51.600 C 167.920 15.125 110.780 9.480 67.897 38.117 C 25.015 66.755 8.335 121.697 28.060 169.341 C 47.785 216.985 98.419 244.059 148.995 234.004 C 199.571 223.949 235.999 179.565 236.000 128.000 C 235.999 99.348 224.623 71.868 204.370 51.600 ZM 92.000 200.000 C 92.000 193.373 97.373 188.000 104.000 188.000 C 110.627 188.000 116.000 193.373 116.000 200.000 L 116.000 211.110 C 107.683 209.920 99.593 207.486 92.000 203.890 ZM 140.000 200.000 C 140.000 193.373 145.373 188.000 152.000 188.000 C 158.627 188.000 164.000 193.373 164.000 200.000 L 164.000 203.890 C 156.407 207.486 148.317 209.920 140.000 211.110 ZM 106.140 148.000 L 149.860 148.000 L 157.430 164.420 C 146.798 162.804 136.000 166.032 128.000 173.220 C 119.998 166.036 109.201 162.811 98.570 164.430 ZM 117.220 124.000 L 128.000 100.620 L 138.780 124.000 ZM 188.000 186.790 L 188.000 176.000 C 187.993 174.274 187.618 172.570 186.900 171.000 L 138.900 67.000 C 136.941 62.745 132.684 60.019 128.000 60.019 C 123.316 60.019 119.059 62.745 117.100 67.000 L 69.100 171.000 C 68.382 172.570 68.007 174.274 68.000 176.000 L 68.000 186.770 C 35.688 153.792 36.048 100.919 68.805 68.384 C 101.563 35.848 154.437 35.848 187.195 68.384 C 219.952 100.919 220.312 153.792 188.000 186.770 Z"),
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
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
