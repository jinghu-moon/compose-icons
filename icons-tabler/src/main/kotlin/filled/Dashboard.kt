package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dashboard: ImageVector
    get() {
        if (_dashboard != null) return _dashboard!!
        _dashboard = tablerFilledIcon(
            name = "Dashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.954 C 16.253 2.954 20.041 5.644 21.442 9.659 C 22.843 13.675 21.552 18.137 18.222 20.783 C 18.045 20.924 17.826 21.000 17.600 21.000 L 6.400 21.000 C 6.174 21.000 5.955 20.924 5.778 20.783 C 2.448 18.137 1.157 13.675 2.558 9.659 C 3.959 5.644 7.747 2.954 12.000 2.954M 16.207 8.793 C 15.816 8.403 15.184 8.403 14.793 8.793 L 12.517 11.067 C 11.936 10.913 11.317 11.027 10.830 11.379 C 10.343 11.730 10.039 12.282 10.003 12.882 L 10.000 13.000 C 10.001 13.776 10.452 14.482 11.156 14.809 C 11.859 15.137 12.689 15.028 13.284 14.530 C 13.879 14.031 14.132 13.233 13.933 12.483 L 16.207 10.207 C 16.597 9.816 16.597 9.184 16.207 8.793"),
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
        return _dashboard!!
    }

private var _dashboard: ImageVector? = null
