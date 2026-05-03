package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AiGateway: ImageVector
    get() {
        if (_aiGateway != null) return _aiGateway!!
        _aiGateway = tablerOutlineIcon(
            name = "AiGateway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 6.500 C 4.000 7.881 5.119 9.000 6.500 9.000 C 7.881 9.000 9.000 7.881 9.000 6.500 C 9.000 5.119 7.881 4.000 6.500 4.000 C 5.119 4.000 4.000 5.119 4.000 6.500"),
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
        pathData = parseSvgPathData("M 15.000 6.500 C 15.000 7.881 16.119 9.000 17.500 9.000 C 18.881 9.000 20.000 7.881 20.000 6.500 C 20.000 5.119 18.881 4.000 17.500 4.000 C 16.119 4.000 15.000 5.119 15.000 6.500"),
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
        pathData = parseSvgPathData("M 15.000 17.500 C 15.000 18.881 16.119 20.000 17.500 20.000 C 18.881 20.000 20.000 18.881 20.000 17.500 C 20.000 16.119 18.881 15.000 17.500 15.000 C 16.119 15.000 15.000 16.119 15.000 17.500"),
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
        pathData = parseSvgPathData("M 4.000 17.500 C 4.000 18.881 5.119 20.000 6.500 20.000 C 7.881 20.000 9.000 18.881 9.000 17.500 C 9.000 16.119 7.881 15.000 6.500 15.000 C 5.119 15.000 4.000 16.119 4.000 17.500"),
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
        pathData = parseSvgPathData("M 8.500 15.500 L 15.500 8.500"),
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
        return _aiGateway!!
    }

private var _aiGateway: ImageVector? = null
