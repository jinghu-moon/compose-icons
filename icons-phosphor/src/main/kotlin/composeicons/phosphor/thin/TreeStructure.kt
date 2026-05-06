package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorThinIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 108h48c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v20h-20c-11.046 0-20 8.954-20 20v36h-40v-12c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-12h40v36c0 11.046 8.954 20 20 20h20v20c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v20h-20c-6.627 0-12-5.373-12-12v-80c0-6.627 5.373-12 12-12h20v20c0 6.627 5.373 12 12 12ZM60 144c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM156 160c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v48c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4ZM156 48c0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4v48c0 2.209-1.791 4-4 4h-48c-2.209 0-4-1.791-4-4Z"),
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
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
