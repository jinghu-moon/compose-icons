package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lockers: ImageVector
    get() {
        if (_lockers != null) return _lockers!!
        _lockers = phosphorThinIcon(
            name = "Lockers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 72c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM184 100h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM72 76h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM96 100h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM220 48v176c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-80v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-80v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-176C36 41.373 41.373 36 48 36h160c6.627 0 12 5.373 12 12ZM124 196v-152h-76c-2.209 0-4 1.791-4 4v148ZM132 196h80v-148c0-2.209-1.791-4-4-4h-76Z"),
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
        return _lockers!!
    }

private var _lockers: ImageVector? = null
