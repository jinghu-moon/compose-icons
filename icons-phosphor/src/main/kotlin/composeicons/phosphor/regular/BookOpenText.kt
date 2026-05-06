package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BookOpenText: ImageVector
    get() {
        if (_bookOpenText != null) return _bookOpenText!!
        _bookOpenText = phosphorRegularIcon(
            name = "BookOpenText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48h-72c-12.59 0-24.446 5.928-32 16C120.446 53.928 108.59 48 96 48h-72c-4.418 0-8 3.582-8 8v144c0 4.418 3.582 8 8 8h72c13.255 0 24 10.745 24 24 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-13.255 10.745-24 24-24h72c4.418 0 8-3.582 8-8v-144c0-4.418-3.582-8-8-8ZM96 192h-64v-128h64c13.255 0 24 10.745 24 24v112c-6.917-5.205-15.343-8.014-24-8ZM224 192h-64c-8.657-.014-17.083 2.795-24 8v-112c0-13.255 10.745-24 24-24h64ZM160 88h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM208 128c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM208 160c0 4.418-3.582 8-8 8h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8Z"),
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
        return _bookOpenText!!
    }

private var _bookOpenText: ImageVector? = null
