package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Strategy: ImageVector
    get() {
        if (_strategy != null) return _strategy!!
        _strategy = phosphorThinIcon(
            name = "Strategy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76 156c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32C108 170.327 93.673 156 76 156ZM76 212C62.745 212 52 201.255 52 188c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM45.17 109.17 62.34 92 45.17 74.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L68 86.34 85.17 69.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L73.66 92l17.17 17.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L68 97.66 50.83 114.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66ZM226.83 205.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L204 193.66l-17.17 17.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L198.34 188 181.17 170.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L204 182.34l17.17-17.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L209.66 188ZM180.62 111.76c-5.82 21-23.77 39.15-43.65 44.12-.327 .081-.663 .121-1 .12-2.025 .014-3.741-1.487-3.996-3.496-.255-2.009 1.032-3.892 2.996-4.384 16.94-4.24 32.87-20.42 37.88-38.49 3.47-12.53 3.55-31.51-15.74-50.8L148 49.66v30.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-40c0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-30.34l9.17 9.17c17.17 17.18 23.5 37.99 17.79 58.59Z"),
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
        return _strategy!!
    }

private var _strategy: ImageVector? = null
