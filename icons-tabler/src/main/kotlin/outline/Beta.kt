package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beta: ImageVector
    get() {
        if (_beta != null) return _beta!!
        _beta = tablerOutlineIcon(
            name = "Beta",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 22.000 L 8.000 8.000 C 8.000 5.791 9.791 4.000 12.000 4.000 L 12.500 4.000 C 14.433 4.000 16.000 5.567 16.000 7.500 C 16.000 9.433 14.433 11.000 12.500 11.000 L 12.000 11.000 L 12.500 11.000 C 14.985 11.000 17.000 13.015 17.000 15.500 C 17.000 17.985 14.985 20.000 12.500 20.000 C 10.015 20.000 8.000 17.985 8.000 15.500 L 8.000 15.000"),
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
        return _beta!!
    }

private var _beta: ImageVector? = null
