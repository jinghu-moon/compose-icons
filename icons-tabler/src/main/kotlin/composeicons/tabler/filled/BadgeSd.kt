package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeSd: ImageVector
    get() {
        if (_badgeSd != null) return _badgeSd!!
        _badgeSd = tablerFilledIcon(
            name = "BadgeSd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM15 8h-1c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h1c1.657 0 3-1.343 3-3v-2C18 9.343 16.657 8 15 8M9.25 8h-1.25C6.895 8 6 8.895 6 10v1c0 1.105 .895 2 2 2h1v1h-1.033l-.025-.087c-.163-.459-.633-.733-1.113-.65-.48 .083-.83 .5-.829 .987C6 15.216 6.784 16 7.75 16h1.25c1.105 0 2-.895 2-2v-1c0-1.105-.895-2-2-2h-1v-1h1.032l.026 .087c.163 .459 .633 .733 1.113 .65 .48-.083 .83-.5 .829-.987C11 8.784 10.216 8 9.25 8M15 10c.552 0 1 .448 1 1v2c-0 .507-.38 .934-.883 .993L15 14Z"),
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
        return _badgeSd!!
    }

private var _badgeSd: ImageVector? = null
