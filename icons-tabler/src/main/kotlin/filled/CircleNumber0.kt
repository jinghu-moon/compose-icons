package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber0: ImageVector
    get() {
        if (_circleNumber0 != null) return _circleNumber0!!
        _circleNumber0 = tablerFilledIcon(
            name = "CircleNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 7.000 C 10.411 7.000 9.098 8.238 9.005 9.824 L 9.000 10.000 L 9.000 14.000 L 9.005 14.176 C 9.097 15.763 10.410 17.003 12.000 17.003 C 13.590 17.003 14.903 15.763 14.995 14.176 L 15.000 14.000 L 15.000 10.000 L 14.995 9.824 C 14.902 8.238 13.589 7.000 12.000 7.000 ZM 12.000 9.000 C 12.507 9.000 12.934 9.380 12.993 9.883 L 13.000 10.000 L 13.000 14.000 L 12.993 14.117 C 12.933 14.620 12.507 14.999 12.000 14.999 C 11.493 14.999 11.067 14.620 11.007 14.117 L 11.000 14.000 L 11.000 10.000 L 11.007 9.883 C 11.066 9.380 11.493 9.000 12.000 9.000 Z"),
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
        return _circleNumber0!!
    }

private var _circleNumber0: ImageVector? = null
