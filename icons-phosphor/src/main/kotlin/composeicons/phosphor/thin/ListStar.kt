package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorThinIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M36 64c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4ZM40 132h56c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-56c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM112 188h-72c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM234.55 140.7l-24.46 20.19L217.55 191c.388 1.563-.199 3.207-1.49 4.17-.696 .512-1.536 .789-2.4 .79-.703-.004-1.393-.194-2-.55L184 179.18l-27.64 16.27c-1.388 .816-3.129 .72-4.42-.242-1.29-.963-1.878-2.605-1.49-4.168l7.46-30.15L133.45 140.7c-1.263-1.037-1.768-2.739-1.275-4.298 .493-1.559 1.885-2.66 3.515-2.782l32.24-2.49 12.4-28.71c.634-1.463 2.076-2.409 3.67-2.409 1.594 0 3.036 .946 3.67 2.409l12.4 28.71 32.24 2.49c1.63 .122 3.022 1.224 3.515 2.782 .493 1.559-.012 3.26-1.275 4.298ZM221.81 140.84 197 138.92c-1.478-.115-2.771-1.039-3.36-2.4L184 114.1l-9.68 22.42c-.589 1.361-1.882 2.285-3.36 2.4l-24.77 1.92L165 156.33c1.167 .973 1.682 2.522 1.33 4l-5.78 23.36L182 171.09c1.253-.738 2.807-.738 4.06 0l21.47 12.64-5.78-23.36c-.352-1.478 .163-3.027 1.33-4Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
