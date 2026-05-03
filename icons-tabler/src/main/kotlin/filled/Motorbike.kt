package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Motorbike: ImageVector
    get() {
        if (_motorbike != null) return _motorbike!!
        _motorbike = tablerFilledIcon(
            name = "Motorbike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 5.000 C 15.379 5.000 15.725 5.214 15.894 5.553 L 19.119 12.002 L 19.199 12.005 C 21.380 12.114 23.070 13.951 22.998 16.133 C 22.925 18.315 21.117 20.036 18.934 19.999 C 16.751 19.963 15.000 18.183 15.000 16.000 L 15.005 15.800 C 15.075 14.396 15.876 13.132 17.116 12.470 L 16.559 11.355 L 13.207 14.707 C 13.020 14.895 12.765 15.000 12.500 15.000 L 8.874 15.000 Q 8.998 15.481 9.000 16.000 C 9.000 18.209 7.209 20.000 5.000 20.000 C 2.791 20.000 1.000 18.209 1.000 16.000 L 1.005 15.800 C 1.078 14.337 1.944 13.031 3.264 12.395 C 4.584 11.759 6.146 11.896 7.335 12.751 L 9.084 11.000 L 6.000 11.000 C 5.493 11.000 5.066 10.620 5.007 10.117 L 5.000 10.000 C 5.000 9.448 5.448 9.000 6.000 9.000 L 15.381 9.000 L 14.381 7.000 L 13.000 7.000 C 12.493 7.000 12.066 6.620 12.007 6.117 L 12.000 6.000 C 12.000 5.448 12.448 5.000 13.000 5.000 Z"),
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
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
