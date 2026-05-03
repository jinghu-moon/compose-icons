package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterOSmall: ImageVector
    get() {
        if (_letterOSmall != null) return _letterOSmall!!
        _letterOSmall = tablerOutlineIcon(
            name = "LetterOSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 8.000 C 13.105 8.000 14.000 8.895 14.000 10.000 L 14.000 14.000 C 14.000 15.105 13.105 16.000 12.000 16.000 C 10.895 16.000 10.000 15.105 10.000 14.000 L 10.000 10.000 C 10.000 8.895 10.895 8.000 12.000 8.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _letterOSmall!!
    }

private var _letterOSmall: ImageVector? = null
