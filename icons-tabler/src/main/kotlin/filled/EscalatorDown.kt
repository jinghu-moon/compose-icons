package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = tablerFilledIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.233 6.000 C 7.974 6.000 8.688 6.274 9.239 6.770 L 18.384 15.000 L 19.500 15.000 C 21.359 15.000 22.893 16.452 22.995 18.308 L 23.000 18.500 C 23.000 20.433 21.433 22.000 19.500 22.000 L 16.767 22.000 C 16.026 22.000 15.312 21.726 14.761 21.230 L 5.617 13.000 L 4.500 13.000 C 2.641 13.000 1.107 11.548 1.005 9.692 L 1.000 9.500 C 1.000 7.567 2.567 6.000 4.500 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.000 2.000 C 18.552 2.000 19.000 2.448 19.000 3.000 L 19.000 7.584 L 20.293 6.293 C 20.649 5.937 21.215 5.901 21.613 6.210 L 21.707 6.293 C 22.097 6.683 22.097 7.317 21.707 7.707 L 18.707 10.707 C 18.672 10.742 18.635 10.774 18.595 10.804 L 18.485 10.875 L 18.371 10.929 L 18.266 10.964 L 18.117 10.994 L 18.000 11.000 L 17.925 10.997 L 17.799 10.980 L 17.688 10.950 L 17.577 10.906 L 17.479 10.854 L 17.383 10.787 L 17.293 10.707 L 14.293 7.707 C 14.033 7.456 13.929 7.084 14.020 6.734 C 14.112 6.385 14.385 6.112 14.734 6.020 C 15.084 5.929 15.456 6.033 15.707 6.293 L 17.000 7.586 L 17.000 3.000 C 17.000 2.448 17.448 2.000 18.000 2.000"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
