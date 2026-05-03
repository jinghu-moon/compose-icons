package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SquareSplitVertical: ImageVector
    get() {
        if (_squareSplitVertical != null) return _squareSplitVertical!!
        _squareSplitVertical = phosphorThinIcon(
            name = "SquareSplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 44.000 L 56.000 44.000 C 49.373 44.000 44.000 49.373 44.000 56.000 L 44.000 200.000 C 44.000 206.627 49.373 212.000 56.000 212.000 L 200.000 212.000 C 206.627 212.000 212.000 206.627 212.000 200.000 L 212.000 56.000 C 212.000 49.373 206.627 44.000 200.000 44.000 ZM 56.000 52.000 L 200.000 52.000 C 202.209 52.000 204.000 53.791 204.000 56.000 L 204.000 124.000 L 52.000 124.000 L 52.000 56.000 C 52.000 53.791 53.791 52.000 56.000 52.000 ZM 200.000 204.000 L 56.000 204.000 C 53.791 204.000 52.000 202.209 52.000 200.000 L 52.000 132.000 L 204.000 132.000 L 204.000 200.000 C 204.000 202.209 202.209 204.000 200.000 204.000 Z"),
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
        return _squareSplitVertical!!
    }

private var _squareSplitVertical: ImageVector? = null
