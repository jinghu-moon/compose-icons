package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextIndent: ImageVector
    get() {
        if (_textIndent != null) return _textIndent!!
        _textIndent = phosphorBoldIcon(
            name = "TextIndent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h96c6.627 0 12 5.373 12 12ZM120 76h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM216 180h-176c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM31.51 144.49c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L88.51 104.49c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L48.51 47.49c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L63 96 31.51 127.51c-2.253 2.251-3.519 5.305-3.519 8.49 0 3.185 1.266 6.239 3.519 8.49Z"),
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
        return _textIndent!!
    }

private var _textIndent: ImageVector? = null
