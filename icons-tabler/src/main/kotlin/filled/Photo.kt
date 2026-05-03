package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Photo: ImageVector
    get() {
        if (_photo != null) return _photo!!
        _photo = tablerFilledIcon(
            name = "Photo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.813 11.612 C 9.270 11.232 9.731 11.232 10.199 11.623 L 10.307 11.721 L 15.293 16.707 L 15.387 16.790 C 15.785 17.099 16.351 17.063 16.707 16.707 C 17.063 16.351 17.099 15.785 16.790 15.387 L 16.707 15.293 L 15.415 14.000 L 15.707 13.707 L 15.813 13.612 C 16.270 13.232 16.731 13.232 17.199 13.623 L 17.307 13.721 L 21.981 18.396 C 21.785 20.364 20.181 21.893 18.206 21.995 L 18.000 22.000 L 6.000 22.000 C 3.945 22.000 2.224 20.442 2.020 18.397 L 8.707 11.707 L 8.813 11.612 ZM 18.000 2.000 C 20.131 2.000 21.888 3.671 21.995 5.800 L 22.000 6.000 L 22.000 15.585 L 18.707 12.293 L 18.557 12.156 C 17.301 11.061 15.707 11.059 14.461 12.139 L 14.307 12.279 L 14.000 12.585 L 11.707 10.293 L 11.557 10.156 C 10.301 9.061 8.707 9.059 7.461 10.139 L 7.307 10.279 L 2.000 15.585 L 2.000 6.000 C 2.000 3.869 3.671 2.112 5.800 2.005 L 6.000 2.000 L 18.000 2.000 ZM 15.010 7.000 L 14.883 7.007 C 14.380 7.067 14.001 7.493 14.001 8.000 C 14.001 8.507 14.380 8.933 14.883 8.993 L 15.000 9.000 L 15.127 8.993 C 15.630 8.933 16.009 8.507 16.009 8.000 C 16.009 7.493 15.630 7.067 15.127 7.007 L 15.010 7.000 Z"),
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
        return _photo!!
    }

private var _photo: ImageVector? = null
