package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Escalator: ImageVector
    get() {
        if (_escalator != null) return _escalator!!
        _escalator = tablerOutlineIcon(
            name = "Escalator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.500 5.000 L 16.828 5.000 C 16.298 5.000 15.789 5.211 15.414 5.586 L 7.000 14.000 L 4.500 14.000 C 3.119 14.000 2.000 15.119 2.000 16.500 C 2.000 17.881 3.119 19.000 4.500 19.000 L 8.172 19.000 C 8.702 19.000 9.211 18.789 9.586 18.414 L 18.000 10.000 L 19.500 10.000 C 20.881 10.000 22.000 8.881 22.000 7.500 C 22.000 6.119 20.881 5.000 19.500 5.000"),
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
        return _escalator!!
    }

private var _escalator: ImageVector? = null
