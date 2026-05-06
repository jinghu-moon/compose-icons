package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Writing: ImageVector
    get() {
        if (_writing != null) return _writing!!
        _writing = tablerFilledIcon(
            name = "Writing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 8v9c-0 .265-.105 .52-.293 .707l-2 2c-.035 .035-.072 .067-.112 .097l-.11 .071-.114 .054-.105 .035-.149 .03L18 20h-13C3.343 20 2 18.657 2 17 2 15.343 3.343 14 5 14h4c.552 0 1-.448 1-1 0-.552-.448-1-1-1h-3C5.448 12 5 11.552 5 11c0-.552 .448-1 1-1h3c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-4c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h10.585l-.292-.293C15.105 17.52 15 17.265 15 17v-9ZM18 2c1.673 0 3 1.327 3 3v1h-6v-1C15 3.327 16.327 2 18 2"),
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
        return _writing!!
    }

private var _writing: ImageVector? = null
