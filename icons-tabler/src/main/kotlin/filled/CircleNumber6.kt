package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber6: ImageVector
    get() {
        if (_circleNumber6 != null) return _circleNumber6!!
        _circleNumber6 = tablerFilledIcon(
            name = "CircleNumber6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 13.000 7.000 L 11.000 7.000 L 10.850 7.005 C 9.866 7.079 9.083 7.859 9.006 8.843 L 9.000 9.000 L 9.000 15.000 L 9.005 15.150 C 9.079 16.134 9.859 16.917 10.843 16.994 L 11.000 17.000 L 13.000 17.000 L 13.150 16.995 C 14.134 16.921 14.917 16.141 14.994 15.157 L 15.000 15.000 L 15.000 13.000 L 14.995 12.850 C 14.921 11.866 14.141 11.083 13.157 11.006 L 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 13.000 9.000 L 13.007 9.117 C 13.069 9.642 13.530 10.028 14.059 9.997 C 14.587 9.966 14.999 9.529 15.000 9.000 C 15.000 7.953 14.194 7.083 13.150 7.005 L 13.000 7.000 ZM 13.000 13.000 L 13.000 15.000 L 11.000 15.000 L 11.000 13.000 L 13.000 13.000 Z"),
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
        return _circleNumber6!!
    }

private var _circleNumber6: ImageVector? = null
