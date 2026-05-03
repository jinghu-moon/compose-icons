package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleLetterS: ImageVector
    get() {
        if (_circleLetterS != null) return _circleLetterS!!
        _circleLetterS = tablerOutlineIcon(
            name = "CircleLetterS",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 7.029 3.000 3.000 7.029 3.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.000 15.000 C 10.000 15.552 10.448 16.000 11.000 16.000 L 13.000 16.000 C 13.552 16.000 14.000 15.552 14.000 15.000 L 14.000 13.000 C 14.000 12.448 13.552 12.000 13.000 12.000 L 11.000 12.000 C 10.448 12.000 10.000 11.552 10.000 11.000 L 10.000 9.000 C 10.000 8.448 10.448 8.000 11.000 8.000 L 13.000 8.000 C 13.552 8.000 14.000 8.448 14.000 9.000"),
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
        return _circleLetterS!!
    }

private var _circleLetterS: ImageVector? = null
