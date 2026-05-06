package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorThinIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 128c-.033 28.705-23.295 51.967-52 52h-144C28.118 180 12 163.882 12 144c0-19.882 16.118-36 36-36h144c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20h-112c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h112c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-144c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28h144c24.301 0 44-19.699 44-44C236 103.699 216.301 84 192 84h-112c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h112c28.705 .033 51.967 23.295 52 52Z"),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
