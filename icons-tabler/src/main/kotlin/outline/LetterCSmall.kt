package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterCSmall: ImageVector
    get() {
        if (_letterCSmall != null) return _letterCSmall!!
        _letterCSmall = tablerOutlineIcon(
            name = "LetterCSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 10.000 C 14.000 8.895 13.105 8.000 12.000 8.000 C 10.895 8.000 10.000 8.895 10.000 10.000 L 10.000 14.000 C 10.000 15.105 10.895 16.000 12.000 16.000 C 13.105 16.000 14.000 15.105 14.000 14.000"),
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
        return _letterCSmall!!
    }

private var _letterCSmall: ImageVector? = null
