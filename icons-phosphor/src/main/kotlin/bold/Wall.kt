package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorBoldIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 44.000 L 32.000 44.000 C 25.373 44.000 20.000 49.373 20.000 56.000 L 20.000 200.000 C 20.000 206.627 25.373 212.000 32.000 212.000 L 224.000 212.000 C 230.627 212.000 236.000 206.627 236.000 200.000 L 236.000 56.000 C 236.000 49.373 230.627 44.000 224.000 44.000 ZM 92.000 140.000 L 92.000 116.000 L 164.000 116.000 L 164.000 140.000 ZM 44.000 140.000 L 44.000 116.000 L 68.000 116.000 L 68.000 140.000 ZM 188.000 116.000 L 212.000 116.000 L 212.000 140.000 L 188.000 140.000 ZM 212.000 92.000 L 140.000 92.000 L 140.000 68.000 L 212.000 68.000 ZM 116.000 68.000 L 116.000 92.000 L 44.000 92.000 L 44.000 68.000 ZM 44.000 164.000 L 116.000 164.000 L 116.000 188.000 L 44.000 188.000 ZM 140.000 188.000 L 140.000 164.000 L 212.000 164.000 L 212.000 188.000 Z"),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
