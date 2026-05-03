package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = tablerOutlineIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 3.200 C 5.670 4.204 2.721 8.218 3.058 12.650 C 3.396 17.082 6.918 20.604 11.350 20.942 C 15.782 21.279 19.796 18.330 20.800 14.000 C 20.800 13.448 20.352 13.000 19.800 13.000 L 13.000 13.000 C 11.895 13.000 11.000 12.105 11.000 11.000 L 11.000 4.000 C 10.975 3.761 10.855 3.541 10.667 3.391 C 10.479 3.241 10.239 3.172 10.000 3.200"),
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
        pathData = parseSvgPathData("M 15.000 3.500 C 17.572 4.406 19.594 6.428 20.500 9.000 L 16.000 9.000 C 15.448 9.000 15.000 8.552 15.000 8.000 L 15.000 3.500"),
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
