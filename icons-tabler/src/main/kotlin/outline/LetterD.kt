package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterD: ImageVector
    get() {
        if (_letterD != null) return _letterD!!
        _letterD = tablerOutlineIcon(
            name = "LetterD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 4.000 L 13.000 4.000 C 15.761 4.000 18.000 6.239 18.000 9.000 L 18.000 15.000 C 18.000 17.761 15.761 20.000 13.000 20.000 L 7.000 20.000 L 7.000 4.000"),
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
        return _letterD!!
    }

private var _letterD: ImageVector? = null
