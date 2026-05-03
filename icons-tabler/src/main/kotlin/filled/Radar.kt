package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Radar: ImageVector
    get() {
        if (_radar != null) return _radar!!
        _radar = tablerFilledIcon(
            name = "Radar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 10.000 C 12.678 10.000 13.309 10.343 13.678 10.911 L 13.731 11.000 L 21.000 11.000 L 21.117 11.007 C 21.620 11.066 22.000 11.493 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 11.448 22.000 11.000 21.552 11.000 21.000 L 11.000 13.731 L 10.911 13.678 C 10.387 13.338 10.052 12.772 10.005 12.149 L 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000M 21.428 8.666 C 21.591 9.180 21.318 9.731 20.809 9.912 C 20.301 10.092 19.741 9.836 19.544 9.334 C 18.298 5.824 14.795 3.638 11.094 4.062 C 7.394 4.486 4.476 7.407 4.056 11.108 C 3.636 14.809 5.826 18.310 9.337 19.552 C 9.858 19.736 10.131 20.307 9.947 20.828 C 9.763 21.349 9.192 21.622 8.671 21.438 C 4.281 19.886 1.543 15.510 2.067 10.883 C 2.592 6.257 6.240 2.604 10.866 2.075 C 15.492 1.545 19.871 4.278 21.428 8.666M 16.800 8.400 C 17.131 8.842 17.042 9.469 16.600 9.800 C 16.158 10.131 15.531 10.042 15.200 9.600 C 14.261 8.348 12.678 7.759 11.149 8.092 C 9.619 8.425 8.425 9.619 8.092 11.149 C 7.759 12.678 8.348 14.261 9.600 15.200 C 10.042 15.531 10.131 16.158 9.800 16.600 C 9.469 17.042 8.842 17.131 8.400 16.800 C 6.522 15.391 5.638 13.017 6.138 10.723 C 6.637 8.429 8.429 6.637 10.723 6.138 C 13.017 5.638 15.391 6.522 16.800 8.400"),
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
        return _radar!!
    }

private var _radar: ImageVector? = null
