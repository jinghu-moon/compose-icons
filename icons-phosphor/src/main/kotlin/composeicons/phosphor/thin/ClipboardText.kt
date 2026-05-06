package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) return _clipboardText!!
        _clipboardText = phosphorThinIcon(
            name = "ClipboardText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 152c0 2.209-1.791 4-4 4h-64c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4ZM160 116h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h64c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM212 48v168c0 6.627-5.373 12-12 12h-144c-6.627 0-12-5.373-12-12v-168C44 41.373 49.373 36 56 36h38.08C102.439 25.883 114.877 20.026 128 20.026c13.123 0 25.561 5.858 33.92 15.974h38.08c6.627 0 12 5.373 12 12ZM92 64v4h72v-4C164 44.118 147.882 28 128 28 108.118 28 92 44.118 92 64ZM204 48c0-2.209-1.791-4-4-4h-32.83c3.178 6.187 4.834 13.044 4.83 20v8c0 2.209-1.791 4-4 4h-80c-2.209 0-4-1.791-4-4v-8c-.004-6.956 1.652-13.813 4.83-20h-32.83c-2.209 0-4 1.791-4 4v168c0 2.209 1.791 4 4 4h144c2.209 0 4-1.791 4-4Z"),
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
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
