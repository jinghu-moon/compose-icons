package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FireLine: ImageVector
    get() {
        if (_fireLine != null) return _fireLine!!
        _fireLine = remixIcon(
            name = "FireLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 23.000 C 16.142 23.000 19.500 19.642 19.500 15.500 C 19.500 14.634 19.270 13.803 19.000 13.030 C 17.333 14.677 16.067 15.500 15.200 15.500 C 19.195 8.500 17.000 5.500 11.000 1.500 C 11.500 6.500 8.204 8.774 6.862 10.037 C 5.408 11.405 4.500 13.346 4.500 15.500 C 4.500 19.642 7.858 23.000 12.000 23.000 ZM 12.709 5.235 C 15.951 7.985 15.967 10.122 13.463 14.509 C 12.702 15.842 13.665 17.500 15.200 17.500 C 15.888 17.500 16.584 17.299 17.319 16.905 C 16.698 19.262 14.552 21.000 12.000 21.000 C 8.962 21.000 6.500 18.538 6.500 15.500 C 6.500 13.961 7.133 12.528 8.232 11.493 C 8.358 11.375 8.997 10.808 9.025 10.784 C 9.449 10.402 9.798 10.066 10.143 9.697 C 11.373 8.379 12.257 6.916 12.709 5.235 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _fireLine!!
    }

private var _fireLine: ImageVector? = null
