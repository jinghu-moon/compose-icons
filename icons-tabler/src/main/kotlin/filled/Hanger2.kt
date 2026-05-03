package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hanger2: ImageVector
    get() {
        if (_hanger2 != null) return _hanger2!!
        _hanger2 = tablerFilledIcon(
            name = "Hanger2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 13.657 2.000 15.000 3.343 15.000 5.000 C 14.999 5.529 14.587 5.966 14.059 5.997 C 13.530 6.028 13.069 5.642 13.007 5.117 L 13.000 5.000 C 13.001 4.448 12.554 3.999 12.002 3.998 C 11.450 3.997 11.001 4.444 11.000 4.996 C 11.006 6.512 11.495 7.575 12.486 8.126 L 20.456 12.554 C 21.409 13.083 22.000 14.087 22.000 15.177 L 22.000 16.000 C 22.000 17.589 20.762 18.902 19.176 18.995 L 19.000 19.000 C 19.000 20.657 17.657 22.000 16.000 22.000 L 8.000 22.000 C 6.343 22.000 5.000 20.657 5.000 19.000 C 3.343 19.000 2.000 17.657 2.000 16.000 L 2.000 15.177 C 2.000 14.087 2.590 13.083 3.543 12.554 L 10.238 8.834 C 9.406 7.858 9.006 6.538 9.000 5.000 C 9.000 3.343 10.343 2.000 12.000 2.000M 12.000 10.144 L 4.514 14.302 C 4.196 14.479 4.000 14.814 4.000 15.177 L 4.000 16.000 C 4.000 16.552 4.448 17.000 5.000 17.000 L 5.170 17.000 C 5.594 15.801 6.728 14.999 8.000 15.000 L 16.000 15.000 C 17.306 15.000 18.418 15.835 18.830 17.000 L 19.000 17.000 C 19.552 17.000 20.000 16.552 20.000 16.000 L 20.000 15.177 C 20.000 14.813 19.803 14.478 19.485 14.302 Z"),
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
        return _hanger2!!
    }

private var _hanger2: ImageVector? = null
