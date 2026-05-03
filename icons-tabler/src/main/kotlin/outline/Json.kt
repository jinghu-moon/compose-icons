package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Json: ImageVector
    get() {
        if (_json != null) return _json!!
        _json = tablerOutlineIcon(
            name = "Json",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 16.000 L 20.000 8.000 L 23.000 16.000 L 23.000 8.000"),
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
        pathData = parseSvgPathData("M 15.000 8.000 C 16.105 8.000 17.000 8.895 17.000 10.000 L 17.000 14.000 C 17.000 15.105 16.105 16.000 15.000 16.000 C 13.895 16.000 13.000 15.105 13.000 14.000 L 13.000 10.000 C 13.000 8.895 13.895 8.000 15.000 8.000"),
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
        pathData = parseSvgPathData("M 1.000 8.000 L 4.000 8.000 L 4.000 14.500 C 4.000 15.328 3.328 16.000 2.500 16.000 C 1.672 16.000 1.000 15.328 1.000 14.500 L 1.000 14.000"),
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
        pathData = parseSvgPathData("M 7.000 15.000 C 7.000 15.552 7.448 16.000 8.000 16.000 L 9.000 16.000 C 9.552 16.000 10.000 15.552 10.000 15.000 L 10.000 13.000 C 10.000 12.448 9.552 12.000 9.000 12.000 L 8.000 12.000 C 7.448 12.000 7.000 11.552 7.000 11.000 L 7.000 9.000 C 7.000 8.448 7.448 8.000 8.000 8.000 L 9.000 8.000 C 9.552 8.000 10.000 8.448 10.000 9.000"),
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
        return _json!!
    }

private var _json: ImageVector? = null
