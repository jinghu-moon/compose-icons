package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomExclamation: ImageVector
    get() {
        if (_zoomExclamation != null) return _zoomExclamation!!
        _zoomExclamation = tablerFilledIcon(
            name = "ZoomExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 3.072 C 16.002 4.228 17.406 6.193 17.851 8.461 C 18.296 10.730 17.737 13.080 16.320 14.906 L 21.707 20.293 C 22.086 20.685 22.081 21.309 21.695 21.695 C 21.309 22.081 20.685 22.086 20.293 21.707 L 14.905 16.320 C 12.492 18.192 9.224 18.528 6.481 17.185 C 3.739 15.842 2.000 13.054 2.000 10.000 L 2.005 9.715 C 2.105 6.910 3.668 4.362 6.124 3.002 C 8.580 1.642 11.569 1.668 14.000 3.072M 10.000 12.000 C 9.448 12.000 9.000 12.448 9.000 13.000 L 9.007 13.127 C 9.069 13.652 9.530 14.038 10.059 14.007 C 10.587 13.976 10.999 13.539 11.000 13.010 L 10.993 12.883 C 10.934 12.380 10.507 12.000 10.000 12.000M 10.000 6.000 C 9.448 6.000 9.000 6.448 9.000 7.000 L 9.000 10.000 C 9.000 10.552 9.448 11.000 10.000 11.000 C 10.552 11.000 11.000 10.552 11.000 10.000 L 11.000 7.000 C 11.000 6.448 10.552 6.000 10.000 6.000"),
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
        return _zoomExclamation!!
    }

private var _zoomExclamation: ImageVector? = null
