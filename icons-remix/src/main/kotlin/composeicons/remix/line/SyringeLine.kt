package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SyringeLine: ImageVector
    get() {
        if (_syringeLine != null) return _syringeLine!!
        _syringeLine = remixIcon(
            name = "SyringeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.678 7.979 20.264 9.393 18.142 7.272 16.021 9.393l3.536 3.536-1.414 1.414-.707-.707L11.071 20h-5.657L3.293 22.121 1.879 20.707 4 18.586v-5.657L10.364 6.565 9.657 5.858 11.071 4.444l3.536 3.536L16.728 5.858 14.607 3.737 16.021 2.322l5.657 5.657ZM16.021 12.222 11.778 7.979 10.364 9.393l2.121 2.121-1.414 1.414L8.95 10.808 7.536 12.222l2.121 2.121L8.243 15.757 6.122 13.636l-.121 .121v4.243h4.243l5.778-5.778Z"),
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
        return _syringeLine!!
    }

private var _syringeLine: ImageVector? = null
