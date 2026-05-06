package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutAlignCenter: ImageVector
    get() {
        if (_layoutAlignCenter != null) return _layoutAlignCenter!!
        _layoutAlignCenter = tablerFilledIcon(
            name = "LayoutAlignCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c.552 0 1 .448 1 1v4h3c1.657 0 3 1.343 3 3v2c0 1.657-1.343 3-3 3h-3v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4h-3C6.343 16 5 14.657 5 13v-2C5 9.343 6.343 8 8 8h3v-4c0-.552 .448-1 1-1"),
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
        return _layoutAlignCenter!!
    }

private var _layoutAlignCenter: ImageVector? = null
