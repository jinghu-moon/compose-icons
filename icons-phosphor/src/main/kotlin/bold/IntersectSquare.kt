package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IntersectSquare: ImageVector
    get() {
        if (_intersectSquare != null) return _intersectSquare!!
        _intersectSquare = phosphorBoldIcon(
            name = "IntersectSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 84.000 L 172.000 84.000 L 172.000 40.000 C 172.000 33.373 166.627 28.000 160.000 28.000 L 40.000 28.000 C 33.373 28.000 28.000 33.373 28.000 40.000 L 28.000 160.000 C 28.000 166.627 33.373 172.000 40.000 172.000 L 84.000 172.000 L 84.000 216.000 C 84.000 222.627 89.373 228.000 96.000 228.000 L 216.000 228.000 C 222.627 228.000 228.000 222.627 228.000 216.000 L 228.000 96.000 C 228.000 89.373 222.627 84.000 216.000 84.000 ZM 52.000 148.000 L 52.000 52.000 L 148.000 52.000 L 148.000 84.000 L 96.000 84.000 C 89.373 84.000 84.000 89.373 84.000 96.000 L 84.000 148.000 ZM 108.000 125.000 L 131.000 148.000 L 108.000 148.000 ZM 148.000 131.000 L 125.000 108.000 L 148.000 108.000 ZM 204.000 204.000 L 108.000 204.000 L 108.000 172.000 L 160.000 172.000 C 166.627 172.000 172.000 166.627 172.000 160.000 L 172.000 108.000 L 204.000 108.000 Z"),
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
        return _intersectSquare!!
    }

private var _intersectSquare: ImageVector? = null
