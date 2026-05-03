package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = tablerFilledIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 5.000 C 21.047 5.000 21.917 5.806 21.995 6.850 L 22.000 7.000 L 22.000 17.000 C 22.000 18.047 21.194 18.917 20.150 18.995 L 20.000 19.000 L 9.000 19.000 C 8.780 19.000 8.567 18.928 8.392 18.794 L 8.292 18.707 L 3.255 13.667 C 2.446 12.763 2.408 11.417 3.172 10.437 L 3.292 10.293 L 8.292 5.293 C 8.448 5.137 8.651 5.038 8.869 5.009 L 9.000 5.000 L 20.000 5.000 ZM 12.511 9.140 C 12.098 8.894 11.568 8.977 11.250 9.337 C 10.932 9.698 10.915 10.233 11.210 10.613 L 11.293 10.707 L 12.585 12.000 L 11.293 13.293 L 11.210 13.387 C 10.901 13.785 10.937 14.351 11.293 14.707 C 11.649 15.063 12.215 15.099 12.613 14.790 L 12.707 14.707 L 14.000 13.415 L 15.293 14.707 L 15.387 14.790 C 15.785 15.099 16.351 15.063 16.707 14.707 C 17.063 14.351 17.099 13.785 16.790 13.387 L 16.707 13.293 L 15.415 12.000 L 16.707 10.707 L 16.790 10.613 C 17.099 10.215 17.063 9.649 16.707 9.293 C 16.351 8.937 15.785 8.901 15.387 9.210 L 15.293 9.293 L 14.000 10.585 L 12.707 9.293 L 12.613 9.210 L 12.511 9.140 Z"),
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
        return _backspace!!
    }

private var _backspace: ImageVector? = null
