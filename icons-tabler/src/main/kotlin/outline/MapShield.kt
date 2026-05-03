package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapShield: ImageVector
    get() {
        if (_mapShield != null) return _mapShield!!
        _mapShield = tablerOutlineIcon(
            name = "MapShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 11.000 C 15.000 9.343 13.657 8.000 12.000 8.000 C 10.343 8.000 9.000 9.343 9.000 11.000 C 9.000 12.657 10.343 14.000 12.000 14.000"),
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
        pathData = parseSvgPathData("M 12.249 21.470 C 11.637 21.547 11.023 21.336 10.587 20.900 L 6.343 16.657 C 3.798 14.112 3.266 10.180 5.043 7.050 C 6.821 3.919 10.470 2.362 13.960 3.244 C 17.450 4.126 19.921 7.230 19.998 10.829"),
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
        pathData = parseSvgPathData("M 22.000 16.000 C 22.000 20.000 19.500 22.000 18.500 22.000 C 17.500 22.000 15.000 20.000 15.000 16.000 C 16.000 16.000 17.500 15.500 18.500 14.500 C 19.500 15.500 21.000 16.000 22.000 16.000"),
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
        return _mapShield!!
    }

private var _mapShield: ImageVector? = null
