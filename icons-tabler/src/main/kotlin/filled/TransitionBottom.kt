package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TransitionBottom: ImageVector
    get() {
        if (_transitionBottom != null) return _transitionBottom!!
        _transitionBottom = tablerFilledIcon(
            name = "TransitionBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 17.000 C 21.552 17.000 22.000 17.448 22.000 18.000 C 22.000 20.209 20.209 22.000 18.000 22.000 L 6.000 22.000 C 3.791 22.000 2.000 20.209 2.000 18.000 C 2.000 17.448 2.448 17.000 3.000 17.000 C 3.552 17.000 4.000 17.448 4.000 18.000 C 4.000 19.105 4.895 20.000 6.000 20.000 L 18.000 20.000 C 19.047 20.000 19.917 19.194 19.995 18.150 L 20.000 18.000 C 20.000 17.448 20.448 17.000 21.000 17.000M 12.000 18.000 L 11.918 17.996 L 11.799 17.980 L 11.688 17.950 L 11.577 17.906 L 11.479 17.854 L 11.383 17.787 L 11.293 17.707 L 8.293 14.707 C 7.914 14.315 7.919 13.691 8.305 13.305 C 8.691 12.919 9.315 12.914 9.707 13.293 L 11.000 14.586 L 11.000 10.000 L 6.000 10.000 C 3.791 10.000 2.000 8.209 2.000 6.000 C 2.000 3.791 3.791 2.000 6.000 2.000 L 18.000 2.000 C 20.209 2.000 22.000 3.791 22.000 6.000 C 22.000 8.209 20.209 10.000 18.000 10.000 L 13.000 10.000 L 13.000 14.583 L 14.293 13.293 C 14.649 12.937 15.215 12.901 15.613 13.210 L 15.707 13.293 C 16.097 13.684 16.097 14.316 15.707 14.707 L 12.707 17.707 L 12.595 17.804 L 12.485 17.875 L 12.423 17.906 L 12.342 17.940 L 12.266 17.964 L 12.117 17.994 Z"),
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
        return _transitionBottom!!
    }

private var _transitionBottom: ImageVector? = null
