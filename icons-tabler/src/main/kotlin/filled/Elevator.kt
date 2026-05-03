package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Elevator: ImageVector
    get() {
        if (_elevator != null) return _elevator!!
        _elevator = tablerFilledIcon(
            name = "Elevator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.105 3.000 20.000 3.895 20.000 5.000 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 L 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 L 4.000 5.000 C 4.000 3.895 4.895 3.000 6.000 3.000 ZM 10.707 13.293 C 10.456 13.033 10.084 12.929 9.734 13.020 C 9.385 13.112 9.112 13.385 9.020 13.734 C 8.929 14.084 9.033 14.456 9.293 14.707 L 11.293 16.707 C 11.684 17.097 12.316 17.097 12.707 16.707 L 14.707 14.707 C 15.097 14.316 15.097 13.684 14.707 13.293 L 14.613 13.210 C 14.215 12.901 13.649 12.937 13.293 13.293 L 11.999 14.585 ZM 12.707 7.293 C 12.316 6.903 11.684 6.903 11.293 7.293 L 9.293 9.293 C 8.903 9.684 8.903 10.316 9.293 10.707 L 9.387 10.790 C 9.785 11.099 10.351 11.063 10.707 10.707 L 12.000 9.415 L 13.293 10.707 C 13.685 11.086 14.309 11.081 14.695 10.695 C 15.081 10.309 15.086 9.685 14.707 9.293 Z"),
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
        return _elevator!!
    }

private var _elevator: ImageVector? = null
