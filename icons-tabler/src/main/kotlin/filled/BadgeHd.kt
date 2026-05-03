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
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 15.000 8.000 L 14.000 8.000 C 13.448 8.000 13.000 8.448 13.000 9.000 L 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 L 15.000 16.000 C 16.657 16.000 18.000 14.657 18.000 13.000 L 18.000 11.000 C 18.000 9.343 16.657 8.000 15.000 8.000M 10.000 8.000 C 9.448 8.000 9.000 8.448 9.000 9.000 L 9.000 11.000 L 8.000 11.000 L 8.000 9.000 C 8.000 8.493 7.620 8.066 7.117 8.007 L 7.000 8.000 C 6.448 8.000 6.000 8.448 6.000 9.000 L 6.000 15.000 C 6.000 15.552 6.448 16.000 7.000 16.000 C 7.552 16.000 8.000 15.552 8.000 15.000 L 8.000 13.000 L 9.000 13.000 L 9.000 15.000 C 9.000 15.507 9.380 15.934 9.883 15.993 L 10.000 16.000 C 10.552 16.000 11.000 15.552 11.000 15.000 L 11.000 9.000 C 11.000 8.448 10.552 8.000 10.000 8.000M 15.000 10.000 C 15.552 10.000 16.000 10.448 16.000 11.000 L 16.000 13.000 C 16.000 13.507 15.620 13.934 15.117 13.993 L 15.000 14.000 Z"),
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
