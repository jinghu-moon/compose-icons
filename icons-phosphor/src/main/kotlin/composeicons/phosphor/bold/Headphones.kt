package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorBoldIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.73 51.85C173.88 20.802 127.349 11.429 86.883 28.109 46.418 44.79 20.009 84.231 20 128v56c0 15.464 12.536 28 28 28h16c15.464 0 28-12.536 28-28v-40C92 128.536 79.464 116 64 116h-19.16C50.827 74.675 86.243 44.011 128 44h.64c41.57 .178 76.71 30.838 82.52 72h-19.16c-15.464 0-28 12.536-28 28v40c0 15.464 12.536 28 28 28h16c15.464 0 28-12.536 28-28v-56C236.111 99.47 224.859 72.069 204.73 51.85ZM64 140c2.209 0 4 1.791 4 4v40c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4v-44ZM212 184c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4v-40c0-2.209 1.791-4 4-4h20Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
