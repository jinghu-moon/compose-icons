package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.LetterRSmall: ImageVector
    get() {
        if (_letterRSmall != null) return _letterRSmall!!
        _letterRSmall = tablerOutlineIcon(
            name = "LetterRSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 12.000 L 12.000 12.000 C 13.105 12.000 14.000 11.105 14.000 10.000 C 14.000 8.895 13.105 8.000 12.000 8.000 L 10.000 8.000 L 10.000 16.000M 14.000 16.000 L 11.000 12.000"),
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
        return _letterRSmall!!
    }

private var _letterRSmall: ImageVector? = null
