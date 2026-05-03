package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignLeftSimple: ImageVector
    get() {
        if (_alignLeftSimple != null) return _alignLeftSimple!!
        _alignLeftSimple = phosphorThinIcon(
            name = "AlignLeftSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 36.000 56.000 L 36.000 200.000 C 36.000 202.209 34.209 204.000 32.000 204.000 C 29.791 204.000 28.000 202.209 28.000 200.000 L 28.000 56.000 C 28.000 53.791 29.791 52.000 32.000 52.000 C 34.209 52.000 36.000 53.791 36.000 56.000 ZM 236.000 96.000 L 236.000 160.000 C 236.000 166.627 230.627 172.000 224.000 172.000 L 72.000 172.000 C 65.373 172.000 60.000 166.627 60.000 160.000 L 60.000 96.000 C 60.000 89.373 65.373 84.000 72.000 84.000 L 224.000 84.000 C 230.627 84.000 236.000 89.373 236.000 96.000 ZM 228.000 96.000 C 228.000 93.791 226.209 92.000 224.000 92.000 L 72.000 92.000 C 69.791 92.000 68.000 93.791 68.000 96.000 L 68.000 160.000 C 68.000 162.209 69.791 164.000 72.000 164.000 L 224.000 164.000 C 226.209 164.000 228.000 162.209 228.000 160.000 Z"),
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
        return _alignLeftSimple!!
    }

private var _alignLeftSimple: ImageVector? = null
