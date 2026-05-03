package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorBoldIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 252.000 128.000 C 251.961 161.121 225.121 187.961 192.000 188.000 L 44.000 188.000 C 21.909 188.000 4.000 170.091 4.000 148.000 C 4.000 125.909 21.909 108.000 44.000 108.000 L 184.000 108.000 C 190.627 108.000 196.000 113.373 196.000 120.000 C 196.000 126.627 190.627 132.000 184.000 132.000 L 44.000 132.000 C 35.163 132.000 28.000 139.163 28.000 148.000 C 28.000 156.837 35.163 164.000 44.000 164.000 L 192.000 164.000 C 211.882 164.000 228.000 147.882 228.000 128.000 C 228.000 108.118 211.882 92.000 192.000 92.000 L 80.000 92.000 C 73.373 92.000 68.000 86.627 68.000 80.000 C 68.000 73.373 73.373 68.000 80.000 68.000 L 192.000 68.000 C 225.121 68.039 251.961 94.879 252.000 128.000 Z"),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
