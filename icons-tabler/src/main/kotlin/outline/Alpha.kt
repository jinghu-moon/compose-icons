package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Alpha: ImageVector
    get() {
        if (_alpha != null) return _alpha!!
        _alpha = tablerOutlineIcon(
            name = "Alpha",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.100 6.000 C 17.000 8.913 16.200 10.913 15.700 12.000 C 13.821 16.088 11.987 18.000 9.700 18.000 C 7.300 18.000 4.900 15.600 4.900 12.000 C 4.900 8.400 7.300 6.000 9.700 6.000 C 11.967 6.000 13.835 7.986 15.700 12.000 C 16.212 13.102 17.012 15.102 18.100 18.000"),
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
        return _alpha!!
    }

private var _alpha: ImageVector? = null
