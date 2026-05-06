package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WindowsLogo: ImageVector
    get() {
        if (_windowsLogo != null) return _windowsLogo!!
        _windowsLogo = phosphorThinIcon(
            name = "WindowsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 140h-80c-2.209 0-4 1.791-4 4v57.45c-.003 1.933 1.378 3.592 3.28 3.94l80 14.55c.238 .04 .479 .06 .72 .06 .936-.001 1.842-.33 2.56-.93 .911-.759 1.439-1.884 1.44-3.07v-72c0-2.209-1.791-4-4-4ZM204 211.21 132 198.12v-50.12h72ZM96 140h-64c-2.209 0-4 1.791-4 4v40c-.003 1.933 1.378 3.592 3.28 3.94l64 11.63c.237 .048 .478 .072 .72 .07 2.209 0 4-1.791 4-4v-51.64c0-2.209-1.791-4-4-4ZM92 190.84 36 180.66v-32.66h56ZM210.56 36.93c-.91-.762-2.112-1.081-3.28-.87l-80 14.55c-1.902 .348-3.283 2.007-3.28 3.94v57.45c0 2.209 1.791 4 4 4h80c2.209 0 4-1.791 4-4v-72c-.001-1.186-.529-2.311-1.44-3.07ZM204 108h-72v-50.12L204 44.79ZM95.28 56.43 31.28 68.06C29.378 68.408 27.997 70.067 28 72v40c0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4v-51.64c-.001-1.186-.529-2.31-1.441-3.069-.911-.759-2.113-1.074-3.279-.861ZM92 108h-56v-32.66L92 65.16Z"),
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
        return _windowsLogo!!
    }

private var _windowsLogo: ImageVector? = null
