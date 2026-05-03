package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dots: ImageVector
    get() {
        if (_dots != null) return _dots!!
        _dots = tablerOutlineIcon(
            name = "Dots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 12.000 C 4.000 12.552 4.448 13.000 5.000 13.000 C 5.552 13.000 6.000 12.552 6.000 12.000 C 6.000 11.448 5.552 11.000 5.000 11.000 C 4.448 11.000 4.000 11.448 4.000 12.000"),
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
                pathData = parseSvgPathData("M 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 C 12.552 13.000 13.000 12.552 13.000 12.000 C 13.000 11.448 12.552 11.000 12.000 11.000 C 11.448 11.000 11.000 11.448 11.000 12.000"),
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
                pathData = parseSvgPathData("M 18.000 12.000 C 18.000 12.552 18.448 13.000 19.000 13.000 C 19.552 13.000 20.000 12.552 20.000 12.000 C 20.000 11.448 19.552 11.000 19.000 11.000 C 18.448 11.000 18.000 11.448 18.000 12.000"),
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
        return _dots!!
    }

private var _dots: ImageVector? = null
