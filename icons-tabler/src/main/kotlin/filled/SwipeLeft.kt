package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) return _swipeLeft!!
        _swipeLeft = tablerFilledIcon(
            name = "SwipeLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 7.000 C 18.631 7.001 20.811 9.040 20.988 11.665 C 21.164 14.290 19.276 16.603 16.668 16.955 C 14.061 17.307 11.627 15.579 11.100 13.001 L 6.415 13.000 L 7.707 14.293 C 8.063 14.649 8.099 15.215 7.790 15.613 L 7.707 15.707 C 7.317 16.097 6.683 16.097 6.293 15.707 L 3.293 12.707 C 3.258 12.672 3.226 12.635 3.196 12.595 L 3.125 12.485 L 3.071 12.371 L 3.036 12.266 L 3.011 12.148 L 3.004 12.090 L 3.000 12.000 L 3.003 11.925 L 3.020 11.799 L 3.050 11.688 L 3.094 11.577 L 3.146 11.479 L 3.213 11.383 L 3.293 11.293 L 6.293 8.293 C 6.685 7.914 7.309 7.919 7.695 8.305 C 8.081 8.691 8.086 9.315 7.707 9.707 L 6.415 11.000 L 11.100 11.000 C 11.575 8.672 13.624 7.000 16.000 7.000"),
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
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
