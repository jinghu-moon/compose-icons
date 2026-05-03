package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorFillIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.000 120.000 L 216.000 120.000 C 223.614 120.003 230.175 114.640 231.688 107.178 C 233.200 99.716 229.244 92.222 222.230 89.260 L 222.090 89.200 L 62.160 25.200 C 57.216 23.138 51.568 23.686 47.114 26.661 C 42.659 29.636 39.989 34.643 40.000 40.000 L 40.000 104.000 C 40.000 112.837 47.163 120.000 56.000 120.000 ZM 56.000 40.000 L 56.150 40.060 L 216.000 104.000 L 56.000 104.000 L 56.000 40.000 ZM 231.670 148.820 C 233.247 156.290 229.275 163.822 222.220 166.740 L 222.080 166.800 L 62.150 230.800 C 57.207 232.858 51.563 232.307 47.111 229.333 C 42.659 226.358 39.990 221.354 40.000 216.000 L 40.000 152.000 C 40.000 143.163 47.163 136.000 56.000 136.000 L 216.000 136.000 C 223.628 135.946 230.212 141.333 231.670 148.820 Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
