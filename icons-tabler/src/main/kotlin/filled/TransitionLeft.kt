package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionLeft: ImageVector
    get() {
        if (_transitionLeft != null) return _transitionLeft!!
        _transitionLeft = tablerFilledIcon(
            name = "TransitionLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 2.000 C 6.552 2.000 7.000 2.448 7.000 3.000 C 7.000 3.552 6.552 4.000 6.000 4.000 C 4.895 4.000 4.000 4.895 4.000 6.000 L 4.000 18.000 C 4.000 19.047 4.806 19.917 5.850 19.995 L 6.000 20.000 C 6.552 20.000 7.000 20.448 7.000 21.000 C 7.000 21.552 6.552 22.000 6.000 22.000 C 3.791 22.000 2.000 20.209 2.000 18.000 L 2.000 6.000 C 2.000 3.791 3.791 2.000 6.000 2.000M 18.000 2.000 C 20.209 2.000 22.000 3.791 22.000 6.000 L 22.000 18.000 C 22.000 20.209 20.209 22.000 18.000 22.000 C 15.791 22.000 14.000 20.209 14.000 18.000 L 14.000 13.000 L 9.415 13.000 L 10.707 14.293 C 11.063 14.649 11.099 15.215 10.790 15.613 L 10.707 15.707 C 10.316 16.097 9.684 16.097 9.293 15.707 L 6.293 12.707 L 6.196 12.595 L 6.125 12.485 L 6.094 12.423 L 6.060 12.342 L 6.036 12.266 L 6.011 12.148 L 6.004 12.090 L 6.000 11.982 L 6.003 11.918 L 6.020 11.799 L 6.050 11.688 L 6.094 11.577 L 6.146 11.479 L 6.213 11.383 L 6.293 11.293 L 9.293 8.293 C 9.685 7.914 10.309 7.919 10.695 8.305 C 11.081 8.691 11.086 9.315 10.707 9.707 L 9.415 11.000 L 14.000 11.000 L 14.000 6.000 C 14.000 3.791 15.791 2.000 18.000 2.000"),
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
        return _transitionLeft!!
    }

private var _transitionLeft: ImageVector? = null
