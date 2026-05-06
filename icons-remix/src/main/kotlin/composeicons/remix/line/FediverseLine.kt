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
                pathData = parseSvgPathData("M11 11.5v-3.268L8.17 9.866 7.17 8.134 10 6.5 7.17 4.866 8.17 3.134l2.83 1.634v-3.268h2v3.268L15.83 3.134l1 1.732L14 6.5l2.83 1.634-1 1.732L13 8.232v3.268h-2ZM21.46 12.884l-2.83 1.634v-3.268h-2v3.268L13.799 12.884l-1 1.732 2.83 1.634-2.83 1.634 1 1.732 2.83-1.634v3.268h2v-3.268l2.83 1.634 1-1.732L19.629 16.25l2.83-1.634-1-1.732ZM7.371 17.982v3.268h-2v-3.268L2.541 19.615 1.541 17.883 4.371 16.25 1.541 14.616l1-1.732 2.83 1.634v-3.268h2v3.268l2.83-1.634 1 1.732L8.371 16.25l2.83 1.634-1 1.732L7.371 17.982Z"),
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
