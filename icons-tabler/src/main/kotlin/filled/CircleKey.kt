package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleKey: ImageVector
    get() {
        if (_circleKey != null) return _circleKey!!
        _circleKey = tablerFilledIcon(
            name = "CircleKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 14.000 7.000 C 12.478 7.000 11.198 8.139 11.020 9.650 L 11.005 9.824 L 11.000 10.000 L 11.005 10.176 C 11.024 10.495 11.092 10.800 11.202 11.084 L 11.292 11.293 L 7.792 14.793 L 7.710 14.887 C 7.430 15.248 7.430 15.752 7.710 16.113 L 7.793 16.207 L 9.293 17.707 L 9.387 17.790 C 9.748 18.070 10.252 18.070 10.613 17.790 L 10.707 17.707 L 10.790 17.613 C 11.070 17.252 11.070 16.748 10.790 16.387 L 10.707 16.293 L 9.915 15.500 L 10.500 14.915 L 11.293 15.707 L 11.387 15.790 C 11.785 16.099 12.351 16.063 12.707 15.707 C 13.063 15.351 13.099 14.785 12.790 14.387 L 12.707 14.293 L 11.915 13.500 L 12.707 12.708 C 13.819 13.238 15.143 13.035 16.044 12.194 C 16.945 11.354 17.241 10.048 16.790 8.902 C 16.339 7.755 15.232 7.001 14.000 7.000 ZM 14.000 9.000 C 14.552 9.000 15.000 9.448 15.000 10.000 C 15.000 10.552 14.552 11.000 14.000 11.000 C 13.448 11.000 13.000 10.552 13.000 10.000 C 13.000 9.448 13.448 9.000 14.000 9.000"),
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
        return _circleKey!!
    }

private var _circleKey: ImageVector? = null
