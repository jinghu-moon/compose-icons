package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cone: ImageVector
    get() {
        if (_cone != null) return _cone!!
        _cone = tablerOutlineIcon(
            name = "Cone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 17.998 L 21.000 17.498 L 12.870 2.508 C 12.692 2.195 12.360 2.001 12.000 2.001 C 11.640 2.001 11.308 2.195 11.130 2.508 L 3.000 17.497 L 3.000 17.997 C 3.000 19.656 7.030 21.000 12.000 21.000 C 16.970 21.000 21.000 19.656 21.000 17.998"),
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
        return _cone!!
    }

private var _cone: ImageVector? = null
