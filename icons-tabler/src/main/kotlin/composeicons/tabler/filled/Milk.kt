package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Milk: ImageVector
    get() {
        if (_milk != null) return _milk!!
        _milk = tablerFilledIcon(
            name = "Milk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.799 7l.144 .23c.691 1.11 1.057 2.392 1.057 3.7v8.07c0 1.657-1.343 3-3 3h-8C6.343 22 5 20.657 5 19v-8.071C5 9.622 5.366 8.341 6.057 7.231L6.199 7ZM12 13c-1.589-0-2.902 1.238-2.995 2.824L9 16c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3M12 15c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1M14 9h-4C9.448 9 9 9.448 9 10c0 .552 .448 1 1 1h4c.552 0 1-.448 1-1C15 9.448 14.552 9 14 9M15 2c1.105 0 2 .895 2 2v1h-10v-1C7 2.895 7.895 2 9 2Z"),
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
        return _milk!!
    }

private var _milk: ImageVector? = null
