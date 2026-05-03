package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flask2: ImageVector
    get() {
        if (_flask2 != null) return _flask2!!
        _flask2 = tablerFilledIcon(
            name = "Flask2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 2.000 C 15.552 2.000 16.000 2.448 16.000 3.000 C 16.000 3.552 15.552 4.000 15.000 4.000 L 15.000 9.674 L 15.062 9.704 C 17.111 10.700 18.547 12.630 18.912 14.878 L 18.949 15.140 C 19.275 17.774 18.083 20.366 15.871 21.833 C 15.707 21.942 15.515 22.000 15.318 22.000 L 8.683 22.000 C 8.487 22.000 8.295 21.942 8.131 21.834 C 6.035 20.446 4.844 18.041 5.011 15.533 C 5.177 13.024 6.676 10.798 8.938 9.700 L 9.000 9.672 L 9.000 4.000 C 8.448 4.000 8.000 3.552 8.000 3.000 C 8.000 2.448 8.448 2.000 9.000 2.000 L 15.000 2.000 ZM 13.000 4.000 L 11.000 4.000 L 11.000 10.340 C 11.000 10.718 10.787 11.064 10.449 11.234 L 10.333 11.283 C 9.025 11.744 7.967 12.729 7.413 14.000 L 16.585 14.000 C 16.031 12.730 14.974 11.746 13.667 11.285 C 13.267 11.144 13.000 10.766 13.000 10.342 L 13.000 4.000 Z"),
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
        return _flask2!!
    }

private var _flask2: ImageVector? = null
