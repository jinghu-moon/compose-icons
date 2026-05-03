package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoOctagon: ImageVector
    get() {
        if (_infoOctagon != null) return _infoOctagon!!
        _infoOctagon = tablerFilledIcon(
            name = "InfoOctagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.897 1.000 C 15.880 1.000 16.828 1.362 17.561 2.016 L 17.726 2.172 L 21.826 6.272 C 22.523 6.967 22.938 7.895 22.994 8.877 L 23.000 9.104 L 23.000 14.898 C 23.000 15.881 22.638 16.829 21.984 17.562 L 21.828 17.727 L 17.728 21.827 C 17.033 22.523 16.107 22.939 15.125 22.995 L 14.898 23.001 L 9.103 23.001 C 8.120 23.001 7.172 22.639 6.439 21.984 L 6.274 21.828 L 2.174 17.728 C 1.478 17.033 1.062 16.106 1.006 15.124 L 1.000 14.897 L 1.000 9.103 C 1.000 8.120 1.362 7.172 2.016 6.439 L 2.172 6.274 L 6.272 2.174 C 6.967 1.477 7.895 1.062 8.877 1.006 L 9.104 1.000 L 14.897 1.000 ZM 12.000 11.000 L 11.000 11.000 L 10.883 11.007 C 10.380 11.067 10.001 11.493 10.001 12.000 C 10.001 12.507 10.380 12.933 10.883 12.993 L 11.000 13.000 L 11.000 16.000 L 11.007 16.117 C 11.061 16.576 11.424 16.939 11.883 16.993 L 12.000 17.000 L 13.000 17.000 L 13.117 16.993 C 13.576 16.939 13.939 16.576 13.993 16.117 L 14.000 16.000 L 13.993 15.883 C 13.944 15.465 13.639 15.122 13.229 15.026 L 13.117 15.006 L 13.000 15.000 L 13.000 12.000 L 12.993 11.883 C 12.939 11.424 12.576 11.061 12.117 11.007 L 12.000 11.000 ZM 12.010 8.000 L 11.883 8.007 C 11.380 8.067 11.001 8.493 11.001 9.000 C 11.001 9.507 11.380 9.933 11.883 9.993 L 12.000 10.000 L 12.127 9.993 C 12.630 9.933 13.009 9.507 13.009 9.000 C 13.009 8.493 12.630 8.067 12.127 8.007 L 12.010 8.000 Z"),
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
        return _infoOctagon!!
    }

private var _infoOctagon: ImageVector? = null
