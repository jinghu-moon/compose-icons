package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number3Small: ImageVector
    get() {
        if (_number3Small != null) return _number3Small!!
        _number3Small = tablerOutlineIcon(
            name = "Number3Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 8h2.5C13.328 8 14 8.672 14 9.5v1C14 11.328 13.328 12 12.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C14 15.328 13.328 16 12.5 16h-2.5"),
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
        return _number3Small!!
    }

private var _number3Small: ImageVector? = null
