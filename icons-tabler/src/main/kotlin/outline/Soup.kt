package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Soup: ImageVector
    get() {
        if (_soup != null) return _soup!!
        _soup = tablerOutlineIcon(
            name = "Soup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 11.000 L 20.000 11.000 C 20.552 11.000 21.000 11.448 21.000 12.000 L 21.000 12.500 C 21.000 14.000 18.483 18.073 17.000 19.000 L 17.000 20.000 C 17.000 20.552 16.552 21.000 16.000 21.000 L 8.000 21.000 C 7.448 21.000 7.000 20.552 7.000 20.000 L 7.000 19.000 C 5.313 17.946 3.000 14.000 3.000 12.500 L 3.000 12.000 C 3.000 11.448 3.448 11.000 4.000 11.000"),
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
                pathData = parseSvgPathData("M 12.000 4.000 C 11.357 4.461 10.983 5.209 11.000 6.000 C 10.983 6.791 11.357 7.539 12.000 8.000"),
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
                pathData = parseSvgPathData("M 16.000 4.000 C 15.357 4.461 14.983 5.209 15.000 6.000 C 14.983 6.791 15.357 7.539 16.000 8.000"),
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
                pathData = parseSvgPathData("M 8.000 4.000 C 7.357 4.461 6.983 5.209 7.000 6.000 C 6.983 6.791 7.357 7.539 8.000 8.000"),
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
        return _soup!!
    }

private var _soup: ImageVector? = null
