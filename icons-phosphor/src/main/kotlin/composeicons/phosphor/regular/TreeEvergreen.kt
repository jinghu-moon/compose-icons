package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorRegularIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.32 187.09 184.32 128h23.68c3.048 0 5.832-1.732 7.178-4.467 1.346-2.735 1.021-5.997-.838-8.413l-80-104C132.826 9.152 130.483 7.999 128 7.999c-2.483 0-4.826 1.153-6.34 3.121L41.66 115.12c-1.86 2.416-2.185 5.678-.838 8.413 1.346 2.735 4.13 4.467 7.178 4.467h23.64l-46 59.09c-1.88 2.418-2.214 5.698-.861 8.446 1.354 2.748 4.157 4.481 7.221 4.464h88v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h88c3.056 .002 5.846-1.738 7.189-4.483 1.344-2.745 1.006-6.015-.869-8.427ZM48.36 184l46-59.09c1.88-2.418 2.214-5.698 .861-8.446C93.867 113.717 91.063 111.983 88 112h-23.75L128 29.12 191.75 112h-23.75c-3.054 .002-5.84 1.743-7.181 4.487-1.341 2.744-1.003 6.012 .871 8.423L207.64 184Z"),
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
