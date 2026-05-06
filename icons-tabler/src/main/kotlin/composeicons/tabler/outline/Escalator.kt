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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 5h-2.672c-.53 0-1.039 .211-1.414 .586L7 14h-2.5C3.119 14 2 15.119 2 16.5 2 17.881 3.119 19 4.5 19h3.672c.53-0 1.039-.211 1.414-.586L18 10h1.5C20.881 10 22 8.881 22 7.5 22 6.119 20.881 5 19.5 5"),
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
        return _escalator!!
    }

private var _escalator: ImageVector? = null
