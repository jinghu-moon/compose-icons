package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeAd: ImageVector
    get() {
        if (_badgeAd != null) return _badgeAd!!
        _badgeAd = tablerFilledIcon(
            name = "BadgeAd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM15 8h-1c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h1c1.657 0 3-1.343 3-3v-2C18 9.343 16.657 8 15 8M8.5 8C7.119 8 6 9.119 6 10.5v4.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-1h1v1c0 .507 .38 .934 .883 .993L10 16c.552 0 1-.448 1-1v-4.5C11 9.119 9.881 8 8.5 8M15 10c.552 0 1 .448 1 1v2c-0 .507-.38 .934-.883 .993L15 14ZM8.5 10c.276 0 .5 .224 .5 .5v1.5h-1v-1.5c-0-.241 .172-.449 .41-.492Z"),
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
        return _badgeAd!!
    }

private var _badgeAd: ImageVector? = null
