package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DropletHalf2: ImageVector
    get() {
        if (_dropletHalf2 != null) return _dropletHalf2!!
        _dropletHalf2 = tablerFilledIcon(
            name = "DropletHalf2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.905 2.923 L 14.003 3.058 L 18.923 10.364 C 19.502 11.329 19.858 12.411 19.966 13.531 L 19.990 13.857 C 19.997 13.904 20.000 13.951 20.000 14.000 L 19.998 14.060 C 20.054 16.360 19.054 18.642 17.128 20.200 C 14.159 22.602 9.842 22.602 6.873 20.200 C 4.969 18.660 3.969 16.413 4.008 14.129 C 3.995 14.018 3.999 13.906 4.021 13.796 C 4.091 12.684 4.402 11.600 4.934 10.620 L 5.106 10.318 L 9.999 3.058 C 10.184 2.783 10.425 2.549 10.708 2.372 C 11.763 1.712 13.154 1.959 13.905 2.922 ZM 11.845 4.030 L 11.768 4.068 L 11.727 4.098 L 11.690 4.134 L 11.657 4.176 L 6.794 11.390 C 6.495 11.890 6.275 12.433 6.143 13.000 L 17.866 13.000 C 17.760 12.543 17.595 12.102 17.376 11.687 L 17.235 11.436 L 12.344 4.175 C 12.229 4.019 12.024 3.960 11.844 4.030 Z"),
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
        return _dropletHalf2!!
    }

private var _dropletHalf2: ImageVector? = null
