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
                pathData = parseSvgPathData("M19 17c.5-1.242 2-2 2-5C21 9 20 3 12 3 4 3 3 9 3 12c0 3 1.495 3.749 2 5L3 18l2 3L7.406 19.853c1.25-.714 1.778-2.08 1.203-3.363C7.531 14.083 7 8 12 8c5 0 4.469 6.083 3.39 8.49-.574 1.284-.045 2.649 1.204 3.363L19 21l2-3L19 17"),
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
