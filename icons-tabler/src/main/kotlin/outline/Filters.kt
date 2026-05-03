package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filters: ImageVector
    get() {
        if (_filters != null) return _filters!!
        _filters = tablerOutlineIcon(
            name = "Filters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 8.000 C 7.000 10.761 9.239 13.000 12.000 13.000 C 14.761 13.000 17.000 10.761 17.000 8.000 C 17.000 5.239 14.761 3.000 12.000 3.000 C 9.239 3.000 7.000 5.239 7.000 8.000"),
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
        pathData = parseSvgPathData("M 8.000 11.000 C 5.681 11.000 3.666 12.595 3.134 14.852 C 2.601 17.110 3.691 19.437 5.766 20.473 C 7.841 21.509 10.356 20.983 11.841 19.202 C 13.326 17.420 13.391 14.851 11.998 12.997"),
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
        pathData = parseSvgPathData("M 12.002 19.003 C 13.414 20.883 15.944 21.525 18.082 20.546 C 20.219 19.567 21.386 17.231 20.885 14.935 C 20.384 12.638 18.351 11.000 16.000 11.000"),
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
        return _filters!!
    }

private var _filters: ImageVector? = null
