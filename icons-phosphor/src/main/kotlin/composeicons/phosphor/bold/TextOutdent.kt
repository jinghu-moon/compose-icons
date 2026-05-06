package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorBoldIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 6.627-5.373 12-12 12h-96c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h96c6.627 0 12 5.373 12 12ZM120 76h96c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12ZM216 180h-176c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM72 148c4.856 .004 9.236-2.92 11.095-7.407 1.859-4.487 .83-9.651-2.605-13.083L49 96 80.49 64.48c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L23.49 87.48c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l40 40c2.256 2.258 5.318 3.525 8.51 3.52Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null
