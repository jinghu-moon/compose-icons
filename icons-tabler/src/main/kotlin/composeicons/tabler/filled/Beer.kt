package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = tablerFilledIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 2c1.047-0 1.917 .806 1.995 1.85L19 4v4c0 1.335-.229 2.386-.774 3.692l-.157 .363-.31 .701c-.452 1.024-.707 2.124-.751 3.242L17 16.375v3.625c0 1.047-.806 1.917-1.85 1.995L15 22h-6C7.953 22 7.083 21.194 7.005 20.15L7 20v-3.625C7 15.243 6.79 14.125 6.383 13.095l-.142-.34-.31-.699C5.327 10.698 5.048 9.646 5.006 8.358L5 8v-4C5 2.953 5.806 2.083 6.85 2.005L7 2h10ZM17 4h-10v3h10v-3Z"),
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
        return _beer!!
    }

private var _beer: ImageVector? = null
