package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Svg: ImageVector
    get() {
        if (_svg != null) return _svg!!
        _svg = tablerOutlineIcon(
            name = "Svg",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 8.000 L 19.000 8.000 C 17.895 8.000 17.000 8.895 17.000 10.000 L 17.000 14.000 C 17.000 15.105 17.895 16.000 19.000 16.000 L 21.000 16.000 L 21.000 12.000 L 20.000 12.000"),
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
        pathData = parseSvgPathData("M 7.000 8.000 L 4.000 8.000 C 3.448 8.000 3.000 8.448 3.000 9.000 L 3.000 11.000 C 3.000 11.552 3.448 12.000 4.000 12.000 L 6.000 12.000 C 6.552 12.000 7.000 12.448 7.000 13.000 L 7.000 15.000 C 7.000 15.552 6.552 16.000 6.000 16.000 L 3.000 16.000"),
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
        pathData = parseSvgPathData("M 10.000 8.000 L 11.500 16.000 L 12.500 16.000 L 14.000 8.000"),
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
        return _svg!!
    }

private var _svg: ImageVector? = null
