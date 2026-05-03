package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorFillIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.310 73.370 L 182.630 28.680 C 179.629 25.679 175.559 23.992 171.315 23.992 C 167.071 23.992 163.001 25.679 160.000 28.680 L 36.690 152.000 C 33.676 154.990 31.986 159.064 32.000 163.310 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 92.690 224.000 C 96.936 224.014 101.010 222.324 104.000 219.310 L 227.310 96.000 C 230.311 92.999 231.998 88.929 231.998 84.685 C 231.998 80.441 230.311 76.371 227.310 73.370 ZM 192.000 108.680 L 147.310 64.000 L 171.310 40.000 L 216.000 84.680 Z"),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
