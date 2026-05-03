package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Caravan: ImageVector
    get() {
        if (_caravan != null) return _caravan!!
        _caravan = tablerFilledIcon(
            name = "Caravan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.949 3.684 L 16.720 6.000 L 18.000 6.000 C 19.657 6.000 21.000 7.343 21.000 9.000 L 21.000 15.000 L 22.000 15.000 C 22.552 15.000 23.000 15.448 23.000 16.000 C 23.000 16.552 22.552 17.000 22.000 17.000 L 20.830 17.000 C 20.406 18.199 19.272 19.001 18.000 19.000 L 11.830 19.000 C 11.407 20.200 10.272 21.002 9.000 21.002 C 7.728 21.002 6.593 20.200 6.170 19.000 L 5.000 19.000 C 3.343 19.000 2.000 17.657 2.000 16.000 L 2.000 12.500 C 2.000 9.230 4.429 6.469 7.672 6.052 L 14.606 3.081 C 14.863 2.971 15.155 2.973 15.410 3.088 C 15.665 3.202 15.861 3.419 15.949 3.684M 9.000 17.000 C 8.448 17.000 8.000 17.448 8.000 18.000 C 8.000 18.552 8.448 19.000 9.000 19.000 C 9.552 19.000 10.000 18.552 10.000 18.000 C 10.000 17.448 9.552 17.000 9.000 17.000M 14.500 10.000 L 13.500 10.000 C 12.672 10.000 12.000 10.672 12.000 11.500 L 12.000 12.500 C 12.000 13.328 12.672 14.000 13.500 14.000 L 14.500 14.000 C 15.328 14.000 16.000 13.328 16.000 12.500 L 16.000 11.500 C 16.000 10.672 15.328 10.000 14.500 10.000M 14.395 5.347 L 12.871 6.000 L 14.613 6.000 Z"),
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
        return _caravan!!
    }

private var _caravan: ImageVector? = null
