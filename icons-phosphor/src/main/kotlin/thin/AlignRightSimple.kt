package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorThinIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 56.000 L 228.000 200.000 C 228.000 202.209 226.209 204.000 224.000 204.000 C 221.791 204.000 220.000 202.209 220.000 200.000 L 220.000 56.000 C 220.000 53.791 221.791 52.000 224.000 52.000 C 226.209 52.000 228.000 53.791 228.000 56.000 ZM 196.000 96.000 L 196.000 160.000 C 196.000 166.627 190.627 172.000 184.000 172.000 L 32.000 172.000 C 25.373 172.000 20.000 166.627 20.000 160.000 L 20.000 96.000 C 20.000 89.373 25.373 84.000 32.000 84.000 L 184.000 84.000 C 190.627 84.000 196.000 89.373 196.000 96.000 ZM 188.000 96.000 C 188.000 93.791 186.209 92.000 184.000 92.000 L 32.000 92.000 C 29.791 92.000 28.000 93.791 28.000 96.000 L 28.000 160.000 C 28.000 162.209 29.791 164.000 32.000 164.000 L 184.000 164.000 C 186.209 164.000 188.000 162.209 188.000 160.000 Z"),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
