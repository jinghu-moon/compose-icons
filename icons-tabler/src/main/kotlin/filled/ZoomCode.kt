package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCode: ImageVector
    get() {
        if (_zoomCode != null) return _zoomCode!!
        _zoomCode = tablerFilledIcon(
            name = "ZoomCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.072 C 16.002 4.228 17.406 6.193 17.851 8.461 C 18.296 10.730 17.737 13.080 16.320 14.906 L 21.707 20.293 C 22.086 20.685 22.081 21.309 21.695 21.695 C 21.309 22.081 20.685 22.086 20.293 21.707 L 14.905 16.320 C 12.492 18.192 9.224 18.528 6.481 17.185 C 3.739 15.842 2.000 13.054 2.000 10.000 L 2.005 9.715 C 2.105 6.910 3.668 4.362 6.124 3.002 C 8.580 1.642 11.569 1.668 14.000 3.072M 8.707 7.292 C 8.316 6.902 7.683 6.902 7.293 7.292 L 5.293 9.292 C 5.105 9.480 5.000 9.734 5.000 10.000 C 5.000 10.265 5.105 10.519 5.293 10.707 L 7.293 12.707 C 7.683 13.097 8.316 13.097 8.707 12.707 L 8.790 12.613 C 9.099 12.215 9.063 11.649 8.707 11.293 L 7.415 10.000 L 8.707 8.707 C 9.097 8.316 9.097 7.683 8.707 7.293M 12.707 7.293 C 12.316 6.903 11.684 6.903 11.293 7.293 L 11.210 7.388 C 10.901 7.786 10.937 8.352 11.293 8.708 L 12.585 10.000 L 11.293 11.293 C 10.914 11.685 10.919 12.309 11.305 12.695 C 11.691 13.081 12.315 13.086 12.707 12.707 L 14.707 10.707 C 15.097 10.316 15.097 9.684 14.707 9.293 Z"),
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
        return _zoomCode!!
    }

private var _zoomCode: ImageVector? = null
