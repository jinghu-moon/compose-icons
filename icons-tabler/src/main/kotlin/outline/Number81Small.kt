package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number81Small: ImageVector
    get() {
        if (_number81Small != null) return _number81Small!!
        _number81Small = tablerOutlineIcon(
            name = "Number81Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 8.000 L 16.000 8.000 L 16.000 16.000"),
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
                pathData = parseSvgPathData("M 9.000 12.000 L 8.000 12.000 C 7.448 12.000 7.000 11.552 7.000 11.000 L 7.000 9.000 C 7.000 8.448 7.448 8.000 8.000 8.000 L 10.000 8.000 C 10.552 8.000 11.000 8.448 11.000 9.000 L 11.000 11.000 C 11.000 11.552 10.552 12.000 10.000 12.000 L 8.000 12.000 C 7.448 12.000 7.000 12.448 7.000 13.000 L 7.000 15.000 C 7.000 15.552 7.448 16.000 8.000 16.000 L 10.000 16.000 C 10.552 16.000 11.000 15.552 11.000 15.000 L 11.000 13.000 C 11.000 12.448 10.552 12.000 10.000 12.000"),
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
        return _number81Small!!
    }

private var _number81Small: ImageVector? = null
