package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeAr: ImageVector
    get() {
        if (_badgeAr != null) return _badgeAr!!
        _badgeAr = tablerFilledIcon(
            name = "BadgeAr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 8.500 8.000 C 7.119 8.000 6.000 9.119 6.000 10.500 L 6.000 15.000 C 6.000 15.552 6.448 16.000 7.000 16.000 C 7.552 16.000 8.000 15.552 8.000 15.000 L 8.000 14.000 L 9.000 14.000 L 9.000 15.000 C 9.000 15.507 9.380 15.934 9.883 15.993 L 10.000 16.000 C 10.552 16.000 11.000 15.552 11.000 15.000 L 11.000 10.500 C 11.000 9.119 9.881 8.000 8.500 8.000M 15.500 8.000 L 14.000 8.000 C 13.448 8.000 13.000 8.448 13.000 9.000 L 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 L 14.117 15.993 C 14.620 15.934 15.000 15.507 15.000 15.000 L 15.000 13.804 L 16.168 15.554 C 16.315 15.775 16.544 15.928 16.804 15.980 C 17.064 16.033 17.334 15.979 17.555 15.832 L 17.648 15.762 C 18.035 15.433 18.114 14.867 17.832 14.445 L 16.673 12.707 L 16.717 12.684 C 17.712 12.130 18.206 10.973 17.920 9.871 C 17.634 8.769 16.639 8.000 15.500 8.000M 8.500 10.000 C 8.776 10.000 9.000 10.224 9.000 10.500 L 9.000 12.000 L 8.000 12.000 L 8.000 10.500 C 8.000 10.259 8.172 10.051 8.410 10.008 ZM 15.500 10.000 C 15.776 10.000 16.000 10.224 16.000 10.500 C 16.000 10.776 15.776 11.000 15.500 11.000 L 15.000 11.000 L 15.000 10.000 Z"),
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
        return _badgeAr!!
    }

private var _badgeAr: ImageVector? = null
