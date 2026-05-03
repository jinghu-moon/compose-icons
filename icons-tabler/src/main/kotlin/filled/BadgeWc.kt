package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeWc: ImageVector
    get() {
        if (_badgeWc != null) return _badgeWc!!
        _badgeWc = tablerFilledIcon(
            name = "BadgeWc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 11.466 8.000 C 10.959 8.017 10.545 8.411 10.503 8.917 L 10.299 11.362 L 9.894 10.552 L 9.831 10.442 C 9.633 10.146 9.292 9.978 8.937 10.001 C 8.582 10.024 8.265 10.234 8.106 10.552 L 7.700 11.362 L 7.497 8.917 C 7.455 8.411 7.041 8.017 6.534 8.000 L 6.417 8.003 C 6.153 8.025 5.908 8.151 5.736 8.354 C 5.565 8.556 5.481 8.819 5.503 9.083 L 6.003 15.083 L 6.019 15.200 C 6.194 16.110 7.460 16.315 7.894 15.447 L 9.000 13.236 L 10.106 15.447 C 10.558 16.351 11.913 16.090 11.996 15.083 L 12.496 9.083 C 12.542 8.533 12.133 8.049 11.583 8.003 ZM 15.500 8.000 C 14.119 8.000 13.000 9.119 13.000 10.500 L 13.000 13.500 C 13.000 14.881 14.119 16.000 15.500 16.000 C 16.881 16.000 18.000 14.881 18.000 13.500 C 18.000 12.948 17.552 12.500 17.000 12.500 C 16.448 12.500 16.000 12.948 16.000 13.500 C 16.000 13.776 15.776 14.000 15.500 14.000 C 15.224 14.000 15.000 13.776 15.000 13.500 L 15.000 10.500 C 15.000 10.224 15.224 10.000 15.500 10.000 C 15.776 10.000 16.000 10.224 16.000 10.500 C 16.000 11.052 16.448 11.500 17.000 11.500 C 17.552 11.500 18.000 11.052 18.000 10.500 C 18.000 9.119 16.881 8.000 15.500 8.000"),
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
        return _badgeWc!!
    }

private var _badgeWc: ImageVector? = null
