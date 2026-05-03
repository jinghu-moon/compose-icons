package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Circle: ImageVector
    get() {
        if (_circle != null) return _circle!!
        _circle = tablerFilledIcon(
            name = "Circle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 3.340 C 10.894 1.092 15.809 1.719 19.014 4.872 C 22.218 8.026 22.924 12.930 20.740 16.860 C 18.555 20.789 14.016 22.778 9.647 21.720 C 5.277 20.662 2.150 16.818 2.005 12.324 L 2.000 12.000 L 2.005 11.676 C 2.117 8.221 4.006 5.068 7.000 3.340 Z"),
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
        return _circle!!
    }

private var _circle: ImageVector? = null
