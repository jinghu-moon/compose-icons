package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AlignBottomSimple: ImageVector
    get() {
        if (_alignBottomSimple != null) return _alignBottomSimple!!
        _alignBottomSimple = phosphorThinIcon(
            name = "AlignBottomSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 232.000 C 204.000 234.209 202.209 236.000 200.000 236.000 L 56.000 236.000 C 53.791 236.000 52.000 234.209 52.000 232.000 C 52.000 229.791 53.791 228.000 56.000 228.000 L 200.000 228.000 C 202.209 228.000 204.000 229.791 204.000 232.000 ZM 84.000 192.000 L 84.000 40.000 C 84.000 33.373 89.373 28.000 96.000 28.000 L 160.000 28.000 C 166.627 28.000 172.000 33.373 172.000 40.000 L 172.000 192.000 C 172.000 198.627 166.627 204.000 160.000 204.000 L 96.000 204.000 C 89.373 204.000 84.000 198.627 84.000 192.000 ZM 92.000 192.000 C 92.000 194.209 93.791 196.000 96.000 196.000 L 160.000 196.000 C 162.209 196.000 164.000 194.209 164.000 192.000 L 164.000 40.000 C 164.000 37.791 162.209 36.000 160.000 36.000 L 96.000 36.000 C 93.791 36.000 92.000 37.791 92.000 40.000 Z"),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
