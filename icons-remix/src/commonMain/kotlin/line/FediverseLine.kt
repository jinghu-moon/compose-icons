package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FediverseLine: ImageVector
    get() {
        if (_fediverseLine != null) return _fediverseLine!!
        _fediverseLine = remixIcon(
            name = "FediverseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 11.500 L 11.000 8.232 L 8.170 9.866 L 7.170 8.134 L 10.000 6.500 L 7.170 4.866 L 8.170 3.134 L 11.000 4.768 L 11.000 1.500 L 13.000 1.500 L 13.000 4.768 L 15.830 3.134 L 16.830 4.866 L 14.000 6.500 L 16.830 8.134 L 15.830 9.866 L 13.000 8.232 L 13.000 11.500 L 11.000 11.500 ZM 21.460 12.884 L 18.629 14.518 L 18.629 11.250 L 16.629 11.250 L 16.629 14.518 L 13.799 12.884 L 12.799 14.616 L 15.629 16.250 L 12.799 17.884 L 13.799 19.616 L 16.629 17.982 L 16.629 21.250 L 18.629 21.250 L 18.629 17.982 L 21.459 19.616 L 22.459 17.884 L 19.629 16.250 L 22.460 14.616 L 21.460 12.884 ZM 7.371 17.982 L 7.371 21.250 L 5.371 21.250 L 5.371 17.982 L 2.541 19.615 L 1.541 17.883 L 4.371 16.250 L 1.541 14.616 L 2.541 12.884 L 5.371 14.517 L 5.371 11.250 L 7.371 11.250 L 7.371 14.517 L 10.201 12.884 L 11.201 14.616 L 8.371 16.250 L 11.201 17.883 L 10.201 19.615 L 7.371 17.982 Z"),
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
        return _fediverseLine!!
    }

private var _fediverseLine: ImageVector? = null
