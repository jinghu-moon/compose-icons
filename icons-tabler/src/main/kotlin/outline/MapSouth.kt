package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapSouth: ImageVector
    get() {
        if (_mapSouth != null) return _mapSouth!!
        _mapSouth = tablerOutlineIcon(
            name = "MapSouth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 7.029 3.000 3.000 7.029 3.000 12.000"),
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
        pathData = parseSvgPathData("M 10.000 14.250 C 10.000 14.664 10.336 15.000 10.750 15.000 L 13.000 15.000 C 13.552 15.000 14.000 14.552 14.000 14.000 L 14.000 13.000 C 14.000 12.448 13.552 12.000 13.000 12.000 L 11.000 12.000 C 10.448 12.000 10.000 11.552 10.000 11.000 L 10.000 10.000 C 10.000 9.448 10.448 9.000 11.000 9.000 L 13.250 9.000 C 13.664 9.000 14.000 9.336 14.000 9.750"),
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
        return _mapSouth!!
    }

private var _mapSouth: ImageVector? = null
