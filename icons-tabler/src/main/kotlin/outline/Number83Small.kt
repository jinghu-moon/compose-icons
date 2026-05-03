package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number83Small: ImageVector
    get() {
        if (_number83Small != null) return _number83Small!!
        _number83Small = tablerOutlineIcon(
            name = "Number83Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 8.000 L 16.500 8.000 C 17.328 8.000 18.000 8.672 18.000 9.500 L 18.000 10.500 C 18.000 11.328 17.328 12.000 16.500 12.000 L 15.000 12.000 L 16.500 12.000 C 17.328 12.000 18.000 12.672 18.000 13.500 L 18.000 14.500 C 18.000 15.328 17.328 16.000 16.500 16.000 L 14.000 16.000"),
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
        pathData = parseSvgPathData("M 8.000 12.000 L 7.000 12.000 C 6.448 12.000 6.000 11.552 6.000 11.000 L 6.000 9.000 C 6.000 8.448 6.448 8.000 7.000 8.000 L 9.000 8.000 C 9.552 8.000 10.000 8.448 10.000 9.000 L 10.000 11.000 C 10.000 11.552 9.552 12.000 9.000 12.000 L 7.000 12.000 C 6.448 12.000 6.000 12.448 6.000 13.000 L 6.000 15.000 C 6.000 15.552 6.448 16.000 7.000 16.000 L 9.000 16.000 C 9.552 16.000 10.000 15.552 10.000 15.000 L 10.000 13.000 C 10.000 12.448 9.552 12.000 9.000 12.000"),
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
        return _number83Small!!
    }

private var _number83Small: ImageVector? = null
