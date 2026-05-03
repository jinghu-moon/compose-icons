package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertSquare: ImageVector
    get() {
        if (_alertSquare != null) return _alertSquare!!
        _alertSquare = tablerFilledIcon(
            name = "AlertSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.589 2.000 21.902 3.238 21.995 4.824 L 22.000 5.000 L 22.000 19.000 C 22.000 20.589 20.762 21.902 19.176 21.995 L 19.000 22.000 L 5.000 22.000 C 3.411 22.000 2.098 20.762 2.005 19.176 L 2.000 19.000 L 2.000 5.000 C 2.000 3.411 3.238 2.098 4.824 2.005 L 5.000 2.000 L 19.000 2.000 ZM 12.010 15.000 L 11.883 15.007 C 11.380 15.067 11.001 15.493 11.001 16.000 C 11.001 16.507 11.380 16.933 11.883 16.993 L 12.000 17.000 L 12.127 16.993 C 12.630 16.933 13.009 16.507 13.009 16.000 C 13.009 15.493 12.630 15.067 12.127 15.007 L 12.010 15.000 ZM 12.000 7.000 C 11.493 7.000 11.066 7.380 11.007 7.883 L 11.000 8.000 L 11.000 12.000 L 11.007 12.117 C 11.067 12.620 11.493 12.999 12.000 12.999 C 12.507 12.999 12.933 12.620 12.993 12.117 L 13.000 12.000 L 13.000 8.000 L 12.993 7.883 C 12.934 7.380 12.507 7.000 12.000 7.000 Z"),
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
        return _alertSquare!!
    }

private var _alertSquare: ImageVector? = null
