package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = tablerFilledIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.425 1.414 L 3.650 5.410 C 2.631 5.977 1.999 7.051 2.000 8.217 L 2.000 15.502 C 2.002 16.680 2.645 17.763 3.678 18.328 L 10.373 22.565 C 11.407 23.135 12.593 23.135 13.573 22.597 L 20.377 18.295 C 21.357 17.758 22.000 16.677 22.000 15.502 L 22.000 8.218 L 21.995 8.014 C 21.939 7.067 21.470 6.193 20.711 5.624 L 20.604 5.549 L 20.597 5.542 C 20.541 5.491 20.481 5.447 20.416 5.409 L 13.640 1.414 C 12.639 0.862 11.425 0.862 10.424 1.414 Z"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
