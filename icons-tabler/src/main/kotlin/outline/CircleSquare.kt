package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CircleSquare: ImageVector
    get() {
        if (_circleSquare != null) return _circleSquare!!
        _circleSquare = tablerOutlineIcon(
            name = "CircleSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 9.500 C 3.000 13.090 5.910 16.000 9.500 16.000 C 13.090 16.000 16.000 13.090 16.000 9.500 C 16.000 5.910 13.090 3.000 9.500 3.000 C 5.910 3.000 3.000 5.910 3.000 9.500"),
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
                pathData = parseSvgPathData("M 10.000 12.000 C 10.000 10.895 10.895 10.000 12.000 10.000 L 19.000 10.000 C 20.105 10.000 21.000 10.895 21.000 12.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 12.000 21.000 C 10.895 21.000 10.000 20.105 10.000 19.000 L 10.000 12.000"),
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
        return _circleSquare!!
    }

private var _circleSquare: ImageVector? = null
