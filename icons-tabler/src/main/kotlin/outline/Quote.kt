package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Quote: ImageVector
    get() {
        if (_quote != null) return _quote!!
        _quote = tablerOutlineIcon(
            name = "Quote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 11.000 L 6.000 11.000 C 5.448 11.000 5.000 10.552 5.000 10.000 L 5.000 7.000 C 5.000 6.448 5.448 6.000 6.000 6.000 L 9.000 6.000 C 9.552 6.000 10.000 6.448 10.000 7.000 L 10.000 13.000 C 10.000 15.667 8.667 17.333 6.000 18.000"),
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
        pathData = parseSvgPathData("M 19.000 11.000 L 15.000 11.000 C 14.448 11.000 14.000 10.552 14.000 10.000 L 14.000 7.000 C 14.000 6.448 14.448 6.000 15.000 6.000 L 18.000 6.000 C 18.552 6.000 19.000 6.448 19.000 7.000 L 19.000 13.000 C 19.000 15.667 17.667 17.333 15.000 18.000"),
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
        return _quote!!
    }

private var _quote: ImageVector? = null
