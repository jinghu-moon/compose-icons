package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WashHand: ImageVector
    get() {
        if (_washHand != null) return _washHand!!
        _washHand = tablerOutlineIcon(
            name = "WashHand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.486 8.965 C 3.654 8.985 3.826 8.998 4.000 9.000 C 4.790 9.009 5.539 8.822 6.000 8.500 C 6.426 8.204 6.777 8.000 7.500 8.000 L 8.500 8.000"),
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
                pathData = parseSvgPathData("M 16.000 8.000 L 16.615 8.034 C 17.167 8.101 17.661 8.264 18.000 8.500 C 18.461 8.822 19.210 9.009 20.000 9.000 C 20.170 9.000 20.339 8.986 20.503 8.966"),
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
                pathData = parseSvgPathData("M 14.000 10.500 L 14.586 11.078 C 15.158 11.580 16.014 11.580 16.586 11.078 C 17.062 10.645 17.136 9.966 16.762 9.456 L 15.000 7.000 C 14.630 6.494 13.669 6.000 13.000 6.000 L 9.883 6.000 C 9.379 6.000 8.954 6.376 8.891 6.876 L 8.392 10.862 C 8.164 12.687 9.255 14.419 11.000 15.000 C 11.695 15.231 12.459 15.115 13.053 14.686 C 13.647 14.258 14.000 13.570 14.000 12.838 L 14.000 10.500"),
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
                pathData = parseSvgPathData("M 3.000 6.000 L 4.721 16.329 C 4.882 17.293 5.716 18.000 6.694 18.000 L 17.306 18.000 C 18.284 18.000 19.118 17.293 19.279 16.329 L 21.000 6.000"),
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
        return _washHand!!
    }

private var _washHand: ImageVector? = null
