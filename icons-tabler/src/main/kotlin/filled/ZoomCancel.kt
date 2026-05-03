package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomCancel: ImageVector
    get() {
        if (_zoomCancel != null) return _zoomCancel!!
        _zoomCancel = tablerFilledIcon(
            name = "ZoomCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 3.072 C 16.002 4.228 17.406 6.193 17.851 8.461 C 18.296 10.730 17.737 13.080 16.320 14.906 L 21.707 20.293 C 22.086 20.685 22.081 21.309 21.695 21.695 C 21.309 22.081 20.685 22.086 20.293 21.707 L 14.905 16.320 C 12.492 18.192 9.224 18.528 6.481 17.185 C 3.739 15.842 2.000 13.054 2.000 10.000 L 2.005 9.715 C 2.105 6.910 3.668 4.362 6.124 3.002 C 8.580 1.642 11.569 1.668 14.000 3.072M 8.707 7.292 C 8.316 6.902 7.683 6.902 7.293 7.293 C 6.902 7.683 6.902 8.317 7.293 8.707 L 8.585 10.000 L 7.293 11.293 C 6.914 11.685 6.919 12.309 7.305 12.695 C 7.691 13.081 8.315 13.086 8.707 12.707 L 10.000 11.415 L 11.293 12.707 C 11.685 13.086 12.309 13.081 12.695 12.695 C 13.081 12.309 13.086 11.685 12.707 11.293 L 11.415 10.000 L 12.707 8.707 C 12.967 8.456 13.071 8.084 12.980 7.734 C 12.888 7.385 12.615 7.112 12.266 7.020 C 11.916 6.929 11.544 7.033 11.293 7.293 L 10.000 8.585 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _zoomCancel!!
    }

private var _zoomCancel: ImageVector? = null
