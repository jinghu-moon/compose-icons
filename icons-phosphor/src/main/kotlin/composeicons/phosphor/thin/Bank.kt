package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorThinIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 100h28v72h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-72h28c1.792 .004 3.369-1.185 3.858-2.909 .489-1.725-.229-3.564-1.758-4.501l-104-64c-1.287-.794-2.913-.794-4.2 0L21.9 92.59c-1.528 .937-2.246 2.776-1.758 4.501 .489 1.725 2.065 2.913 3.858 2.909ZM60 100h40v72h-40ZM148 100v72h-40v-72ZM196 172h-40v-72h40ZM128 36.7 217.87 92h-179.74ZM244 208c0 2.209-1.791 4-4 4h-224c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h224c2.209 0 4 1.791 4 4Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
