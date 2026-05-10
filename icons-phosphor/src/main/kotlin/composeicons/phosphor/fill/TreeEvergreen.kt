package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorFillIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.19 195.51c-1.342 2.748-4.132 4.49-7.19 4.49h-88v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-40h-88c-3.054-.002-5.84-1.743-7.181-4.487-1.341-2.744-1.003-6.012 .871-8.423L71.69 128h-23.69c-3.048 0-5.832-1.732-7.178-4.467-1.346-2.735-1.021-5.997 .838-8.413L121.66 11.12C123.174 9.152 125.517 7.999 128 7.999c2.483 0 4.826 1.153 6.34 3.121l80 104c1.86 2.416 2.185 5.678 .838 8.413-1.346 2.735-4.13 4.467-7.178 4.467h-23.64l45.95 59.09c1.876 2.409 2.217 5.675 .88 8.42Z"),
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
