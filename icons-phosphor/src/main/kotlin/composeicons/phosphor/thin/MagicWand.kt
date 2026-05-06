package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagicWand: ImageVector
    get() {
        if (_magicWand != null) return _magicWand!!
        _magicWand = phosphorThinIcon(
            name = "MagicWand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 152c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4ZM56 68h20v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-20c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM184 196h-12v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM216.48 77.17 77.17 216.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L39.51 195.8c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L178.83 39.51c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l20.65 20.69c4.686 4.686 4.686 12.284 0 16.97ZM170.34 112 144 85.66 45.17 184.49c-1.558 1.561-1.558 4.089 0 5.65l20.68 20.69c.75 .751 1.768 1.173 2.83 1.173 1.062 0 2.08-.422 2.83-1.173ZM210.83 65.86 190.14 45.17c-.75-.751-1.768-1.173-2.83-1.173-1.062 0-2.08 .422-2.83 1.173L149.65 80 176 106.34 210.83 71.51c1.558-1.561 1.558-4.089 0-5.65Z"),
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
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
