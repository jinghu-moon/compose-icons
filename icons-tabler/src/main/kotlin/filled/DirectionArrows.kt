package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DirectionArrows: ImageVector
    get() {
        if (_directionArrows != null) return _directionArrows!!
        _directionArrows = tablerFilledIcon(
            name = "DirectionArrows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 L 2.004 11.720 C 2.152 6.327 6.570 2.000 12.000 2.000M 11.707 15.293 C 11.315 14.914 10.691 14.919 10.305 15.305 C 9.919 15.691 9.914 16.315 10.293 16.707 L 11.293 17.707 C 11.684 18.097 12.316 18.097 12.707 17.707 L 13.707 16.707 C 14.097 16.316 14.097 15.684 13.707 15.293 L 13.613 15.210 C 13.215 14.901 12.649 14.937 12.293 15.293 L 12.000 15.585 ZM 8.707 10.293 C 8.316 9.903 7.683 9.903 7.293 10.293 L 6.293 11.293 C 5.903 11.684 5.903 12.316 6.293 12.707 L 7.293 13.707 C 7.683 14.097 8.316 14.097 8.707 13.707 L 8.790 13.613 C 9.099 13.215 9.063 12.649 8.707 12.293 L 8.415 12.000 L 8.707 11.707 C 9.097 11.316 9.097 10.684 8.707 10.293M 16.707 10.293 C 16.316 9.903 15.684 9.903 15.293 10.293 L 15.210 10.387 C 14.901 10.785 14.937 11.351 15.293 11.707 L 15.585 11.999 L 15.293 12.293 C 14.914 12.685 14.919 13.309 15.305 13.695 C 15.691 14.081 16.315 14.086 16.707 13.707 L 17.707 12.707 C 18.097 12.316 18.097 11.684 17.707 11.293 ZM 12.707 6.293 C 12.316 5.903 11.684 5.903 11.293 6.293 L 10.293 7.293 C 9.903 7.683 9.903 8.316 10.293 8.707 L 10.387 8.790 C 10.785 9.099 11.351 9.063 11.707 8.707 L 12.000 8.415 L 12.293 8.707 C 12.685 9.086 13.309 9.081 13.695 8.695 C 14.081 8.309 14.086 7.685 13.707 7.293 Z"),
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
        return _directionArrows!!
    }

private var _directionArrows: ImageVector? = null
