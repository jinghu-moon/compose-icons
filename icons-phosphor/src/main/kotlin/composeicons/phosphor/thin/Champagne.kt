package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Champagne: ImageVector
    get() {
        if (_champagne != null) return _champagne!!
        _champagne = phosphorThinIcon(
            name = "Champagne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M142.3 12h-44.6c-1.73 .001-3.264 1.115-3.8 2.76C92.45 19.23 58.7 124.51 87.77 164.54c6.73 9.25 16.23 14.38 28.23 15.29v56.17h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-56.17c12-.91 21.5-6 28.22-15.29C181.3 124.54 147.55 19.23 146.1 14.76c-.536-1.645-2.07-2.759-3.8-2.76ZM100.65 20h38.7c4.749 15.777 8.638 31.801 11.65 48h-62C92.025 51.804 95.914 35.781 100.65 20ZM145.75 159.83C139.8 168 131.38 172 120 172c-11.38 0-19.8-4-25.75-12.16C81 141.63 82.6 106.72 87.6 76h64.81c6.45 40 4.16 68.94-6.66 83.83ZM228 52c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM204 20c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM204 100c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _champagne!!
    }

private var _champagne: ImageVector? = null
