package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Horseshoe: ImageVector
    get() {
        if (_horseshoe != null) return _horseshoe!!
        _horseshoe = tablerOutlineIcon(
            name = "Horseshoe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 17.000 C 19.500 15.758 21.000 15.000 21.000 12.000 C 21.000 9.000 20.000 3.000 12.000 3.000 C 4.000 3.000 3.000 9.000 3.000 12.000 C 3.000 15.000 4.495 15.749 5.000 17.000 L 3.000 18.000 L 5.000 21.000 L 7.406 19.853 C 8.656 19.139 9.184 17.773 8.609 16.490 C 7.531 14.083 7.000 8.000 12.000 8.000 C 17.000 8.000 16.469 14.083 15.390 16.490 C 14.816 17.774 15.345 19.139 16.594 19.853 L 19.000 21.000 L 21.000 18.000 L 19.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _horseshoe!!
    }

private var _horseshoe: ImageVector? = null
