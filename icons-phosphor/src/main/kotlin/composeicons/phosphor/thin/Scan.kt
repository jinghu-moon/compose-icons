package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorThinIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 40v40c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-36h-36c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM80 212h-36v-36c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM216 172c-2.209 0-4 1.791-4 4v36h-36c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM40 84c2.209 0 4-1.791 4-4v-36h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v40c0 2.209 1.791 4 4 4ZM80 76h96c2.209 0 4 1.791 4 4v96c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4ZM84 172h88v-88h-88Z"),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
