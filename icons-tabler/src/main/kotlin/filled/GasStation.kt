package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.GasStation: ImageVector
    get() {
        if (_gasStation != null) return _gasStation!!
        _gasStation = tablerFilledIcon(
            name = "GasStation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 C 2.000 19.448 2.448 19.000 3.000 19.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 12.000 3.000 C 13.657 3.000 15.000 4.343 15.000 6.000 L 15.000 10.000 C 16.657 10.000 18.000 11.343 18.000 13.000 L 18.000 16.000 C 18.000 16.276 18.224 16.500 18.500 16.500 C 18.776 16.500 19.000 16.276 19.000 16.000 L 19.000 10.000 C 17.895 10.000 17.000 9.105 17.000 8.000 L 17.000 7.415 L 16.293 6.707 C 15.937 6.351 15.901 5.785 16.210 5.387 L 16.293 5.293 C 16.684 4.903 17.316 4.903 17.707 5.293 L 20.710 8.295 L 20.805 8.407 L 20.833 8.447 L 20.877 8.520 L 20.929 8.630 L 20.960 8.720 L 20.980 8.796 L 20.992 8.874 L 21.000 9.000 L 21.000 16.000 C 21.000 17.381 19.881 18.500 18.500 18.500 C 17.119 18.500 16.000 17.381 16.000 16.000 L 16.000 13.000 C 16.000 12.448 15.552 12.000 15.000 12.000 L 15.000 19.000 C 15.552 19.000 16.000 19.448 16.000 20.000 C 16.000 20.552 15.552 21.000 15.000 21.000 ZM 12.000 5.000 L 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 L 5.000 10.000 L 13.000 10.000 L 13.000 6.000 C 13.000 5.448 12.552 5.000 12.000 5.000"),
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
        return _gasStation!!
    }

private var _gasStation: ImageVector? = null
