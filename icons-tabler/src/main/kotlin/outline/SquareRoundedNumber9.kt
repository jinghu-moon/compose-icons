package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRoundedNumber9: ImageVector
    get() {
        if (_squareRoundedNumber9 != null) return _squareRoundedNumber9!!
        _squareRoundedNumber9 = tablerOutlineIcon(
            name = "SquareRoundedNumber9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 15.000 C 10.000 15.552 10.448 16.000 11.000 16.000 L 13.000 16.000 C 13.552 16.000 14.000 15.552 14.000 15.000 L 14.000 9.000 C 14.000 8.448 13.552 8.000 13.000 8.000 L 11.000 8.000 C 10.448 8.000 10.000 8.448 10.000 9.000 L 10.000 11.000 C 10.000 11.552 10.448 12.000 11.000 12.000 L 14.000 12.000"),
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
        pathData = parseSvgPathData("M 12.000 3.000 C 19.200 3.000 21.000 4.800 21.000 12.000 C 21.000 19.200 19.200 21.000 12.000 21.000 C 4.800 21.000 3.000 19.200 3.000 12.000 C 3.000 4.800 4.800 3.000 12.000 3.000"),
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
        return _squareRoundedNumber9!!
    }

private var _squareRoundedNumber9: ImageVector? = null
