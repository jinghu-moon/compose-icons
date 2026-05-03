package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Route: ImageVector
    get() {
        if (_route != null) return _route!!
        _route = tablerOutlineIcon(
            name = "Route",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 C 6.105 21.000 7.000 20.105 7.000 19.000 C 7.000 17.895 6.105 17.000 5.000 17.000 C 3.895 17.000 3.000 17.895 3.000 19.000"),
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
                pathData = parseSvgPathData("M 19.000 7.000 C 20.105 7.000 21.000 6.105 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000 C 17.895 3.000 17.000 3.895 17.000 5.000 C 17.000 6.105 17.895 7.000 19.000 7.000"),
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
                pathData = parseSvgPathData("M 11.000 19.000 L 16.500 19.000 C 18.433 19.000 20.000 17.433 20.000 15.500 C 20.000 13.567 18.433 12.000 16.500 12.000 L 8.500 12.000 C 6.567 12.000 5.000 10.433 5.000 8.500 C 5.000 6.567 6.567 5.000 8.500 5.000 L 13.000 5.000"),
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
        return _route!!
    }

private var _route: ImageVector? = null
