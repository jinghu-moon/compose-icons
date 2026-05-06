package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorFillIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 136v-8h-72v64c0 4.418 3.582 8 8 8h64v-8c0-8.837 7.163-16 16-16h32c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-32c-8.837 0-16-7.163-16-16v-8h-64C82.745 216 72 205.255 72 192v-112h-8C55.163 80 48 72.837 48 64v-32C48 23.163 55.163 16 64 16h32c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-8v32h72v-8c0-8.837 7.163-16 16-16h32c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-32c-8.837 0-16-7.163-16-16Z"),
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
