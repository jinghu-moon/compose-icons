package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Mug: ImageVector
    get() {
        if (_mug != null) return _mug!!
        _mug = tablerFilledIcon(
            name = "Mug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.903 4.008 L 4.086 4.000 L 14.914 4.000 C 15.466 3.998 15.996 4.216 16.388 4.606 C 16.779 4.996 16.999 5.525 17.000 6.077 L 17.000 7.000 L 18.500 7.000 C 20.417 7.000 22.000 8.477 22.000 10.333 L 22.000 12.667 C 22.000 14.523 20.417 16.000 18.500 16.000 L 16.837 16.000 C 16.229 18.358 14.102 20.004 11.667 20.000 L 7.333 20.000 C 4.389 20.000 2.000 17.625 2.000 14.692 L 2.000 6.074 C 2.003 4.996 2.829 4.100 3.903 4.008M 17.000 14.000 L 18.500 14.000 C 19.343 14.000 20.000 13.387 20.000 12.667 L 20.000 10.333 C 20.000 9.613 19.343 9.000 18.500 9.000 L 17.000 9.000 Z"),
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
        return _mug!!
    }

private var _mug: ImageVector? = null
