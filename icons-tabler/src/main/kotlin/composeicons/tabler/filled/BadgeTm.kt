package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeTm: ImageVector
    get() {
        if (_badgeTm != null) return _badgeTm!!
        _badgeTm = tablerFilledIcon(
            name = "BadgeTm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM10 8h-4C5.448 8 5 8.448 5 9c0 .552 .448 1 1 1h1v5c0 .507 .38 .934 .883 .993L8 16c.552 0 1-.448 1-1v-5h1c.507-0 .934-.38 .993-.883L11 9C11 8.448 10.552 8 10 8M18 9C18 8.01 16.717 7.622 16.168 8.445L15 10.197 13.832 8.445C13.283 7.622 12 8.011 12 9v6c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-2.697l.168 .252 .08 .104c.205 .234 .507 .359 .818 .339 .31-.02 .594-.184 .766-.443L16 12.302v2.698c0 .552 .448 1 1 1 .552 0 1-.448 1-1Z"),
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
        return _badgeTm!!
    }

private var _badgeTm: ImageVector? = null
