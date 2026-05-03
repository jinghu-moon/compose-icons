package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ironing2: ImageVector
    get() {
        if (_ironing2 != null) return _ironing2!!
        _ironing2 = tablerFilledIcon(
            name = "Ironing2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.459 5.000 C 18.414 5.000 20.083 6.414 20.404 8.343 L 21.791 16.672 C 21.887 17.251 21.724 17.844 21.344 18.292 C 20.965 18.741 20.407 18.999 19.820 19.000 L 3.000 19.000 C 2.448 19.000 2.000 18.552 2.000 18.000 C 2.000 13.582 5.582 10.000 10.000 10.000 L 18.652 10.000 L 18.432 8.671 C 18.281 7.766 17.535 7.080 16.621 7.006 L 16.459 7.000 L 9.000 7.000 C 8.448 7.000 8.000 6.552 8.000 6.000 C 8.000 5.448 8.448 5.000 9.000 5.000 ZM 10.010 14.000 L 10.000 14.000 C 9.471 14.001 9.034 14.413 9.003 14.941 C 8.972 15.470 9.358 15.931 9.883 15.993 L 10.010 16.000 C 10.562 16.000 11.010 15.552 11.010 15.000 C 11.010 14.448 10.562 14.000 10.010 14.000M 14.010 14.000 L 14.000 14.000 C 13.471 14.001 13.034 14.413 13.003 14.941 C 12.972 15.470 13.358 15.931 13.883 15.993 L 14.010 16.000 C 14.562 16.000 15.010 15.552 15.010 15.000 C 15.010 14.448 14.562 14.000 14.010 14.000"),
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
        return _ironing2!!
    }

private var _ironing2: ImageVector? = null
