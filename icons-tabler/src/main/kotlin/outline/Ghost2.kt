package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ghost2: ImageVector
    get() {
        if (_ghost2 != null) return _ghost2!!
        _ghost2 = tablerOutlineIcon(
            name = "Ghost2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 9.000 L 10.010 9.000"),
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
        pathData = parseSvgPathData("M 14.000 9.000 L 14.010 9.000"),
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
        pathData = parseSvgPathData("M 12.000 3.000 C 15.866 3.000 19.000 6.134 19.000 10.000 L 19.000 11.000 L 20.000 11.000 C 21.105 11.000 22.000 11.895 22.000 13.000 C 22.000 14.105 21.105 15.000 20.000 15.000 L 19.000 15.000 L 19.000 18.000 L 21.000 21.000 L 11.000 21.000 C 7.772 21.002 5.121 18.451 5.000 15.225 L 5.000 14.999 L 4.000 14.999 C 2.895 14.999 2.000 14.104 2.000 12.999 C 2.000 11.894 2.895 10.999 4.000 10.999 L 5.000 10.999 L 5.000 9.999 C 5.000 6.133 8.134 2.999 12.000 2.999 L 12.000 3.000"),
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
        pathData = parseSvgPathData("M 11.000 14.000 L 13.000 14.000 C 13.000 13.448 12.552 13.000 12.000 13.000 C 11.448 13.000 11.000 13.448 11.000 14.000"),
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
        return _ghost2!!
    }

private var _ghost2: ImageVector? = null
