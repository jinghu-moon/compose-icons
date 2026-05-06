package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorThinIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.16 189.54 176.16 124h31.84c1.524 0 2.916-.866 3.589-2.233 .673-1.368 .511-2.999-.419-4.207l-80-104c-.757-.984-1.928-1.561-3.17-1.561-1.242 0-2.413 .577-3.17 1.561l-80 104c-.93 1.208-1.092 2.839-.419 4.207 .673 1.368 2.065 2.234 3.589 2.233h31.82l-51 65.54c-.943 1.209-1.112 2.851-.435 4.227 .677 1.376 2.081 2.243 3.615 2.233h92v44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-44h92c1.53 .002 2.927-.868 3.599-2.242 .672-1.374 .502-3.011-.439-4.218ZM40.18 188l51-65.54c.943-1.209 1.112-2.851 .435-4.227C90.937 116.858 89.533 115.99 88 116h-31.88L128 22.56 199.88 116h-31.88c-1.53-.002-2.927 .868-3.599 2.242-.672 1.374-.502 3.011 .439 4.218l51 65.54Z"),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
