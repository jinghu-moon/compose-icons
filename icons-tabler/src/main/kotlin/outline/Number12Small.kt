package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number12Small: ImageVector
    get() {
        if (_number12Small != null) return _number12Small!!
        _number12Small = tablerOutlineIcon(
            name = "Number12Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 8.000 L 9.000 8.000 L 9.000 16.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 13.000 8.000 L 16.000 8.000 C 16.552 8.000 17.000 8.448 17.000 9.000 L 17.000 11.000 C 17.000 11.552 16.552 12.000 16.000 12.000 L 14.000 12.000 C 13.448 12.000 13.000 12.448 13.000 13.000 L 13.000 15.000 C 13.000 15.552 13.448 16.000 14.000 16.000 L 17.000 16.000"),
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
        return _number12Small!!
    }

private var _number12Small: ImageVector? = null
