package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.IntersectSquare: ImageVector
    get() {
        if (_intersectSquare != null) return _intersectSquare!!
        _intersectSquare = phosphorFillIcon(
            name = "IntersectSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 88.000 L 168.000 88.000 L 168.000 40.000 C 168.000 35.582 164.418 32.000 160.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 160.000 C 32.000 164.418 35.582 168.000 40.000 168.000 L 88.000 168.000 L 88.000 216.000 C 88.000 220.418 91.582 224.000 96.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 96.000 C 224.000 91.582 220.418 88.000 216.000 88.000 ZM 48.000 152.000 L 48.000 48.000 L 152.000 48.000 L 152.000 88.000 L 96.000 88.000 C 91.582 88.000 88.000 91.582 88.000 96.000 L 88.000 152.000 ZM 208.000 208.000 L 104.000 208.000 L 104.000 168.000 L 160.000 168.000 C 164.418 168.000 168.000 164.418 168.000 160.000 L 168.000 104.000 L 208.000 104.000 Z"),
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
        return _intersectSquare!!
    }

private var _intersectSquare: ImageVector? = null
