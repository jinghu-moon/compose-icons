package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBadgeRight: ImageVector
    get() {
        if (_arrowBadgeRight != null) return _arrowBadgeRight!!
        _arrowBadgeRight = tablerFilledIcon(
            name = "ArrowBadgeRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 6l-.112 .006c-.362 .041-.674 .275-.813 .612-.139 .337-.084 .723 .144 1.007L9.72 12 6.22 16.375c-.24 .3-.287 .711-.121 1.058 .166 .347 .517 .567 .901 .567h6c.303-0 .59-.138 .78-.375l4-5c.292-.365 .292-.885 0-1.25l-4-5C13.59 6.138 13.303 6 13 6h-6Z"),
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
        return _arrowBadgeRight!!
    }

private var _arrowBadgeRight: ImageVector? = null
