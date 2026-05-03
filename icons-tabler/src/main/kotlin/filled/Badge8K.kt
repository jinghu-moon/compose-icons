package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Badge8K: ImageVector
    get() {
        if (_badge8K != null) return _badge8K!!
        _badge8K = tablerFilledIcon(
            name = "Badge8K",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 4.000 C 20.657 4.000 22.000 5.343 22.000 7.000 L 22.000 17.000 C 22.000 18.657 20.657 20.000 19.000 20.000 L 5.000 20.000 C 3.343 20.000 2.000 18.657 2.000 17.000 L 2.000 7.000 C 2.000 5.343 3.343 4.000 5.000 4.000 ZM 17.555 8.168 C 17.334 8.021 17.064 7.967 16.804 8.019 C 16.544 8.071 16.315 8.224 16.168 8.445 L 15.000 10.196 L 15.000 9.000 C 15.000 8.493 14.620 8.066 14.117 8.007 L 14.000 8.000 C 13.448 8.000 13.000 8.448 13.000 9.000 L 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 C 14.552 16.000 15.000 15.552 15.000 15.000 L 15.000 13.804 L 16.168 15.554 C 16.449 15.976 17.002 16.121 17.454 15.891 L 17.554 15.832 L 17.648 15.762 C 18.035 15.433 18.114 14.867 17.832 14.445 L 16.202 12.000 L 17.832 9.555 C 17.979 9.334 18.033 9.064 17.981 8.804 C 17.929 8.544 17.776 8.315 17.555 8.168M 9.000 8.000 L 8.000 8.000 C 6.895 8.000 6.000 8.895 6.000 10.000 L 6.000 11.000 L 6.005 11.150 C 6.027 11.445 6.113 11.723 6.250 11.969 L 6.269 12.000 L 6.249 12.031 C 6.085 12.328 6.000 12.661 6.000 13.000 L 6.000 14.000 C 6.000 15.105 6.895 16.000 8.000 16.000 L 9.000 16.000 C 10.105 16.000 11.000 15.105 11.000 14.000 L 11.000 13.000 L 10.995 12.850 C 10.973 12.563 10.890 12.283 10.750 12.031 L 10.731 12.000 L 10.751 11.969 C 10.909 11.682 11.000 11.351 11.000 11.000 L 11.000 10.000 C 11.000 8.895 10.105 8.000 9.000 8.000M 9.000 13.000 L 9.000 14.000 L 8.000 14.000 L 8.000 13.000 ZM 9.000 10.000 L 9.000 11.000 L 8.000 11.000 L 8.000 10.000 Z"),
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
        return _badge8K!!
    }

private var _badge8K: ImageVector? = null
