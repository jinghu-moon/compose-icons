package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Galaxy: ImageVector
    get() {
        if (_galaxy != null) return _galaxy!!
        _galaxy = tablerOutlineIcon(
            name = "Galaxy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 C 10.667 4.000 10.000 5.500 10.000 7.500 C 10.000 10.500 12.000 12.000 12.000 12.000 C 12.000 12.000 14.000 13.500 14.000 16.500 C 14.000 18.500 13.333 20.000 12.000 21.000"),
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
        pathData = parseSvgPathData("M 19.794 16.500 C 19.594 14.845 18.629 13.518 16.897 12.518 C 14.300 11.018 12.000 12.000 12.000 12.000 C 12.000 12.000 9.701 12.982 7.103 11.482 C 5.371 10.482 4.405 9.155 4.206 7.500"),
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
        pathData = parseSvgPathData("M 19.794 7.500 C 18.262 6.845 16.629 7.018 14.897 8.018 C 12.300 9.518 12.000 12.000 12.000 12.000 C 12.000 12.000 11.701 14.482 9.103 15.982 C 7.371 16.982 5.738 17.155 4.206 16.500"),
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
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
