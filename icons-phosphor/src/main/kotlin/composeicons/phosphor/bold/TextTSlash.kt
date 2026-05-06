package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorBoldIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.07 224.88c-4.904 4.456-12.493 4.094-16.95-.81L140 159v29h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h20v-55.36L68 79.84v8.16c0 6.627-5.373 12-12 12C49.373 100 44 94.627 44 88v-32c0-.776 .077-1.549 .23-2.31L39.12 48.07C36.175 44.907 35.159 40.405 36.459 36.284c1.3-4.121 4.716-7.225 8.942-8.126 4.226-.901 8.611 .54 11.479 3.773L216.88 207.93c4.456 4.904 4.094 12.493-.81 16.95ZM116 68v.57c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-.57h48v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-83.4c-6.627-.166-12.134 5.073-12.3 11.7C104.134 62.327 109.373 67.834 116 68Z"),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
