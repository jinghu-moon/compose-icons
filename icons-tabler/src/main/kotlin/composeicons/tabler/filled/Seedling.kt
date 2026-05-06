package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Seedling: ImageVector
    get() {
        if (_seedling != null) return _seedling!!
        _seedling = tablerFilledIcon(
            name = "Seedling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 3c3.54-.001 6.523 2.641 6.95 6.155C14.268 7.776 16.093 6.997 18 7h3c.552 0 1 .448 1 1v1c0 3.866-3.134 7-7 7h-2v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-7h-2C5.134 13 2 9.866 2 6v-2C2 3.448 2.448 3 3 3Z"),
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
        return _seedling!!
    }

private var _seedling: ImageVector? = null
