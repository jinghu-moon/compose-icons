package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterC: ImageVector
    get() {
        if (_letterC != null) return _letterC!!
        _letterC = tablerOutlineIcon(
            name = "LetterC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 9.000 C 18.000 6.239 15.761 4.000 13.000 4.000 L 11.000 4.000 C 8.239 4.000 6.000 6.239 6.000 9.000 L 6.000 15.000 C 6.000 17.761 8.239 20.000 11.000 20.000 L 13.000 20.000 C 15.761 20.000 18.000 17.761 18.000 15.000"),
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
        return _letterC!!
    }

private var _letterC: ImageVector? = null
