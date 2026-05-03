package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QuoteOff: ImageVector
    get() {
        if (_quoteOff != null) return _quoteOff!!
        _quoteOff = tablerOutlineIcon(
            name = "QuoteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 11.000 L 6.000 11.000 C 5.448 11.000 5.000 10.552 5.000 10.000 L 5.000 7.000 C 5.000 6.448 5.448 6.000 6.000 6.000M 10.000 10.000 L 10.000 13.000 C 10.000 15.667 8.667 17.333 6.000 18.000"),
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
        pathData = parseSvgPathData("M 19.000 11.000 L 15.000 11.000M 14.000 10.000 L 14.000 7.000 C 14.000 6.448 14.448 6.000 15.000 6.000 L 18.000 6.000 C 18.552 6.000 19.000 6.448 19.000 7.000 L 19.000 13.000 C 19.000 13.660 18.918 14.260 18.755 14.798M 17.102 17.088 C 16.531 17.488 15.830 17.792 15.000 18.000"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _quoteOff!!
    }

private var _quoteOff: ImageVector? = null
