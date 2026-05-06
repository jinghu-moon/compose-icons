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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 232c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM84 192v-152C84 33.373 89.373 28 96 28h64c6.627 0 12 5.373 12 12v152c0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12ZM92 192c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-152c0-2.209-1.791-4-4-4h-64c-2.209 0-4 1.791-4 4Z"),
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
        return _alignBottomSimple!!
    }

private var _alignBottomSimple: ImageVector? = null
