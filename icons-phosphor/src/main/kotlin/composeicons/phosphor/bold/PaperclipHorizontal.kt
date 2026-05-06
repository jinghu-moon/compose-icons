package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorBoldIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 128c-.039 33.121-26.879 59.961-60 60h-148C21.909 188 4 170.091 4 148 4 125.909 21.909 108 44 108h140c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-140c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16h148c19.882 0 36-16.118 36-36C228 108.118 211.882 92 192 92h-112C73.373 92 68 86.627 68 80 68 73.373 73.373 68 80 68h112c33.121 .039 59.961 26.879 60 60Z"),
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
