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
                pathData = parseSvgPathData("M9 20.986C4.538 20.727 1 17.027 1 12.5 1 7.806 4.806 4 9.5 4c3.043 0 5.713 1.599 7.215 4.003C20.205 8.117 23 10.982 23 14.5c0 3.422-2.644 6.226-6 6.481v.019h-8v-.014Z"),
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
