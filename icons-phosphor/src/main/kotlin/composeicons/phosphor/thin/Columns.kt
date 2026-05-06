package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Columns: ImageVector
    get() {
        if (_columns != null) return _columns!!
        _columns = phosphorThinIcon(
            name = "Columns",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 36h-40C57.373 36 52 41.373 52 48v160c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM108 208c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM192 36h-40c-6.627 0-12 5.373-12 12v160c0 6.627 5.373 12 12 12h40c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM196 208c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4Z"),
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
        return _columns!!
    }

private var _columns: ImageVector? = null
