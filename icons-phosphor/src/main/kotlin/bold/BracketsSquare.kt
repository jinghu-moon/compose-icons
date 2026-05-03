package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsSquare: ImageVector
    get() {
        if (_bracketsSquare != null) return _bracketsSquare!!
        _bracketsSquare = phosphorBoldIcon(
            name = "BracketsSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 52.000 52.000 L 52.000 204.000 L 80.000 204.000 C 86.627 204.000 92.000 209.373 92.000 216.000 C 92.000 222.627 86.627 228.000 80.000 228.000 L 40.000 228.000 C 33.373 228.000 28.000 222.627 28.000 216.000 L 28.000 40.000 C 28.000 33.373 33.373 28.000 40.000 28.000 L 80.000 28.000 C 86.627 28.000 92.000 33.373 92.000 40.000 C 92.000 46.627 86.627 52.000 80.000 52.000 ZM 216.000 28.000 L 176.000 28.000 C 169.373 28.000 164.000 33.373 164.000 40.000 C 164.000 46.627 169.373 52.000 176.000 52.000 L 204.000 52.000 L 204.000 204.000 L 176.000 204.000 C 169.373 204.000 164.000 209.373 164.000 216.000 C 164.000 222.627 169.373 228.000 176.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 40.000 C 228.000 33.373 222.627 28.000 216.000 28.000 Z"),
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
        return _bracketsSquare!!
    }

private var _bracketsSquare: ImageVector? = null
