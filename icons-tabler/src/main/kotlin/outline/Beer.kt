package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = tablerOutlineIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 21.000 L 15.000 21.000 C 15.552 21.000 16.000 20.552 16.000 20.000 L 16.000 16.375 C 16.000 14.978 16.290 13.600 16.845 12.350 L 17.155 11.650 C 17.711 10.400 18.000 9.397 18.000 8.000 L 18.000 4.000 C 18.000 3.448 17.552 3.000 17.000 3.000 L 7.000 3.000 C 6.448 3.000 6.000 3.448 6.000 4.000 L 6.000 8.000 C 6.000 9.397 6.290 10.400 6.845 11.650 L 7.155 12.350 C 7.714 13.618 8.002 14.989 8.000 16.375 L 8.000 20.000 C 8.000 20.552 8.448 21.000 9.000 21.000"),
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
        pathData = parseSvgPathData("M 6.000 8.000 L 18.000 8.000"),
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
        return _beer!!
    }

private var _beer: ImageVector? = null
