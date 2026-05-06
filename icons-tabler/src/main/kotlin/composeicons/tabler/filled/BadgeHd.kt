package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeHd: ImageVector
    get() {
        if (_badgeHd != null) return _badgeHd!!
        _badgeHd = tablerFilledIcon(
            name = "BadgeHd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM15 8h-1c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h1c1.657 0 3-1.343 3-3v-2C18 9.343 16.657 8 15 8M10 8C9.448 8 9 8.448 9 9v2h-1v-2C8 8.493 7.62 8.066 7.117 8.007L7 8C6.448 8 6 8.448 6 9v6c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-2h1v2c0 .507 .38 .934 .883 .993L10 16c.552 0 1-.448 1-1v-6C11 8.448 10.552 8 10 8M15 10c.552 0 1 .448 1 1v2c-0 .507-.38 .934-.883 .993L15 14Z"),
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
        return _badgeHd!!
    }

private var _badgeHd: ImageVector? = null
