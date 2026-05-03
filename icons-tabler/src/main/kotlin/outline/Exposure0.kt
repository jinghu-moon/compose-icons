package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Exposure0: ImageVector
    get() {
        if (_exposure0 != null) return _exposure0!!
        _exposure0 = tablerOutlineIcon(
            name = "Exposure0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 19.000 C 14.209 19.000 16.000 17.209 16.000 15.000 L 16.000 9.000 C 16.000 6.791 14.209 5.000 12.000 5.000 C 9.791 5.000 8.000 6.791 8.000 9.000 L 8.000 15.000 C 8.000 17.209 9.791 19.000 12.000 19.000"),
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
        return _exposure0!!
    }

private var _exposure0: ImageVector? = null
