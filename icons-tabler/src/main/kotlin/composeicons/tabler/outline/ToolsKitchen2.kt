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
                pathData = parseSvgPathData("M19 3v12h-5c-.023-3.681 .184-7.406 5-12M19 15v6h-1v-3M8 4v17M5 4v3c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-3"),
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
