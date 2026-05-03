package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DropletHalf: ImageVector
    get() {
        if (_dropletHalf != null) return _dropletHalf!!
        _dropletHalf = tablerFilledIcon(
            name = "DropletHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.070 2.003 C 12.783 2.021 13.451 2.353 13.895 2.910 L 14.003 3.058 L 18.923 10.364 C 20.875 13.631 20.114 17.784 17.127 20.200 C 14.159 22.602 9.842 22.602 6.873 20.200 C 3.956 17.840 3.162 13.824 4.972 10.550 L 5.106 10.318 L 9.999 3.058 C 10.184 2.783 10.425 2.549 10.708 2.372 C 11.030 2.170 11.395 2.047 11.774 2.012 L 12.000 2.000 ZM 11.000 5.149 L 6.794 11.389 C 5.354 13.799 5.914 16.852 8.131 18.646 C 8.960 19.314 9.949 19.754 11.000 19.922 L 11.000 5.149 Z"),
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
        return _dropletHalf!!
    }

private var _dropletHalf: ImageVector? = null
