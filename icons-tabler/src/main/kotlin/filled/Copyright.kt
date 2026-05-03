package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = tablerFilledIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.167 5.746 23.030 10.779 21.433 15.319 C 19.836 19.858 15.232 22.617 10.476 21.883 C 5.720 21.150 2.161 17.134 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 14.660 8.999 C 13.048 7.582 10.606 7.683 9.117 9.229 C 7.626 10.776 7.626 13.224 9.117 14.771 C 10.606 16.317 13.048 16.418 14.660 15.001 C 15.062 14.633 15.096 14.012 14.736 13.603 C 14.377 13.194 13.756 13.148 13.340 13.499 C 12.530 14.210 11.305 14.159 10.557 13.383 C 9.813 12.611 9.813 11.389 10.557 10.617 C 11.305 9.841 12.530 9.790 13.340 10.501 C 13.757 10.843 14.369 10.793 14.725 10.388 C 15.081 9.984 15.053 9.370 14.660 9.000 Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
