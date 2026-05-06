package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterS: ImageVector
    get() {
        if (_letterS != null) return _letterS!!
        _letterS = tablerOutlineIcon(
            name = "LetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 8C17 5.791 15.209 4 13 4h-2C8.791 4 7 5.791 7 8c0 2.209 1.791 4 4 4h2c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-2C8.791 20 7 18.209 7 16"),
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
        return _letterS!!
    }

private var _letterS: ImageVector? = null
