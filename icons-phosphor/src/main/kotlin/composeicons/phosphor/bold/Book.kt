package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Book: ImageVector
    get() {
        if (_book != null) return _book!!
        _book = phosphorBoldIcon(
            name = "Book",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 20h-136C52.118 20 36 36.118 36 56v168c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-132v-4c0-6.627 5.373-12 12-12h136c6.627 0 12-5.373 12-12v-152c0-6.627-5.373-12-12-12ZM196 172h-124c-4.089-.008-8.148 .689-12 2.06v-118.06C60 49.373 65.373 44 72 44h124Z"),
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
        return _book!!
    }

private var _book: ImageVector? = null
