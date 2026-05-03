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
                pathData = parseSvgPathData("M 4.000 7.000 L 7.000 7.000 C 7.552 7.000 8.000 6.552 8.000 6.000 L 8.000 5.000 C 8.000 3.895 8.895 3.000 10.000 3.000 C 11.105 3.000 12.000 3.895 12.000 5.000 L 12.000 6.000 C 12.000 6.552 12.448 7.000 13.000 7.000 L 16.000 7.000 C 16.552 7.000 17.000 7.448 17.000 8.000 L 17.000 11.000 C 17.000 11.552 17.448 12.000 18.000 12.000 L 19.000 12.000 C 20.105 12.000 21.000 12.895 21.000 14.000 C 21.000 15.105 20.105 16.000 19.000 16.000 L 18.000 16.000 C 17.448 16.000 17.000 16.448 17.000 17.000 L 17.000 20.000 C 17.000 20.552 16.552 21.000 16.000 21.000 L 13.000 21.000 C 12.448 21.000 12.000 20.552 12.000 20.000 L 12.000 19.000 C 12.000 17.895 11.105 17.000 10.000 17.000 C 8.895 17.000 8.000 17.895 8.000 19.000 L 8.000 20.000 C 8.000 20.552 7.552 21.000 7.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 17.000 C 3.000 16.448 3.448 16.000 4.000 16.000 L 5.000 16.000 C 6.105 16.000 7.000 15.105 7.000 14.000 C 7.000 12.895 6.105 12.000 5.000 12.000 L 4.000 12.000 C 3.448 12.000 3.000 11.552 3.000 11.000 L 3.000 8.000 C 3.000 7.448 3.448 7.000 4.000 7.000"),
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
