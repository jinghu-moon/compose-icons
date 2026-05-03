package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleSquareCircle: ImageVector
    get() {
        if (_triangleSquareCircle != null) return _triangleSquareCircle!!
        _triangleSquareCircle = tablerOutlineIcon(
            name = "TriangleSquareCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 3.000 L 8.000 10.000 L 16.000 10.000 L 12.000 3.000"),
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
        pathData = parseSvgPathData("M 14.000 17.000 C 14.000 18.657 15.343 20.000 17.000 20.000 C 18.657 20.000 20.000 18.657 20.000 17.000 C 20.000 15.343 18.657 14.000 17.000 14.000 C 15.343 14.000 14.000 15.343 14.000 17.000"),
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
        pathData = parseSvgPathData("M 4.000 15.000 C 4.000 14.448 4.448 14.000 5.000 14.000 L 9.000 14.000 C 9.552 14.000 10.000 14.448 10.000 15.000 L 10.000 19.000 C 10.000 19.552 9.552 20.000 9.000 20.000 L 5.000 20.000 C 4.448 20.000 4.000 19.552 4.000 19.000 L 4.000 15.000"),
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
        return _triangleSquareCircle!!
    }

private var _triangleSquareCircle: ImageVector? = null
