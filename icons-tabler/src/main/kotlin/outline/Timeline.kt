package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Timeline: ImageVector
    get() {
        if (_timeline != null) return _timeline!!
        _timeline = tablerOutlineIcon(
            name = "Timeline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 16.000 L 10.000 9.000 L 15.000 14.000 L 20.000 8.000"),
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
        pathData = parseSvgPathData("M 14.000 14.000 C 14.000 14.552 14.448 15.000 15.000 15.000 C 15.552 15.000 16.000 14.552 16.000 14.000 C 16.000 13.448 15.552 13.000 15.000 13.000 C 14.448 13.000 14.000 13.448 14.000 14.000"),
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
        pathData = parseSvgPathData("M 9.000 9.000 C 9.000 9.552 9.448 10.000 10.000 10.000 C 10.552 10.000 11.000 9.552 11.000 9.000 C 11.000 8.448 10.552 8.000 10.000 8.000 C 9.448 8.000 9.000 8.448 9.000 9.000"),
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
        pathData = parseSvgPathData("M 3.000 16.000 C 3.000 16.552 3.448 17.000 4.000 17.000 C 4.552 17.000 5.000 16.552 5.000 16.000 C 5.000 15.448 4.552 15.000 4.000 15.000 C 3.448 15.000 3.000 15.448 3.000 16.000"),
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
        pathData = parseSvgPathData("M 19.000 8.000 C 19.000 8.552 19.448 9.000 20.000 9.000 C 20.552 9.000 21.000 8.552 21.000 8.000 C 21.000 7.448 20.552 7.000 20.000 7.000 C 19.448 7.000 19.000 7.448 19.000 8.000"),
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
        return _timeline!!
    }

private var _timeline: ImageVector? = null
