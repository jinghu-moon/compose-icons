package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorRegularIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 152h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v8h-72v-32h8c8.837 0 16-7.163 16-16v-32C112 23.163 104.837 16 96 16h-32C55.163 16 48 23.163 48 32v32c0 8.837 7.163 16 16 16h8v112c0 13.255 10.745 24 24 24h64v8c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v8h-64c-4.418 0-8-3.582-8-8v-64h72v8c0 8.837 7.163 16 16 16ZM64 32h32v32h-32ZM176 192h32v32h-32ZM176 104h32v32h-32Z"),
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
