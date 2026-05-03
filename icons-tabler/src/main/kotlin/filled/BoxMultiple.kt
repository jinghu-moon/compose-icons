package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BoxMultiple: ImageVector
    get() {
        if (_boxMultiple != null) return _boxMultiple!!
        _boxMultiple = tablerFilledIcon(
            name = "BoxMultiple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 5.667 C 6.000 3.642 7.642 2.000 9.667 2.000 L 18.333 2.000 C 20.358 2.000 22.000 3.642 22.000 5.667 L 22.000 14.333 C 22.000 16.358 20.358 18.000 18.333 18.000 L 9.667 18.000 C 7.642 18.000 6.000 16.358 6.000 14.333 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 2.000 9.000 C 2.000 7.906 2.533 7.172 3.514 6.626 C 3.997 6.358 4.606 6.531 4.874 7.014 C 5.142 7.497 4.969 8.106 4.486 8.374 C 4.088 8.595 4.000 8.716 4.000 9.000 L 4.000 19.000 C 4.000 19.548 4.452 20.000 5.000 20.000 L 14.998 20.000 C 15.318 20.000 15.616 19.846 15.803 19.593 L 15.868 19.493 C 16.141 19.013 16.752 18.846 17.232 19.119 C 17.712 19.392 17.879 20.003 17.606 20.483 C 17.073 21.420 16.078 21.999 15.000 22.000 L 5.000 22.000 C 3.348 22.000 2.000 20.652 2.000 19.000 Z"),
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
        return _boxMultiple!!
    }

private var _boxMultiple: ImageVector? = null
