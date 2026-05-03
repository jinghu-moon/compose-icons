package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber5: ImageVector
    get() {
        if (_circleNumber5 != null) return _circleNumber5!!
        _circleNumber5 = tablerFilledIcon(
            name = "CircleNumber5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 14.000 7.000 L 10.000 7.000 C 9.493 7.000 9.066 7.380 9.007 7.883 L 9.000 8.000 L 9.000 12.000 C 9.000 12.507 9.380 12.934 9.883 12.993 L 10.000 13.000 L 13.000 13.000 L 13.000 15.000 L 11.000 15.000 L 10.993 14.883 C 10.931 14.358 10.470 13.972 9.941 14.003 C 9.413 14.034 9.001 14.471 9.000 15.000 C 9.000 16.047 9.806 16.917 10.850 16.995 L 11.000 17.000 L 13.000 17.000 C 14.047 17.000 14.917 16.194 14.995 15.150 L 15.000 15.000 L 15.000 13.000 C 15.000 11.953 14.194 11.083 13.150 11.005 L 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 14.000 9.000 C 14.507 9.000 14.934 8.620 14.993 8.117 L 15.000 8.000 C 15.000 7.493 14.620 7.066 14.117 7.007 L 14.000 7.000 Z"),
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
        return _circleNumber5!!
    }

private var _circleNumber5: ImageVector? = null
