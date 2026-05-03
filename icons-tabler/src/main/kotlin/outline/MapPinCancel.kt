package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinCancel: ImageVector
    get() {
        if (_mapPinCancel != null) return _mapPinCancel!!
        _mapPinCancel = tablerOutlineIcon(
            name = "MapPinCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 11.000 C 9.000 12.657 10.343 14.000 12.000 14.000 C 13.657 14.000 15.000 12.657 15.000 11.000 C 15.000 9.343 13.657 8.000 12.000 8.000 C 10.343 8.000 9.000 9.343 9.000 11.000"),
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
        pathData = parseSvgPathData("M 12.463 21.431 C 11.788 21.592 11.078 21.391 10.587 20.900 L 6.343 16.657 C 3.694 14.008 3.238 9.876 5.245 6.714 C 7.252 3.551 11.185 2.204 14.709 3.473 C 18.234 4.742 20.406 8.286 19.937 12.002"),
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
        pathData = parseSvgPathData("M 16.000 19.000 C 16.000 20.657 17.343 22.000 19.000 22.000 C 20.657 22.000 22.000 20.657 22.000 19.000 C 22.000 17.343 20.657 16.000 19.000 16.000 C 17.343 16.000 16.000 17.343 16.000 19.000"),
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
        pathData = parseSvgPathData("M 17.000 21.000 L 21.000 17.000"),
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
        return _mapPinCancel!!
    }

private var _mapPinCancel: ImageVector? = null
