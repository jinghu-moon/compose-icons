package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Id: ImageVector
    get() {
        if (_id != null) return _id!!
        _id = tablerFilledIcon(
            name = "Id",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c2.209 0 4 1.791 4 4v10c0 2.209-1.791 4-4 4h-12C3.791 21 2 19.209 2 17v-10q0-.053 .005-.102C2.057 4.729 3.831 2.999 6 3ZM17 15h-10c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h10c.552 0 1-.448 1-1 0-.552-.448-1-1-1M9 7C7.383 6.999 6.057 8.282 6.005 9.898 6.002 9.932 6 9.966 6 10c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C12 8.343 10.657 7 9 7M17 11h-2c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1 0-.552-.448-1-1-1M17 7h-2c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1C18 7.448 17.552 7 17 7"),
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
        return _id!!
    }

private var _id: ImageVector? = null
