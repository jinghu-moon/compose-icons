package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorFillIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 24h-136C54.327 24 40 38.327 40 56v168c0 4.418 3.582 8 8 8h144c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-136c0-8.837 7.163-16 16-16h136c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM184 120 158.39 100.8c-1.422-1.067-3.378-1.067-4.8 0L128 120v-80h56Z"),
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
