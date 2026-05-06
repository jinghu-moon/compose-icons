package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorThinIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 68h-52v-12C172 44.954 163.046 36 152 36h-48C92.954 36 84 44.954 84 56v12h-52C25.373 68 20 73.373 20 80v112c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM92 56c0-6.627 5.373-12 12-12h48c6.627 0 12 5.373 12 12v12h-72ZM32 76h192c2.209 0 4 1.791 4 4v36h-40v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-104v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-40v-36c0-2.209 1.791-4 4-4ZM224 196h-192c-2.209 0-4-1.791-4-4v-68h40v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h104v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h40v68c0 2.209-1.791 4-4 4Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
