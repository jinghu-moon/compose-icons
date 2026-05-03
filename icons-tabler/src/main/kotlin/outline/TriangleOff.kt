package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleOff: ImageVector
    get() {
        if (_triangleOff != null) return _triangleOff!!
        _triangleOff = tablerOutlineIcon(
            name = "TriangleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.825 7.830 L 2.257 17.125 C 1.917 17.714 1.915 18.439 2.252 19.030 C 2.588 19.621 3.213 19.988 3.893 19.996 L 20.000 19.996M 21.998 18.006 C 21.986 17.696 21.898 17.394 21.743 17.126 L 13.637 3.590 C 13.290 3.017 12.669 2.668 12.000 2.668 C 11.331 2.668 10.710 3.017 10.363 3.590 L 9.335 5.308"),
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
        return _triangleOff!!
    }

private var _triangleOff: ImageVector? = null
