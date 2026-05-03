package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorBoldIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.000 147.270 L 203.000 35.270 C 201.112 30.869 196.789 28.011 192.000 28.000 L 64.000 28.000 C 59.211 28.011 54.888 30.869 53.000 35.270 L 5.000 147.270 C 3.412 150.973 3.788 155.226 6.002 158.593 C 8.215 161.959 11.971 163.990 16.000 164.000 L 116.000 164.000 L 116.000 204.000 L 96.000 204.000 C 89.373 204.000 84.000 209.373 84.000 216.000 C 84.000 222.627 89.373 228.000 96.000 228.000 L 160.000 228.000 C 166.627 228.000 172.000 222.627 172.000 216.000 C 172.000 209.373 166.627 204.000 160.000 204.000 L 140.000 204.000 L 140.000 164.000 L 188.000 164.000 L 188.000 192.000 C 188.000 198.627 193.373 204.000 200.000 204.000 C 206.627 204.000 212.000 198.627 212.000 192.000 L 212.000 164.000 L 240.000 164.000 C 244.029 163.990 247.785 161.959 249.998 158.593 C 252.212 155.226 252.588 150.973 251.000 147.270 ZM 34.200 140.000 L 71.910 52.000 L 184.090 52.000 L 221.800 140.000 Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
