package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ZoomPan: ImageVector
    get() {
        if (_zoomPan != null) return _zoomPan!!
        _zoomPan = tablerFilledIcon(
            name = "ZoomPan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 8.000 C 13.436 8.000 14.761 8.769 15.474 10.015 C 16.186 11.262 16.176 12.794 15.447 14.031 L 17.707 16.293 C 18.086 16.685 18.081 17.309 17.695 17.695 C 17.309 18.081 16.685 18.086 16.293 17.707 L 14.031 15.447 C 12.794 16.176 11.262 16.186 10.015 15.474 C 8.769 14.761 8.000 13.436 8.000 12.000 L 8.005 11.800 C 8.112 9.671 9.869 8.000 12.000 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 11.293 1.293 C 11.684 0.903 12.316 0.903 12.707 1.293 L 14.707 3.293 C 14.967 3.544 15.071 3.916 14.980 4.266 C 14.888 4.615 14.615 4.888 14.266 4.980 C 13.916 5.071 13.544 4.967 13.293 4.707 L 12.000 3.415 L 10.707 4.707 C 10.351 5.063 9.785 5.099 9.387 4.790 L 9.293 4.707 C 8.903 4.317 8.903 3.683 9.293 3.293 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 19.293 9.293 C 19.684 8.903 20.316 8.903 20.707 9.293 L 22.707 11.293 C 23.097 11.684 23.097 12.316 22.707 12.707 L 20.707 14.707 C 20.315 15.086 19.691 15.081 19.305 14.695 C 18.919 14.309 18.914 13.685 19.293 13.293 L 20.585 12.000 L 19.293 10.707 C 18.937 10.351 18.901 9.785 19.210 9.387 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 3.293 9.293 C 3.544 9.033 3.916 8.929 4.266 9.020 C 4.615 9.112 4.888 9.385 4.980 9.734 C 5.071 10.084 4.967 10.456 4.707 10.707 L 3.415 12.000 L 4.707 13.293 C 5.063 13.649 5.099 14.215 4.790 14.613 L 4.707 14.707 C 4.317 15.097 3.683 15.097 3.293 14.707 L 1.293 12.707 C 0.903 12.316 0.903 11.684 1.293 11.293 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 9.293 19.293 C 9.684 18.903 10.316 18.903 10.707 19.293 L 12.000 20.585 L 13.294 19.293 C 13.650 18.937 14.216 18.901 14.614 19.210 L 14.708 19.293 C 15.098 19.684 15.098 20.316 14.708 20.707 L 12.708 22.707 C 12.318 23.097 11.684 23.097 11.294 22.707 L 9.294 20.707 C 8.904 20.316 8.904 19.684 9.294 19.293"),
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
        return _zoomPan!!
    }

private var _zoomPan: ImageVector? = null
