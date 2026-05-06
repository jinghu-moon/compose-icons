package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CloudDataConnection: ImageVector
    get() {
        if (_cloudDataConnection != null) return _cloudDataConnection!!
        _cloudDataConnection = tablerFilledIcon(
            name = "CloudDataConnection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.262 4.087c.974 .768 1.566 1.848 1.678 2.997l.007 .107 .18 .025c1.584 .257 2.777 1.581 2.867 3.184l.006 .188c-.004 1.888-1.537 3.415-3.425 3.412h-3.575l.001 1.171c.855 .302 1.527 .974 1.829 1.829h6.17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6.17c-.423 1.2-1.558 2.002-2.83 2.002C10.728 21.002 9.593 20.2 9.17 19h-6.17C2.448 19 2 18.552 2 18c0-.552 .448-1 1-1h6.171c.302-.855 .974-1.528 1.829-1.83v-1.17h-2.74C5.919 14 4 12.174 4 9.897 4 7.896 5.481 6.242 7.43 5.871l.086-.015 .049-.112C8.079 4.62 9.073 3.734 10.321 3.297l.222-.072c1.627-.49 3.42-.166 4.72 .862"),
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
        return _cloudDataConnection!!
    }

private var _cloudDataConnection: ImageVector? = null
