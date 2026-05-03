package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterDSmall: ImageVector
    get() {
        if (_letterDSmall != null) return _letterDSmall!!
        _letterDSmall = tablerOutlineIcon(
            name = "LetterDSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 8.000 L 10.000 16.000 L 12.000 16.000 C 13.105 16.000 14.000 15.105 14.000 14.000 L 14.000 10.000 C 14.000 8.895 13.105 8.000 12.000 8.000 L 10.000 8.000"),
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
        return _letterDSmall!!
    }

private var _letterDSmall: ImageVector? = null
