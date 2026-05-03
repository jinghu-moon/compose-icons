package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber1: ImageVector
    get() {
        if (_circleNumber1 != null) return _circleNumber1!!
        _circleNumber1 = tablerFilledIcon(
            name = "CircleNumber1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.994 7.886 C 12.911 7.109 11.986 6.726 11.377 7.216 L 11.293 7.293 L 9.293 9.293 L 9.210 9.387 C 8.930 9.748 8.930 10.252 9.210 10.613 L 9.293 10.707 L 9.387 10.790 C 9.748 11.070 10.252 11.070 10.613 10.790 L 10.707 10.707 L 11.000 10.414 L 11.000 16.000 L 11.007 16.117 C 11.067 16.620 11.493 16.999 12.000 16.999 C 12.507 16.999 12.933 16.620 12.993 16.117 L 13.000 16.000 L 13.000 8.000 L 12.994 7.886 Z"),
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
        return _circleNumber1!!
    }

private var _circleNumber1: ImageVector? = null
