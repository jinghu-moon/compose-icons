package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SquareLogo: ImageVector
    get() {
        if (_squareLogo != null) return _squareLogo!!
        _squareLogo = phosphorBoldIcon(
            name = "SquareLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 28.000 L 48.000 28.000 C 36.954 28.000 28.000 36.954 28.000 48.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 208.000 228.000 C 219.046 228.000 228.000 219.046 228.000 208.000 L 228.000 48.000 C 228.000 36.954 219.046 28.000 208.000 28.000 ZM 204.000 204.000 L 52.000 204.000 L 52.000 52.000 L 204.000 52.000 ZM 96.000 172.000 L 160.000 172.000 C 166.627 172.000 172.000 166.627 172.000 160.000 L 172.000 96.000 C 172.000 89.373 166.627 84.000 160.000 84.000 L 96.000 84.000 C 89.373 84.000 84.000 89.373 84.000 96.000 L 84.000 160.000 C 84.000 166.627 89.373 172.000 96.000 172.000 ZM 108.000 108.000 L 148.000 108.000 L 148.000 148.000 L 108.000 148.000 Z"),
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
        return _squareLogo!!
    }

private var _squareLogo: ImageVector? = null
