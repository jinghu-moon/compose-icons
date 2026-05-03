package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Droplet: ImageVector
    get() {
        if (_droplet != null) return _droplet!!
        _droplet = tablerFilledIcon(
            name = "Droplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.708 2.372 C 10.426 2.549 10.184 2.782 9.998 3.058 L 5.106 10.318 C 3.125 13.632 3.886 17.784 6.873 20.200 C 9.842 22.602 14.159 22.602 17.127 20.200 C 20.114 17.784 20.875 13.631 18.922 10.364 L 14.003 3.058 C 13.281 1.983 11.811 1.682 10.708 2.372 Z"),
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
        return _droplet!!
    }

private var _droplet: ImageVector? = null
