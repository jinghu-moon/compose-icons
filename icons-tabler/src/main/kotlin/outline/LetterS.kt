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
                pathData = parseSvgPathData("M 17.000 8.000 C 17.000 5.791 15.209 4.000 13.000 4.000 L 11.000 4.000 C 8.791 4.000 7.000 5.791 7.000 8.000 C 7.000 10.209 8.791 12.000 11.000 12.000 L 13.000 12.000 C 15.209 12.000 17.000 13.791 17.000 16.000 C 17.000 18.209 15.209 20.000 13.000 20.000 L 11.000 20.000 C 8.791 20.000 7.000 18.209 7.000 16.000"),
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
