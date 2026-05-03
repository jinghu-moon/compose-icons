package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) return _lemon2!!
        _lemon2 = tablerFilledIcon(
            name = "Lemon2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 19.123 3.000 20.153 3.627 20.667 4.626 C 21.182 5.625 21.095 6.827 20.443 7.742 L 20.383 7.818 L 20.420 7.905 C 21.689 11.092 20.848 14.989 18.217 17.777 L 18.000 18.000 C 15.200 20.800 11.177 21.723 7.905 20.420 L 7.818 20.384 L 7.685 20.482 C 7.067 20.902 6.315 21.076 5.575 20.970 L 5.370 20.934 C 4.394 20.725 3.586 20.044 3.214 19.117 C 2.843 18.190 2.957 17.140 3.518 16.314 L 3.616 16.180 L 3.580 16.095 C 2.311 12.908 3.152 9.011 5.783 6.223 L 6.000 6.000 C 8.800 3.200 12.823 2.277 16.095 3.580 L 16.180 3.617 L 16.304 3.526 C 16.746 3.222 17.262 3.043 17.797 3.006 Z"),
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
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
