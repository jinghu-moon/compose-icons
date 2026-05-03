package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.QuoteOpen: ImageVector
    get() {
        if (_quoteOpen != null) return _quoteOpen!!
        _quoteOpen = tablerOutlineIcon(
            name = "QuoteOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 13.000 L 18.000 13.000 C 18.552 13.000 19.000 13.448 19.000 14.000 L 19.000 17.000 C 19.000 17.552 18.552 18.000 18.000 18.000 L 15.000 18.000 C 14.448 18.000 14.000 17.552 14.000 17.000 L 14.000 11.000 Q 14.000 7.000 18.000 6.000"),
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
                pathData = parseSvgPathData("M 5.000 13.000 L 9.000 13.000 C 9.552 13.000 10.000 13.448 10.000 14.000 L 10.000 17.000 C 10.000 17.552 9.552 18.000 9.000 18.000 L 6.000 18.000 C 5.448 18.000 5.000 17.552 5.000 17.000 L 5.000 11.000 Q 5.000 7.000 9.000 6.000"),
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
        return _quoteOpen!!
    }

private var _quoteOpen: ImageVector? = null
