package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) return _piggyBank!!
        _piggyBank = phosphorThinIcon(
            name = "PiggyBank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 116c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM152 68h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM244 112v32c0 11.046-8.954 20-20 20h-5.18l-17.16 48c-1.693 4.79-6.22 7.994-11.3 8h-12.72c-5.08-.006-9.607-3.21-11.3-8l-2.87-8h-62.94l-2.87 8c-1.693 4.79-6.22 7.994-11.3 8h-12.72c-5.08-.006-9.607-3.21-11.3-8L49.52 176.1C36.656 161.815 29.1 143.538 28.12 124.34 18.737 126.196 11.981 134.435 12 144c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 .003-13.951 10.276-25.772 24.09-27.72C30.13 71.405 67.078 36.055 112 36h104c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-36.2c18.499 8.709 33.187 23.866 41.31 42.63 .76 1.76 1.47 3.55 2.11 5.37h.78c11.046 0 20 8.954 20 20ZM236 112c0-6.627-5.373-12-12-12h-3.66c-1.748 .002-3.295-1.132-3.82-2.8-.785-2.51-1.703-4.977-2.75-7.39C201.729 61.993 174.311 43.991 144 44h-32C81.871 44.015 54.596 61.826 42.468 89.405 30.339 116.985 35.647 149.125 56 171.34c.361 .394 .64 .856 .82 1.36l13.09 36.65c.565 1.577 2.054 2.635 3.73 2.65h12.72c1.69 .002 3.2-1.059 3.77-2.65L94 198.65c.563-1.571 2.042-2.627 3.71-2.65h68.58c1.687 .002 3.191 1.062 3.76 2.65l3.82 10.7c.57 1.591 2.08 2.652 3.77 2.65h12.72c1.69 .002 3.2-1.059 3.77-2.65l18.1-50.7c.57-1.591 2.08-2.652 3.77-2.65h8c6.627 0 12-5.373 12-12Z"),
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
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
