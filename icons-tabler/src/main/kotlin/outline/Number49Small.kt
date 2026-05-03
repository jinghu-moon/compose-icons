package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number49Small: ImageVector
    get() {
        if (_number49Small != null) return _number49Small!!
        _number49Small = tablerOutlineIcon(
            name = "Number49Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 15.000 C 14.000 15.552 14.448 16.000 15.000 16.000 L 17.000 16.000 C 17.552 16.000 18.000 15.552 18.000 15.000 L 18.000 9.000 C 18.000 8.448 17.552 8.000 17.000 8.000 L 15.000 8.000 C 14.448 8.000 14.000 8.448 14.000 9.000 L 14.000 11.000 C 14.000 11.552 14.448 12.000 15.000 12.000 L 18.000 12.000"),
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
                pathData = parseSvgPathData("M 6.000 8.000 L 6.000 11.000 C 6.000 11.552 6.448 12.000 7.000 12.000 L 10.000 12.000"),
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
                pathData = parseSvgPathData("M 10.000 8.000 L 10.000 16.000"),
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
        return _number49Small!!
    }

private var _number49Small: ImageVector? = null
