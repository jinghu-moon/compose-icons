package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorRegularIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 56.000 120.000 L 216.000 120.000 C 223.614 120.003 230.175 114.640 231.688 107.178 C 233.200 99.716 229.244 92.222 222.230 89.260 L 222.090 89.200 L 62.160 25.200 C 57.216 23.138 51.568 23.686 47.114 26.661 C 42.659 29.636 39.989 34.643 40.000 40.000 L 40.000 104.000 C 40.000 112.837 47.163 120.000 56.000 120.000 ZM 56.000 40.000 L 56.150 40.060 L 216.000 104.000 L 56.000 104.000 L 56.000 40.000 ZM 216.000 136.000 L 56.000 136.000 C 47.163 136.000 40.000 143.163 40.000 152.000 L 40.000 216.000 C 39.997 221.351 42.669 226.348 47.119 229.318 C 51.570 232.288 57.211 232.837 62.150 230.780 L 222.080 166.780 L 222.220 166.720 C 229.206 163.744 233.138 156.267 231.631 148.825 C 230.124 141.382 223.594 136.024 216.000 136.000 ZM 56.150 215.930 L 56.000 216.000 L 56.000 152.000 L 216.000 152.000 Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
