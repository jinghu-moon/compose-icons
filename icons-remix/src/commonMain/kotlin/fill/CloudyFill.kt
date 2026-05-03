package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CloudyFill: ImageVector
    get() {
        if (_cloudyFill != null) return _cloudyFill!!
        _cloudyFill = remixIcon(
            name = "CloudyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.000 20.986 C 4.538 20.727 1.000 17.027 1.000 12.500 C 1.000 7.806 4.806 4.000 9.500 4.000 C 12.543 4.000 15.213 5.599 16.715 8.003 C 20.205 8.117 23.000 10.982 23.000 14.500 C 23.000 17.922 20.356 20.726 17.000 20.981 L 17.000 21.000 L 9.000 21.000 L 9.000 20.986 Z"),
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
        return _cloudyFill!!
    }

private var _cloudyFill: ImageVector? = null
