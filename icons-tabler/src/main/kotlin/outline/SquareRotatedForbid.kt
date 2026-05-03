package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SquareRotatedForbid: ImageVector
    get() {
        if (_squareRotatedForbid != null) return _squareRotatedForbid!!
        _squareRotatedForbid = tablerOutlineIcon(
            name = "SquareRotatedForbid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.446 2.600 L 21.401 10.554 C 22.200 11.353 22.200 12.647 21.401 13.446 L 13.446 21.401 C 12.647 22.200 11.353 22.200 10.554 21.401 L 2.599 13.446 C 1.800 12.647 1.800 11.353 2.599 10.554 L 10.554 2.599 C 11.353 1.800 12.647 1.800 13.446 2.599"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.500 14.500 L 14.500 9.500"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _squareRotatedForbid!!
    }

private var _squareRotatedForbid: ImageVector? = null
