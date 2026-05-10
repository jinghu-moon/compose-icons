package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MotorbikeFill: ImageVector
    get() {
        if (_motorbikeFill != null) return _motorbikeFill!!
        _motorbikeFill = remixIcon(
            name = "MotorbikeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.365 10 11.2 8h3.491L13.6 5h-2.6v-2h4l1.092 3h3.908v3h-2.816l1.457 4.002c2.42 .074 4.36 2.059 4.36 4.498C23 19.985 20.985 22 18.5 22 16.015 22 14 19.985 14 17.5c0-1.828 1.09-3.401 2.655-4.106L15.419 10h-.948l-1.582 5.87L9.965 16.939c.023 .184 .035 .371 .035 .561C10 19.985 7.985 22 5.5 22 3.015 22 1 19.985 1 17.5 1 15.541 2.252 13.874 4 13.256v-1.256h-2v-2h6.365ZM5.5 20C6.881 20 8 18.881 8 17.5 8 16.119 6.881 15 5.5 15 4.119 15 3 16.119 3 17.5 3 18.881 4.119 20 5.5 20ZM18.5 20C19.881 20 21 18.881 21 17.5 21 16.119 19.881 15 18.5 15 17.119 15 16 16.119 16 17.5 16 18.881 17.119 20 18.5 20Z"),
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
        return _motorbikeFill!!
    }

private var _motorbikeFill: ImageVector? = null
