package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartPulseFill: ImageVector
    get() {
        if (_heartPulseFill != null) return _heartPulseFill!!
        _heartPulseFill = remixIcon(
            name = "HeartPulseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.5 3C19.538 3 22 5.5 22 9c0 7-7.5 11-10 12.5C10.022 20.313 4.916 17.563 2.868 13h4.698l.934-1.556 3 5L13.566 13h3.434v-2h-4.566l-.934 1.556-3-5L6.434 11 2.21 11C2.074 10.363 2 9.696 2 9 2 5.5 4.5 3 7.5 3 9.36 3 11 4 12 5 13 4 14.64 3 16.5 3Z"),
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
        return _heartPulseFill!!
    }

private var _heartPulseFill: ImageVector? = null
