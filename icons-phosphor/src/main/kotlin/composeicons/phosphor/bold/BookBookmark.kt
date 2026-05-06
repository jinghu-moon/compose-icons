package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorBoldIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 20h-136C52.118 20 36 36.118 36 56v168c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-132v-4c0-6.627 5.373-12 12-12h136c6.627 0 12-5.373 12-12v-152c0-6.627-5.373-12-12-12ZM120 44h36v59L145.49 94.59c-4.384-3.51-10.616-3.51-15 0L120 103ZM196 172h-124c-4.089-.008-8.148 .689-12 2.06v-118.06C60 49.373 65.373 44 72 44h24v84c-.001 4.614 2.644 8.82 6.803 10.819 4.159 1.998 9.095 1.435 12.697-1.449l22.49-18 22.51 18c3.602 2.884 8.538 3.447 12.697 1.449 4.159-1.998 6.804-6.204 6.803-10.819v-84h16Z"),
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
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
