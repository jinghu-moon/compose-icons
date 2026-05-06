package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Puzzle: ImageVector
    get() {
        if (_puzzle != null) return _puzzle!!
        _puzzle = tablerOutlineIcon(
            name = "Puzzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 7h3C7.552 7 8 6.552 8 6v-1C8 3.895 8.895 3 10 3c1.105 0 2 .895 2 2v1c0 .552 .448 1 1 1h3c.552 0 1 .448 1 1v3c0 .552 .448 1 1 1h1c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-1c-.552 0-1 .448-1 1v3c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-1c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v1c0 .552-.448 1-1 1h-3C3.448 21 3 20.552 3 20v-3c0-.552 .448-1 1-1h1c1.105 0 2-.895 2-2C7 12.895 6.105 12 5 12h-1C3.448 12 3 11.552 3 11v-3C3 7.448 3.448 7 4 7"),
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
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
