package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronRight: ImageVector
    get() {
        if (_circleChevronRight != null) return _circleChevronRight!!
        _circleChevronRight = tablerFilledIcon(
            name = "CircleChevronRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000M 11.707 8.293 C 11.316 7.903 10.684 7.903 10.293 8.293 L 10.210 8.387 C 9.901 8.785 9.937 9.351 10.293 9.707 L 12.585 12.000 L 10.293 14.293 C 9.914 14.685 9.919 15.309 10.305 15.695 C 10.691 16.081 11.315 16.086 11.707 15.707 L 14.707 12.707 C 15.097 12.316 15.097 11.684 14.707 11.293 Z"),
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
        return _circleChevronRight!!
    }

private var _circleChevronRight: ImageVector? = null
