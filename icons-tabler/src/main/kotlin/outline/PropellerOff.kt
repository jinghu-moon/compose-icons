package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PropellerOff: ImageVector
    get() {
        if (_propellerOff != null) return _propellerOff!!
        _propellerOff = tablerOutlineIcon(
            name = "PropellerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.448 10.432 C 9.385 11.076 8.829 12.308 9.049 13.531 C 9.270 14.754 10.222 15.714 11.443 15.946 C 12.664 16.177 13.901 15.632 14.554 14.575"),
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
                pathData = parseSvgPathData("M 14.272 10.272 C 14.932 8.813 15.330 7.384 15.470 5.986 C 15.690 4.356 14.708 3.000 12.000 3.000 C 10.060 3.000 9.000 3.696 8.645 4.690M 9.342 9.343 C 9.487 9.727 9.651 10.113 9.833 10.500"),
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
                pathData = parseSvgPathData("M 13.169 16.751 C 14.139 18.146 15.226 19.274 16.426 20.137 C 17.446 20.926 18.691 20.990 19.834 19.849M 21.313 17.356 C 21.805 15.722 21.123 14.630 19.897 14.127 C 19.077 13.757 18.194 13.473 17.247 13.275"),
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
                pathData = parseSvgPathData("M 8.664 13.000 C 6.971 13.143 5.451 13.520 4.104 14.128 C 2.582 14.751 1.898 16.281 3.252 18.626 C 4.606 20.971 6.272 21.143 7.573 20.138 C 8.773 19.275 9.860 18.147 10.831 16.752"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _propellerOff!!
    }

private var _propellerOff: ImageVector? = null
