package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertOctagon: ImageVector
    get() {
        if (_alertOctagon != null) return _alertOctagon!!
        _alertOctagon = tablerFilledIcon(
            name = "AlertOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.897 1.000 C 15.880 1.000 16.828 1.362 17.561 2.016 L 17.726 2.172 L 21.826 6.272 C 22.523 6.967 22.938 7.895 22.994 8.877 L 23.000 9.104 L 23.000 14.898 C 23.000 15.881 22.638 16.829 21.984 17.562 L 21.828 17.727 L 17.728 21.827 C 17.033 22.523 16.107 22.939 15.125 22.995 L 14.898 23.001 L 9.103 23.001 C 8.120 23.001 7.172 22.639 6.439 21.984 L 6.274 21.828 L 2.174 17.728 C 1.478 17.033 1.062 16.106 1.006 15.124 L 1.000 14.897 L 1.000 9.103 C 1.000 8.120 1.362 7.172 2.016 6.439 L 2.172 6.274 L 6.272 2.174 C 6.967 1.477 7.895 1.062 8.877 1.006 L 9.104 1.000 L 14.897 1.000 ZM 12.010 15.000 L 11.883 15.007 C 11.380 15.067 11.001 15.493 11.001 16.000 C 11.001 16.507 11.380 16.933 11.883 16.993 L 12.000 17.000 L 12.127 16.993 C 12.630 16.933 13.009 16.507 13.009 16.000 C 13.009 15.493 12.630 15.067 12.127 15.007 L 12.010 15.000 ZM 12.000 7.000 C 11.493 7.000 11.066 7.380 11.007 7.883 L 11.000 8.000 L 11.000 12.000 L 11.007 12.117 C 11.067 12.620 11.493 12.999 12.000 12.999 C 12.507 12.999 12.933 12.620 12.993 12.117 L 13.000 12.000 L 13.000 8.000 L 12.993 7.883 C 12.934 7.380 12.507 7.000 12.000 7.000 Z"),
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
        return _alertOctagon!!
    }

private var _alertOctagon: ImageVector? = null
