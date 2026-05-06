package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorThinIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 52h-192C25.373 52 20 57.373 20 64v128c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM228 192c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4ZM204 128c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM204 96c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h144c2.209 0 4 1.791 4 4ZM68 160c0 2.209-1.791 4-4 4h-8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c2.209 0 4 1.791 4 4ZM164 160c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM204 160c0 2.209-1.791 4-4 4h-8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c2.209 0 4 1.791 4 4Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
