package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BottleOff: ImageVector
    get() {
        if (_bottleOff != null) return _bottleOff!!
        _bottleOff = tablerOutlineIcon(
            name = "BottleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 5.000 L 14.000 5.000 L 14.000 3.000 C 14.000 2.448 13.552 2.000 13.000 2.000 L 11.000 2.000 C 10.448 2.000 10.000 2.448 10.000 3.000 L 10.000 5.000"),
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
        pathData = parseSvgPathData("M 14.000 3.500 C 14.000 5.126 14.507 6.712 15.450 8.037 L 15.500 8.107 C 16.476 9.478 17.000 11.118 17.000 12.801 L 17.000 13.000M 17.000 17.000 L 17.000 19.000 C 17.000 20.105 16.105 21.000 15.000 21.000 L 9.000 21.000 C 7.895 21.000 7.000 20.105 7.000 19.000 L 7.000 12.800 C 7.000 11.208 7.470 9.652 8.350 8.326M 9.686 5.696 C 9.894 4.983 10.000 4.243 10.000 3.500"),
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
        pathData = parseSvgPathData("M 7.000 14.803 C 7.400 14.631 7.746 14.353 8.000 14.000 C 8.461 13.357 9.209 12.983 10.000 13.000 C 10.791 12.983 11.539 13.357 12.000 14.000 C 12.461 14.643 13.209 15.017 14.000 15.000 C 14.295 15.006 14.589 14.958 14.866 14.858"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _bottleOff!!
    }

private var _bottleOff: ImageVector? = null
