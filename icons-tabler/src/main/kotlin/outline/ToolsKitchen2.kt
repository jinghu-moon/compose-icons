package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ToolsKitchen2: ImageVector
    get() {
        if (_toolsKitchen2 != null) return _toolsKitchen2!!
        _toolsKitchen2 = tablerOutlineIcon(
            name = "ToolsKitchen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 3.000 L 19.000 15.000 L 14.000 15.000 C 13.977 11.319 14.184 7.594 19.000 3.000M 19.000 15.000 L 19.000 21.000 L 18.000 21.000 L 18.000 18.000M 8.000 4.000 L 8.000 21.000M 5.000 4.000 L 5.000 7.000 C 5.000 8.657 6.343 10.000 8.000 10.000 C 9.657 10.000 11.000 8.657 11.000 7.000 L 11.000 4.000"),
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
        return _toolsKitchen2!!
    }

private var _toolsKitchen2: ImageVector? = null
