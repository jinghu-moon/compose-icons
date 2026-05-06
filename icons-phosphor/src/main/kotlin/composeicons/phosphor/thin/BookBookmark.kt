package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorThinIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-136C56.536 28 44 40.536 44 56v168c0 2.209 1.791 4 4 4h144c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-140v-4c0-11.046 8.954-20 20-20h136c2.209 0 4-1.791 4-4v-160c0-2.209-1.791-4-4-4ZM116 36h56v84L146.39 100.8c-1.422-1.067-3.378-1.067-4.8 0L116 120ZM204 188h-132c-7.529-.003-14.74 3.033-20 8.42v-140.42C52 44.954 60.954 36 72 36h36v92c0 1.515 .856 2.9 2.211 3.578 1.355 .678 2.977 .531 4.189-.378L144 109l29.61 22.2c.692 .519 1.535 .8 2.4 .8 2.209 0 4-1.791 4-4v-92h24Z"),
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
