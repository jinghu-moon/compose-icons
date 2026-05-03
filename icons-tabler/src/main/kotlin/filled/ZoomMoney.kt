package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomMoney: ImageVector
    get() {
        if (_zoomMoney != null) return _zoomMoney!!
        _zoomMoney = tablerFilledIcon(
            name = "ZoomMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.072 C 16.002 4.228 17.406 6.193 17.851 8.461 C 18.296 10.730 17.737 13.080 16.320 14.906 L 21.707 20.293 C 22.086 20.685 22.081 21.309 21.695 21.695 C 21.309 22.081 20.685 22.086 20.293 21.707 L 14.905 16.320 C 12.492 18.192 9.224 18.528 6.481 17.185 C 3.739 15.842 2.000 13.054 2.000 10.000 L 2.005 9.715 C 2.105 6.910 3.668 4.362 6.124 3.002 C 8.580 1.642 11.569 1.668 14.000 3.072M 12.000 6.000 L 9.500 6.000 C 8.119 6.000 7.000 7.119 7.000 8.500 C 7.000 9.881 8.119 11.000 9.500 11.000 L 10.500 11.000 C 10.776 11.000 11.000 11.224 11.000 11.500 C 11.000 11.776 10.776 12.000 10.500 12.000 L 8.000 12.000 C 7.448 12.000 7.000 12.448 7.000 13.000 C 7.000 13.552 7.448 14.000 8.000 14.000 L 10.500 14.000 C 11.881 14.000 13.000 12.881 13.000 11.500 C 13.000 10.119 11.881 9.000 10.500 9.000 L 9.500 9.000 C 9.224 9.000 9.000 8.776 9.000 8.500 C 9.000 8.224 9.224 8.000 9.500 8.000 L 12.000 8.000 C 12.552 8.000 13.000 7.552 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000"),
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
        return _zoomMoney!!
    }

private var _zoomMoney: ImageVector? = null
