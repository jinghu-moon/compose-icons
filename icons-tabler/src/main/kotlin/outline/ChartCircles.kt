package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartCircles: ImageVector
    get() {
        if (_chartCircles != null) return _chartCircles!!
        _chartCircles = tablerOutlineIcon(
            name = "ChartCircles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 9.500 C 4.000 12.538 6.462 15.000 9.500 15.000 C 12.538 15.000 15.000 12.538 15.000 9.500 C 15.000 6.462 12.538 4.000 9.500 4.000 C 6.462 4.000 4.000 6.462 4.000 9.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.000 14.500 C 9.000 17.538 11.462 20.000 14.500 20.000 C 17.538 20.000 20.000 17.538 20.000 14.500 C 20.000 11.462 17.538 9.000 14.500 9.000 C 11.462 9.000 9.000 11.462 9.000 14.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _chartCircles!!
    }

private var _chartCircles: ImageVector? = null
