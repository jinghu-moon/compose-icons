package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandThreeFingers: ImageVector
    get() {
        if (_handThreeFingers != null) return _handThreeFingers!!
        _handThreeFingers = tablerOutlineIcon(
            name = "HandThreeFingers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 13.000 L 8.000 4.500 C 8.000 3.672 8.672 3.000 9.500 3.000 C 10.328 3.000 11.000 3.672 11.000 4.500 L 11.000 12.000"),
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
                pathData = parseSvgPathData("M 17.000 11.500 C 17.000 10.672 17.672 10.000 18.500 10.000 C 19.328 10.000 20.000 10.672 20.000 11.500 L 20.000 16.000 C 20.000 19.314 17.314 22.000 14.000 22.000 L 12.000 22.000 L 12.208 22.000 C 10.190 22.000 8.306 20.986 7.196 19.300 C 7.130 19.200 7.065 19.100 7.000 19.000 C 6.688 18.521 5.593 16.612 3.714 13.272 C 3.316 12.564 3.553 11.668 4.250 11.250 C 4.984 10.809 5.924 10.925 6.530 11.530 L 8.000 13.000"),
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
                pathData = parseSvgPathData("M 11.000 5.500 L 11.000 3.500 C 11.000 2.672 11.672 2.000 12.500 2.000 C 13.328 2.000 14.000 2.672 14.000 3.500 L 14.000 12.000"),
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
                pathData = parseSvgPathData("M 14.000 5.500 C 14.000 4.672 14.672 4.000 15.500 4.000 C 16.328 4.000 17.000 4.672 17.000 5.500 L 17.000 12.000"),
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
        return _handThreeFingers!!
    }

private var _handThreeFingers: ImageVector? = null
