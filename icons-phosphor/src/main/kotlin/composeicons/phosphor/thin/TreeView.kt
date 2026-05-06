package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorThinIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 148h32c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v12h-80v-40h12c6.627 0 12-5.373 12-12v-32C108 25.373 102.627 20 96 20h-32C57.373 20 52 25.373 52 32v32c0 6.627 5.373 12 12 12h12v116c0 11.046 8.954 20 20 20h68v12c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v12h-68c-6.627 0-12-5.373-12-12v-68h80v12c0 6.627 5.373 12 12 12ZM60 64v-32c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM172 192c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM172 104c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4Z"),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
