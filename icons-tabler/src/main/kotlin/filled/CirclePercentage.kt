package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CirclePercentage: ImageVector
    get() {
        if (_circlePercentage != null) return _circlePercentage!!
        _circlePercentage = tablerFilledIcon(
            name = "CirclePercentage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 2.004 11.720 C 2.152 6.327 6.570 2.000 12.000 2.000M 15.000 14.120 C 14.448 14.120 14.000 14.568 14.000 15.120 L 14.000 15.135 C 14.000 15.687 14.448 16.135 15.000 16.135 C 15.552 16.135 16.000 15.687 16.000 15.135 L 16.000 15.120 C 16.000 14.568 15.552 14.120 15.000 14.120M 15.707 8.368 C 15.316 7.978 14.684 7.978 14.293 8.368 L 8.293 14.368 C 7.914 14.760 7.919 15.384 8.305 15.770 C 8.691 16.156 9.315 16.161 9.707 15.782 L 15.707 9.782 C 16.097 9.392 16.097 8.759 15.707 8.368M 9.000 8.105 C 8.448 8.105 8.000 8.553 8.000 9.105 L 8.000 9.120 C 8.000 9.672 8.448 10.120 9.000 10.120 C 9.552 10.120 10.000 9.672 10.000 9.120 L 10.000 9.105 C 10.000 8.553 9.552 8.105 9.000 8.105"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _circlePercentage!!
    }

private var _circlePercentage: ImageVector? = null
