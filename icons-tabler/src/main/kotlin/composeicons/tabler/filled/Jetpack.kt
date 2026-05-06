package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Jetpack: ImageVector
    get() {
        if (_jetpack != null) return _jetpack!!
        _jetpack = tablerFilledIcon(
            name = "Jetpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c2.209 0 4 1.791 4 4v7c0 .552-.448 1-1 1h-6c-.552 0-1-.448-1-1v-1h-2v1c0 .552-.448 1-1 1h-6C3.448 14 3 13.552 3 13v-7C3 3.791 4.791 2 7 2c2.209 0 4 1.791 4 4v1h2v-1C13 3.791 14.791 2 17 2M13 10v-1h-2v1ZM9 15c.552 0 1 .448 1 1 0 2.623-.787 4.59-2.4 5.8-.356 .267-.844 .267-1.2 0C4.787 20.59 4 18.623 4 16c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 1.532 .308 2.684 .906 3.498L7 19.617l.094-.12c.558-.759 .864-1.813 .902-3.196L8 16c0-.552 .448-1 1-1M19 15c.552 0 1 .448 1 1 0 2.623-.787 4.59-2.4 5.8-.356 .267-.844 .267-1.2 0C14.787 20.59 14 18.623 14 16c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 1.532 .308 2.684 .906 3.498l.094 .119 .094-.12c.558-.759 .864-1.813 .902-3.196L18 16c0-.552 .448-1 1-1"),
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
        return _jetpack!!
    }

private var _jetpack: ImageVector? = null
