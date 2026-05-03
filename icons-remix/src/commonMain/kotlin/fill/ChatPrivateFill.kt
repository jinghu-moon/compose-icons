package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatPrivateFill: ImageVector
    get() {
        if (_chatPrivateFill != null) return _chatPrivateFill!!
        _chatPrivateFill = remixIcon(
            name = "ChatPrivateFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 10.298 22.000 8.695 21.575 7.292 20.825 L 2.000 22.000 L 3.176 16.710 C 2.426 15.306 2.000 13.703 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 7.000 C 10.402 7.000 9.000 8.340 9.000 10.000 L 9.000 11.000 L 8.000 11.000 L 8.000 16.000 L 16.000 16.000 L 16.000 11.000 L 15.000 11.000 L 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000 ZM 14.000 13.000 L 14.000 14.000 L 10.000 14.000 L 10.000 13.000 L 14.000 13.000 ZM 12.000 9.000 C 12.476 9.000 13.000 9.490 13.000 10.000 L 13.000 11.000 L 11.000 11.000 L 11.000 10.000 C 11.000 9.490 11.487 9.000 12.000 9.000 Z"),
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
        return _chatPrivateFill!!
    }

private var _chatPrivateFill: ImageVector? = null
