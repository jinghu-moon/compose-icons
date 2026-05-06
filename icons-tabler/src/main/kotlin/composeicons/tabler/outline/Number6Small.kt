package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number6Small: ImageVector
    get() {
        if (_number6Small != null) return _number6Small!!
        _number6Small = tablerOutlineIcon(
            name = "Number6Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 9C14 8.448 13.552 8 13 8h-2c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2c0-.552-.448-1-1-1h-3"),
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
        return _number6Small!!
    }

private var _number6Small: ImageVector? = null
