package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertCircle: ImageVector
    get() {
        if (_alertCircle != null) return _alertCircle!!
        _alertCircle = tablerFilledIcon(
            name = "AlertCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.004 17.463 17.624 21.918 12.162 22.007 C 6.700 22.095 2.178 17.784 2.005 12.324 L 2.000 12.000 L 2.004 11.720 C 2.152 6.327 6.570 2.000 12.000 2.000 ZM 12.010 15.000 L 11.883 15.007 C 11.380 15.067 11.001 15.493 11.001 16.000 C 11.001 16.507 11.380 16.933 11.883 16.993 L 12.000 17.000 L 12.127 16.993 C 12.630 16.933 13.009 16.507 13.009 16.000 C 13.009 15.493 12.630 15.067 12.127 15.007 L 12.010 15.000 ZM 12.000 7.000 C 11.493 7.000 11.066 7.380 11.007 7.883 L 11.000 8.000 L 11.000 12.000 L 11.007 12.117 C 11.067 12.620 11.493 12.999 12.000 12.999 C 12.507 12.999 12.933 12.620 12.993 12.117 L 13.000 12.000 L 13.000 8.000 L 12.993 7.883 C 12.934 7.380 12.507 7.000 12.000 7.000 Z"),
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
        return _alertCircle!!
    }

private var _alertCircle: ImageVector? = null
